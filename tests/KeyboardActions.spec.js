const {test, expect}=require('@playwright/test')

test('keyboardactions', async ({page})=>{
    await page.goto('https://gotranscript.com/text-compare')

    await page.locator('[name="text1"]').fill('welcome to automation');
    
    //CTRL + A
    await page.keyboard.press('Meta+A')


    //CTRL + C
    await page.keyboard.press('Meta+C')

    //TAB
    await page.keyboard.down('Tab')
    await page.keyboard.up('Tab')


    //CTRL+V
    await page.keyboard.press('Meta+V')


    await page.waitForTimeout(5000)
    


})