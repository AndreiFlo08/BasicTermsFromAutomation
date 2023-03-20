package pages;

import driver.Element;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public LoginPage loginPage;
    public HeaderPage headerPage;
    public BasketPage basketPage;
    public ShopPage shopPage;
    public Element element;

    public BasePage(WebDriver driver) {
        loginPage = new LoginPage(driver);
        headerPage = new HeaderPage(driver);
        basketPage = new BasketPage(driver);
        shopPage = new ShopPage(driver);
        element = new Element(driver);

    }
}
