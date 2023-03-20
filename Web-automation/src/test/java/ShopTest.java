import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Properties;

public class ShopTest extends BaseTest {

    @Test
    public void addToBasket() throws InterruptedException {
        page.headerPage.clickShopLink();
        String bookTitle = page.shopPage.getBookTitle();
        page.shopPage.clickAddToBasket();
        Assertions.assertTrue(page.shopPage.isViewBascketLinkDisplayed());
        page.shopPage.clickViewBasketLink();
        Assertions.assertEquals(Properties.BASE_URL + "basket/", driver.getCurrentUrl());
        Assertions.assertTrue(driver.getTitle().contains("Basket"));
        Assertions.assertEquals(bookTitle, page.basketPage.getProductName());
    }
//    @Test
//    public void deleteBasket(){
//        page.headerPage.clickShopLink();
//        String bookTitle = page.shopPage.getBookTitle();
//        page.shopPage.clickAddToBasket();
//        Assertions.assertTrue(page.shopPage.isViewBascketLinkDisplayed());
//        page.shopPage.clickViewBasketLink();
//        Assertions.assertEquals(Properties.BASE_URL + "basket/", driver.getCurrentUrl());
//        Assertions.assertTrue(driver.getTitle().contains("Basket"));
//        Assertions.assertEquals(bookTitle, page.basketPage.getProductName());
//
//    }

}
