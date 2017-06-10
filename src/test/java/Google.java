import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by User on 10.06.2017.
 */
public class Google extends DriverConfig {

    final String basicURL = "http://dumskaya.net/";

    @BeforeMethod
    public void beforeMethod() {
        driver.get(basicURL);
    }

    @Test
    public void searchNews1() throws InterruptedException {
        String news1 = driver.findElements(By.cssSelector("#newstr2 > td:nth-child(2)")).get(0).getText();
        System.out.println(news1);
        String news2 = driver.findElements(By.cssSelector("#newstr3 > td:nth-child(2)")).get(0).getText();
        System.out.println(news2);
        String news3 = driver.findElements(By.cssSelector("#newstr4 > td:nth-child(2)")).get(0).getText();
        System.out.println(news3);
        String news4 = driver.findElements(By.cssSelector("#newstr5 > td:nth-child(2)")).get(0).getText();
        System.out.println(news4);
        String news5 = driver.findElements(By.cssSelector("#newstr7 > td:nth-child(2)")).get(0).getText();
        System.out.println(news5);



    }

    @Test
    public void searchNews () throws InterruptedException {
        for (int i = 1; i <= 5; i++){
            String news = driver.findElements(By.cssSelector("[id*='news'] > td:not(.newsdatetd):not(.newsdateline")).get(i).getText();
            System.out.println(news);
        }



    }
}
