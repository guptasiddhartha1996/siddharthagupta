const {test, expect}=require('@playwright/test')

test('Dropdowns', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')

   // await page.locator('id=country').selectOption({label:'India'}) //label visible text
    await page.locator('id=country').selectOption({value:'uk'})
    await page.waitForTimeout(5000)
})