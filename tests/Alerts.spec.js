const {test, expect}=require('@playwright/test')

test.skip('alerts', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')

    page.on('dialog', async dialog=>{

        await expect(dialog.type()).toContain('alert')
        await expect(dialog.message()).toContain('I am an alert box!')
        await dialog.accept();
    })
    await page.locator('id=alertBtn').click();

    await page.waitForTimeout(5000)    
})

test.skip('confirmation alert', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')

    page.on('dialog', async dialog=>{

        await expect(dialog.type()).toContain('confirm')
        await expect(dialog.message()).toContain('Press a button!')
        await dialog.accept(); //close by using OK button
        //await dialog.dismiss();
    })
    await page.locator('id=confirmBtn').click();

    const text=await page.locator('id=demo')
    await expect(text).toHaveText('You pressed OK!')

    await page.waitForTimeout(5000)    
})

test('prompt alert', async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/')

    page.on('dialog', async dialog=>{

        await expect(dialog.type()).toContain('prompt')
        await expect(dialog.message()).toContain('Please enter your name:')
       await expect(dialog.defaultValue()).toContain('Harry Potter')


        await dialog.accept('John'); //close by using OK button
        //await dialog.dismiss();
    })
    await page.locator('id=promptBtn').click();

    const text=await page.locator('id=demo')
    await expect(text).toHaveText('Hello John! How are you today?')

    await page.waitForTimeout(5000)    
})