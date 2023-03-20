package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    WebDriver driver;
    public BasketPage(WebDriver driver) {
        this.driver=driver;
    }
    public By productName = By.xpath("//td[@class='product-name']");


    public String getProductName(){
        return driver.findElement(productName).getText();
    }
}
