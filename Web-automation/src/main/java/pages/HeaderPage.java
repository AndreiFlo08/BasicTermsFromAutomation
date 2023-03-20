package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {
    WebDriver driver;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    //Selectors
    public final By shopLink = By.id("menu-item-40");
    private final By myAccountLink = By.id("menu-item-50");
    public final By searchField = By.xpath("//input[@name = 's']");



    //Methods
    public void clickMyAccountLink() {
        driver.findElement(myAccountLink).click();
    }
    public void clickShopLink(){
        driver.findElement(shopLink).click();
    }

    public void search(String searchCriteria) {
        driver.findElement(searchField).sendKeys(searchCriteria);

    }



}