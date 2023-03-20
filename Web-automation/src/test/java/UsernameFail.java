import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernameFail {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
        //instantiem un obiect din clasa ChromeDriver

        WebDriver driver = new ChromeDriver();
        // accesam site-ul pe care testam

        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");


        //asteptam 3 scunde
        Thread.sleep(3000);
        //localizam elementul MyAcount i
//        driver.findElement(By.id("menu-item-50")).click();
        //Test that we are redirected to my account page
        Assertions.assertEquals("https://practice.automationtesting.in/my-account/", driver.getCurrentUrl());
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("andrei.10@yahoo");
        //
        driver.findElement(By.cssSelector("#password")).sendKeys("Qpzmal123!");

        // click pe login
        driver.findElement(By.xpath("//input[@name='login']")).click();

        String expectedWelcomeMessage = "A user could not be found with this email address.";
        String actualMessage = driver.findElement(By.xpath("//div[@class = 'woocommerce']//li")).getText();
        Assertions.assertEquals(expectedWelcomeMessage,actualMessage);



        //inchidem site-ul
        driver.close();
        System.out.println("Execution completed");
    }
}
