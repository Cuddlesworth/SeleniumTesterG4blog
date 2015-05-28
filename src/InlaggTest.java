import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Richard on 2015-05-28.
 */
public class InlaggTest {

    private WebDriver driver;

    @Before
    public void setUp (){
        File file= new File(Constants.PATH_TO_CHROME_DRIVER);

        System.setProperty(Constants.CHROME_DRIVER,file.getAbsolutePath());
        driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @After
    public void tearDown(){
        driver.close();
    }

// kerv



    @Test
    public void create_50_posts () throws InterruptedException {

        driver.get(Constants.BLOG_URL);
        WebElement userName =driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(2) > a"));
        userName.click();
        Thread.sleep(1000);

        WebElement userNameKeys =driver.findElement(By.cssSelector("#log_in_form > div:nth-child(1) > div.inner-addon.left-addon.col-md-4 > input"));
        userNameKeys.sendKeys("qwerty");

        WebElement userPasswordKeys =driver.findElement(By.cssSelector("#log_in_form > div:nth-child(3) > div.inner-addon.left-addon.col-md-4 > input"));
        userPasswordKeys.sendKeys("qwerty");

        WebElement clickLoginButton= driver.findElement(By.cssSelector("#log_in_form > div:nth-child(7) > input.btn.btn-primary.btn-lg.animated.flip"));
        clickLoginButton.click();

        // LOOP för att göra 50 posts
        for (int x=1; x<50; x++) {

            WebElement writeTitel = driver.findElement(By.cssSelector("#blogTitle"));
            writeTitel.sendKeys("Test " + x);

            //Klicka på publish
            WebElement clickPublish = driver.findElement(By.cssSelector("#blog_editor > button"));
            clickPublish.click();
            Thread.sleep(1000);

        }
    }

}

