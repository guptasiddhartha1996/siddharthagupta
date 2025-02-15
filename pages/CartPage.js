exports.CartPage=

class CartPage {

    constructor(page)
    {
        this.page=page;
        this.noofProducts="//tbody[@id='tbodyid']/tr/td[2]";

    }

    async checkProductInCart(productName)
    {
        const productsincart=await this.page.$$(this.noofProducts)
        for(const product of productsincart)
        {
            console.log(await product.textContent())
            if(productName==await product.textContent())
            {
                return true;
                break;
            }
        }
    }
}