const {test, expect}=require('@playwright/test')

test('mousedoubleclick', async ({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')

    const btncopy=await page.locator("//button[text()='Copy Text']")

    //double click
    await btncopy.dblclick()
    const f2=await page.locator('id=field2')
    await expect(f2).toHaveValue('Hello World!')

    await page.waitForTimeout(5000)
})