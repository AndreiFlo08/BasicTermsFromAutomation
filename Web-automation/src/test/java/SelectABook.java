import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class SelectABook {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addExtensions(new File(".\\src\\main\\resources\\AdBlock-—-best-ad-blocker.crx"));
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, option);
        WebDriver driver = new ChromeDriver(option);



        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");
        Thread.sleep(3);
        Assertions.assertEquals("https://practice.automationtesting.in/my-account/", driver.getCurrentUrl());
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("andrei.10@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("Qpzmal123!");
        driver.findElement(By.xpath("//input[@name='login']")).click();
        driver.findElement(By.xpath("//li[@id = 'menu-item-40']")).click();
        driver.findElement(By.xpath("//a[@data-product_id = '165']//a[@data-product_id = '165']")).click();
        driver.findElement(By.xpath("//span[@class = 'cartcontents']")).click();
        driver.findElement(By.xpath("- //a[@class = 'checkout-button button alt wc-forward']")).click();



        driver.close();

    }
}
