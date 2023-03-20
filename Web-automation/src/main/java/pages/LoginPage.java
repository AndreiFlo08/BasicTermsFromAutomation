package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    //Selector
    private final By usernameField =By.xpath( "//input[@name='username']");
    private final By passwordField = By.cssSelector("#password");
    private final By loginButton = By.xpath("//input[@name='login']");
    private final By welcomeMessage = By.xpath("//div[@class='woocommerce-MyAccount-content']/p[1]");
    private final By errorMessage = By.xpath("//div[@class = 'woocommerce']//li");



    //Methods

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);

    }
    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);

    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();

    }
    public String getWelcomeMessage(){
        return driver.findElement(welcomeMessage).getText();

    }
    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();

    }
    public void login(String userName, String password){
        enterUsername(userName);
        enterPassword(password);
        clickLoginButton();
    }

}
