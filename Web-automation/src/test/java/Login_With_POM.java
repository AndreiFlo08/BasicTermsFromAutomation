import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Messages;
import utils.Properties;

public class Login_With_POM extends BaseTest{

    @Test
    public void loginTest() throws InterruptedException {
        page.headerPage.clickMyAccountLink();
        page.loginPage.enterUsername(Properties.USERNAME);
        page.loginPage.enterPassword(Properties.PASSWORD);
        page.loginPage.clickLoginButton();

        Assertions.assertEquals(Messages.welcomeMessage,page.loginPage.getWelcomeMessage());
        Thread.sleep(3000);
    }

    @Test
    public void invalidUserNameTest() throws InterruptedException {
        page.headerPage.clickMyAccountLink();
        page.loginPage.enterUsername(Properties.wrongUSERNAME);
        page.loginPage.enterPassword(Properties.PASSWORD);
        page.loginPage.clickLoginButton();

        Assertions.assertEquals(Messages.invalidUsernameMessage,page.loginPage.getErrorMessage());
        Thread.sleep(3000);
    }



    }

