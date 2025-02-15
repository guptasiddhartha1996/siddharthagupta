const {test, expect}=require('@playwright/test')

test('autosuggestdropdown', async ({page})=>{
    await page.goto('https://www.redbus.in/')
    await page.locator('id=src').fill('Delhi')
   await page.waitForSelector("//li[contains(@class,'sc-iwsKbI')]/div/text[1]")
   const options=await page.$$("//li[contains(@class,'sc-iwsKbI')]/div/text[1]")
   for(let option of options)
   {
        const value=await option.textContent();
        //console.log(value)
        if(value.includes('Mayur Vihar'))
        {
            await option.click()
            break;
        }
   }

   await page.waitForTimeout(5000)
})