exports.HomePage=
class HomePage {

    constructor(page){
        this.page=page;
        this.productlist="//div[@id='tbodyid']/div/div//h4/a";
        this.addtocartbtn="//a[text()='Add to cart']";
        this.cart='#cartur';
    }

    async addProductToCart(productname)
    {
        const productlist=await this.page.$$(this.productlist)
        for(const product of productlist)
        {
            if(productname==await product.textContent())
            {
                await product.click();
                break;
            }
        }
        await this.page.on('dialog', async dialog=>{
            if(dialog.message().includes('added'))
            {
                await dialog.accept();
            }

        })
        await this.page.locator(this.addtocartbtn).click()
    }


    async gotoCart()
    {
        await this.page.locator(this.cart).click()
    }
}