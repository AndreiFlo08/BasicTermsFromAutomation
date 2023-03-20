import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomepageTest extends BaseTest {
    @Test
    public void search(){
        page.headerPage.search("android");
        Assertions.assertEquals("Search Result for 'android' ~ Automation Practice Site", driver.getTitle());
    }

}
