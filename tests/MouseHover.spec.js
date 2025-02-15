const {test, expect}=require('@playwright/test')

test('mousehover', async({page})=>{
    await page.goto('https://demo.opencart.com.gr/')
    const desktops=await page.locator("//a[text()='Desktops']")
    const macbook=await page.locator("//a[text()='Mac (1)']")

    //mouse hover
    await desktops.hover()
    await macbook.hover()


    await page.waitForTimeout(5000)
})