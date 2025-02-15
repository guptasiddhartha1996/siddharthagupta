const {test, expect}=require('@playwright/test')

test('Table', async({page})=>{
   await page.goto('https://testautomationpractice.blogspot.com/')
   const table=await page.locator('id=productTable')
   //total number of rows and columns
   const columns=await  table.locator('thead tr th')
   console.log('Number of columns: ', await columns.count())
   expect(await columns.count()).toBe(4)

   const rows=await table.locator('tbody tr')
   console.log('Number of rows: ', await rows.count())
   expect(await rows.count()).toBe(5)

   //select checkbox for Smartwatch
//    const matchedrow=await rows.filter({
//     has:page.locator('td'),
//     hasText:'Smartwatch'
//    })
//    await matchedrow.locator('input').check()

   //select multiple products by re-usable function
//    await selectProduct(rows, page, 'Smartphone')
//    await selectProduct(rows, page, 'Tablet')
//    await selectProduct(rows, page, 'Wireless Earbuds')


    //print all product details using loop
    // for(let i=0;i<await rows.count();i++)
    // {
    //     const row=rows.nth(i);
    //     const tds=row.locator('td')
    //     for(let j=0;j<await tds.count()-1;j++)
    //     {
    //         console.log(await tds.nth(j).textContent())


    //     }

    // }

    //read data from all the pages in the table
    const pages=await page.locator('.pagination li a')
    console.log('Number of pages in the table: ',await pages.count())

    for(let p=0;p<await pages.count();p++)
    {
        if(p>0)
        {
            await pages.nth(p).click()
        }
        for(let i=0;i<await rows.count();i++)
            {
                const row=rows.nth(i);
                const tds=row.locator('td')
                for(let j=0;j<await tds.count()-1;j++)
                {
                    console.log(await tds.nth(j).textContent())
        
        
                }
        
            }
        


    }


   await page.waitForTimeout(5000)

})

async function selectProduct(rows, page, name)
{
    const matchedrow=await rows.filter({
        has:page.locator('td'),
        hasText:name
       })
       await matchedrow.locator('input').check()

}