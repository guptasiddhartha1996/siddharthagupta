const {test, expect}=require('@playwright/test')

test('test', async({page})=>{
    await page.goto('https://www.demoblaze.com/index.html')

    await page.locator('#login2').click()
    await page.locator('#loginusername').fill('pavanol')
    await page.locator('#loginpassword').fill('test@123')
    await page.locator("//button[text()='Log in']").click()
    await expect(page.locator('#logout2')).toBeVisible()

    await page.waitForTimeout(5000)



})