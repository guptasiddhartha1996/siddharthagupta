const {test, expect}=require('@playwright/test')

test('Datepicker', async ({page})=>{

    await page.goto('https://testautomationpractice.blogspot.com/')
    //await page.locator('id=datepicker').fill('03/02/2025')

    //date picker
    const year="2022"
    const month="April"
    const date="13"

    await page.locator('id=datepicker').click()

    while(true)
    {
        const currentmonth=await page.locator("//span[@class='ui-datepicker-month']").textContent()
        const currentyear=await page.locator("//span[@class='ui-datepicker-year']").textContent()
    
        if(currentyear==year && currentmonth==month )
        {
            break;
    
        }
        await page.locator('[title="Next"]').click()

    }
    const dates=await page.$$('.ui-state-default')

    //date selection using loop
    // for(const dt of dates)
    // {
    //     if(await dt.textContent()==date)
    //     {
    //         await dt.click();
    //         break;
    //     }
    // }

    //date selection without loop
    await page.click(`//a[@class='ui-state-default'][text()='${date}']`)
 




    await page.waitForTimeout(5000)
    


})