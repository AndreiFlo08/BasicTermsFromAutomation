import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class ChromeTest {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
//        //instantiem un obiect din clasa ChromeDriver
//
//        WebDriver driver = new ChromeDriver();
//        // accesam site-ul pe care testam
//
//
//        driver.get("https://practice.automationtesting.in/");
//        driver.manage().window().maximize();
//        //asteptam 3 scunde
//        Thread.sleep(3000);
//        //inchidem site-ul
//        driver.close();
//        System.out.println("Execution completed");
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addExtensions(new File(".\\src\\main\\resources\\AdBlock-—-best-ad-blocker.crx"));
        option.addArguments("--remote-allow-origins=*");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, option);
        WebDriver driver = new ChromeDriver(option);

        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/");
        String[] handles = driver.getWindowHandles().toArray(new String[0]);
        driver.switchTo().window(handles[0]);


        //inchidem browser-ul
        driver.quit();
        System.out.println("Execution complete!");
    }

}
