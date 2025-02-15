const {test, expect}=require('@playwright/test')

test('draganddrop', async ({page})=>{
    await page.goto('http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html')
    const rome=await page.locator('id=box6')
    const italy=await page.locator('id=box106')

    // //Approach 1 drag and drop
    // await rome.hover()
    // await page.mouse.down()

    // await italy.hover()
    // await page.mouse.up()

    //Approach 2
    await rome.dragTo(italy)

    //Washington to US
    const washingotn=await page.locator('id=box3')
    const us=await page.locator('id=box103')

    await washingotn.dragTo(us)





    await page.waitForTimeout(5000)



})