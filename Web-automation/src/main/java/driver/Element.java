package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Element {
    WebDriver driver;

    public Element(WebDriver driver){
        this.driver = driver;
    }
    public  void waitElementPresent(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void click(By locator) {
        waitElementPresent(locator);
        driver.findElement(locator).click();
    }
    public  void fillText(By locator, String text){
        waitElementPresent(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
    public String getText(By locator){
        waitElementPresent(locator);
        return driver.findElement(locator).getText();

    }
}
