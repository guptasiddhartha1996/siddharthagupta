const {test,expect}=require('@playwright/test')

test('SoftAssertions', async ({page})=>{
    await page.goto('https://www.demoblaze.com/index.html')

    //Hard Assertions
    // await expect(page).toHaveTitle('STORE');
    // await expect(page).toHaveURL('https://www.demoblaze.com/index.html')
    // const pic=await page.locator('id=nava')
    // await expect(pic).toBeVisible();

    //Soft Assertions
    await expect.soft(page).toHaveTitle('STORE123')
    await expect.soft(page).toHaveURL('https://www.demoblaze.com/index.html')
    const pics=await page.locator('id=nava')
    await expect.soft(pics).toBeVisible();




})