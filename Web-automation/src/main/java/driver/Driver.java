package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class Driver {
    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addExtensions(new File(".\\src\\main\\resources\\AdBlock-—-best-ad-blocker.crx"));
        option.addArguments("--remote-allow-origins=*");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, option);
        WebDriver driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        return driver;
    }

    }

