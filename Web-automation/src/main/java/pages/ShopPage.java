package pages;

import driver.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopPage {
    WebDriver driver;
    Element element;

    public ShopPage(WebDriver driver){
        this.driver=driver;
        element = new Element(driver);


    }

    //Selector
    private By addToBasketButton = By.xpath("//a[@data-product_id = '165']");
    private By viewBasketlink = By.xpath("//a[@title = 'View Basket']");
    private By addToCartBookTitle = By.xpath("//a[@data-product_id=165]/preceding-sibling::a/h3");
    private By deleteToBasketv = By.xpath("//a[@class = 'remove']");


    //Methods

    public void clickAddToBasket(){
//        driver.findElement(addToBasketButton).click();
        element.click(addToBasketButton);
    }
    public Boolean isViewBascketLinkDisplayed(){
        element.waitElementPresent(viewBasketlink);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(viewBasketlink));
        return driver.findElement(viewBasketlink).isDisplayed();

    }
    public void clickViewBasketLink(){
//        driver.findElement(viewBasketlink).click();
        element.click(viewBasketlink);
    }
    public String getBookTitle(){
//        return driver.findElement(addToCartBookTitle).getText();
        return element.getText(addToCartBookTitle);
    }

}
