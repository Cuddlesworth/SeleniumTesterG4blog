import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Stresstest {

    private WebDriver driver;

    @Before
    public void setUp() {
        File file = new File(Constants.PATH_TO_CHROME_DRIVER);

        System.setProperty(Constants.CHROME_DRIVER, file.getAbsolutePath());
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void blog_login_test() throws InterruptedException {
        //open blog
        driver.get(Constants.BLOG_URL);

        int loopController = 0;
        int endLoop = 20;

        int userNumber = 0;
        int emailNumber = 0;

        while(loopController < endLoop) {


            //navigates to signup
            WebElement loginButton = driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(2) > a > i > b"));
            loginButton.click();

            Thread.sleep(1000);

            WebElement signupButton = driver.findElement(By.cssSelector("#log_in_form > div:nth-child(7) > input.btn.btn-success.btn-lg.animated.flip"));
            signupButton.click();

            //enters password
            WebElement inputPassword = driver.findElement(By.name("userPassword"));
            inputPassword.sendKeys("pass");

            WebElement inputConfirmPassword = driver.findElement(By.name("userPasswordConfirm"));
            inputConfirmPassword.sendKeys("pass");

            //Username and mail variables
            userNumber++;
            String username = "user" + Integer.toString(userNumber);

            emailNumber ++;
            String email = "user" + Integer.toString(emailNumber) + "@user.com";

            //enters username and mail using varables
            WebElement inputUser = driver.findElement(By.name("userName"));
            inputUser.sendKeys(username);

            WebElement inputEmail = driver.findElement(By.name("email"));
            inputEmail.sendKeys(email);

            //finishes signup and logs out
            WebElement signupConfirm = driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(10) > input"));
            signupConfirm.click();

            WebElement logoutButton = driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(4) > a > i > b"));
            logoutButton.click();

            loopController++;
            Thread.sleep(1000);

        }

        Thread.sleep(10000);
    }

    @Test
    public void admin_delete_user_test() throws InterruptedException {
        //open blog
        driver.get(Constants.BLOG_URL);

        WebElement loginButton = driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(2) > a > i > b"));
        loginButton.click();

        WebElement signupButton = driver.findElement(By.cssSelector("#log_in_form > div:nth-child(1) > div.inner-addon.left-addon.col-md-4 > input"));
        signupButton.click();

        Thread.sleep(1000);



    }



}