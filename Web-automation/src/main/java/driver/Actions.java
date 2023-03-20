package driver;

import org.openqa.selenium.WebDriver;

public class Actions {
    WebDriver driver;

    public Actions(WebDriver driver) {
        this.driver = driver;
    }
    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getURL() {
        return  driver.getCurrentUrl();
    }
}
