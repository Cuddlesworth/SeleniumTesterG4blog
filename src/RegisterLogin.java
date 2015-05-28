
import com.sun.org.apache.xml.internal.security.c14n.helper.C14nHelper;
import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
public class RegisterLogin {

    private  WebDriver driver;

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









    @Test
    public void test_blog_register_new_function () throws InterruptedException {
        driver.get(Constants.BLOG_URL);
        driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(2) > a")).click();

        driver.findElement(By.cssSelector("#log_in_form > div:nth-child(7) > input.btn.btn-success.btn-lg.animated.flip")).click();

        WebElement userName =driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(1) > div.inner-addon.left-addon.col-md-4 > input"));
        userName.sendKeys("Richard12322");

        WebElement eMail =driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(2) > div.inner-addon.left-addon.col-md-4 > input"));
        eMail.sendKeys("richardhansson232322@gmail.com");

        WebElement password=driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(3) > div.inner-addon.left-addon.col-md-4 > input"));
        password.sendKeys("test");

        WebElement confirmPassword=driver.findElement(By.cssSelector(("#sign_up_form > div:nth-child(4) > div.inner-addon.left-addon.col-md-4 > input")));
        confirmPassword.sendKeys("test");

        WebElement realName=driver.findElement(By.cssSelector(("#sign_up_form > div:nth-child(5) > div:nth-child(2) > input")));
        realName.sendKeys("Richard");

        WebElement choseGender=driver.findElement(By.cssSelector(("#gender > option:nth-child(2)")));
        choseGender.click();

        WebElement chooseCountry=driver.findElement(By.cssSelector("#country > option:nth-child(196)"));
        chooseCountry.click();

        WebElement signUp=driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(10) > input"));
        signUp.click();

        driver.findElement(By.cssSelector("#information > input[type=\"submit\"]:nth-child(26)")).click();

        Thread.sleep(10000);
    }


    @Test
    public void test_blog_register_function_obligatoriskafalt_must_Be_filled () throws InterruptedException {
        driver.get(Constants.BLOG_URL);
        //Loggin
        driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(2) > a > i")).click();
        //signup
        driver.findElement(By.cssSelector("#log_in_form > div:nth-child(7) > input.btn.btn-success.btn-lg.animated.flip")).click();

        WebElement userName =driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(1) > div.inner-addon.left-addon.col-md-4 > input"));
        userName.sendKeys("Richard");

        WebElement eMail =driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(2) > div.inner-addon.left-addon.col-md-4 > input"));
        eMail.sendKeys("");

        WebElement password=driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(3) > div.inner-addon.left-addon.col-md-4 > input"));
        password.sendKeys("test");

        WebElement confirmPassword=driver.findElement(By.cssSelector(("#sign_up_form > div:nth-child(4) > div.inner-addon.left-addon.col-md-4 > input")));
        confirmPassword.sendKeys("test");

        WebElement realName=driver.findElement(By.cssSelector(("#sign_up_form > div:nth-child(5) > div:nth-child(2) > input")));
        realName.sendKeys("Richard");

        WebElement choseGender=driver.findElement(By.cssSelector(("#gender > option:nth-child(2)")));
        choseGender.click();

        WebElement chooseCountry=driver.findElement(By.cssSelector("#country > option:nth-child(196)"));
        chooseCountry.click();

        WebElement signUp=driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(10) > input"));
        signUp.click();

        driver.findElement(By.cssSelector("#information > input[type=\"submit\"]:nth-child(26)")).click();

        Thread.sleep(10000);
    }


    @Test
    public void test_blog_registster_function_repeat_Password () throws InterruptedException {
        driver.get(Constants.BLOG_URL);
        //Loggin
        driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(2) > a > i")).click();
        //signup
        driver.findElement(By.cssSelector("#log_in_form > div:nth-child(7) > input.btn.btn-success.btn-lg.animated.flip")).click();

        WebElement userName =driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(1) > div.inner-addon.left-addon.col-md-4 > input"));
        userName.sendKeys("Richardfrqfwe");

        WebElement eMail =driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(2) > div.inner-addon.left-addon.col-md-4 > input"));
        eMail.sendKeys("jasfbasfa@hotmail.se");

        WebElement password=driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(3) > div.inner-addon.left-addon.col-md-4 > input"));
        password.sendKeys("test");

        WebElement confirmPassword=driver.findElement(By.cssSelector(("#sign_up_form > div:nth-child(4) > div.inner-addon.left-addon.col-md-4 > input")));
        confirmPassword.sendKeys("thj");

        WebElement realName=driver.findElement(By.cssSelector(("#sign_up_form > div:nth-child(5) > div:nth-child(2) > input")));
        realName.sendKeys("Richard");

        WebElement choseGender=driver.findElement(By.cssSelector(("#gender > option:nth-child(2)")));
        choseGender.click();

        WebElement chooseCountry=driver.findElement(By.cssSelector("#country > option:nth-child(196)"));
        chooseCountry.click();

        WebElement signUp=driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(10) > input"));
        signUp.click();



        Thread.sleep(10000);
    }

    @Test
    public void test_blog_register_non_obligatoriska_feilds_not_required () throws InterruptedException {
        driver.get(Constants.BLOG_URL);
        //Loggin
        driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(2) > a > i")).click();
        //signup
        driver.findElement(By.cssSelector("#log_in_form > div:nth-child(7) > input.btn.btn-success.btn-lg.animated.flip")).click();

        WebElement userName =driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(1) > div.inner-addon.left-addon.col-md-4 > input"));
        userName.sendKeys("Richardfrqfwe");

        WebElement eMail =driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(2) > div.inner-addon.left-addon.col-md-4 > input"));
        eMail.sendKeys("jasfbasfa@hotmail.se");

        WebElement password=driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(3) > div.inner-addon.left-addon.col-md-4 > input"));
        password.sendKeys("test");

        WebElement confirmPassword=driver.findElement(By.cssSelector(("#sign_up_form > div:nth-child(4) > div.inner-addon.left-addon.col-md-4 > input")));
        confirmPassword.sendKeys("test");


        WebElement signUp=driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(10) > input"));
        signUp.click();



        Thread.sleep(10000);
    }

    @Test public void loop_login_logout_stress_test () throws InterruptedException {

        driver.get(Constants.BLOG_URL);

        for (int i=0; i<50 ; i++) {
            WebElement userName =driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(2) > a"));
                    userName.click();
            Thread.sleep(1000);

            WebElement userNameKeys =driver.findElement(By.cssSelector("#log_in_form > div:nth-child(1) > div.inner-addon.left-addon.col-md-4 > input"));
            userNameKeys.sendKeys("qwerty");

            WebElement userPasswordKeys =driver.findElement(By.cssSelector("#log_in_form > div:nth-child(3) > div.inner-addon.left-addon.col-md-4 > input"));
            userPasswordKeys.sendKeys("qwerty");

            WebElement clickLoginButton= driver.findElement(By.cssSelector("#log_in_form > div:nth-child(7) > input.btn.btn-primary.btn-lg.animated.flip"));
            clickLoginButton.click();

            WebElement clickLogoutButton= driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(4) > a > i > b"));
            clickLogoutButton.click();
            Thread.sleep(1000);








        }

    }




}