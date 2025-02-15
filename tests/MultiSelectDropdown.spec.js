const {test, expect}=require('@playwright/test')
const exp = require('constants')

test('multiselectdropdown', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')
    //await page.selectOption('#colors',['Blue', 'Red', 'Yellow'])
    // const options = await page.locator('#colors option')
    // await expect(options).toHaveCount(7)
//    const options=await page.$$('#colors option')
//    await expect(options.length).toBe(7);

const content=await page.locator('#colors').textContent()
//await expect(content.includes('Black')).toBeTruthy()
await expect(content.includes('Black')).toBeFalsy()












    await page.waitForTimeout(5000);
})