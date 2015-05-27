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
public class AdminPanelTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        File file = new File(Constants.PATH_TO_CHROME_DRIVER);

        System.setProperty(Constants.CHROME_DRIVER, file.getAbsolutePath());
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @After
    public void tearDown() {
        driver.close();
    }



    @Test
    public void test_admin_remove_userName () throws InterruptedException {
        driver.get(Constants.BLOG_URL);


        driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(2) > a > i > b")).click();

        driver.findElement(By.cssSelector("#log_in_form > div:nth-child(7) > input.btn.btn-success.btn-lg.animated.flip")).click();

        WebElement userName =driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(1) > div.inner-addon.left-addon.col-md-4 > input"));
        userName.sendKeys("abcdf");

        WebElement eMail =driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(2) > div.inner-addon.left-addon.col-md-4 > input"));
        eMail.sendKeys("abcdf@hotmail.com");

        WebElement password=driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(3) > div.inner-addon.left-addon.col-md-4 > input"));
        password.sendKeys("abcdf");

        WebElement confirmPassword=driver.findElement(By.cssSelector(("#sign_up_form > div:nth-child(4) > div.inner-addon.left-addon.col-md-4 > input")));
        confirmPassword.sendKeys("abcdf");

        WebElement realName=driver.findElement(By.cssSelector(("#sign_up_form > div:nth-child(5) > div:nth-child(2) > input")));
        realName.sendKeys("abcdf");

        WebElement choseGender=driver.findElement(By.cssSelector(("#gender > option:nth-child(2)")));
        choseGender.click();

        WebElement chooseCountry=driver.findElement(By.cssSelector("#country > option:nth-child(196)"));
        chooseCountry.click();

        WebElement iAccept=driver.findElement(By.cssSelector("#sign_up_form > div:nth-child(10) > input"));
        iAccept.click();



        WebElement logoutFromCreatedUser=driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(4) > a > i > b"));
        logoutFromCreatedUser.click();





        // FÖR ATT TABORT KONTOT MED ADMINPANELEN
        WebElement clickLoginButton = driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(2) > a > i > b"));
        clickLoginButton.click();

        WebElement enterAdminUser=driver.findElement(By.cssSelector("#log_in_form > div:nth-child(1) > div.inner-addon.left-addon.col-md-4 > input"));
        enterAdminUser.sendKeys("admin");

        WebElement enterAdminPassword=driver.findElement(By.cssSelector("#log_in_form > div:nth-child(3) > div.inner-addon.left-addon.col-md-4 > input"));
        enterAdminPassword.sendKeys("admin");

        WebElement clickLogInButton=driver.findElement(By.cssSelector("#log_in_form > div:nth-child(7) > input.btn.btn-primary.btn-lg.animated.flip"));
        clickLogInButton.click();

        WebElement searchForExistingUser=driver.findElement(By.cssSelector("#admin_panel > div:nth-child(1) > div.inner-addon.right-addon.col-md-6 > input"));
        searchForExistingUser.sendKeys("abcdf");

        WebElement clickSearchButton=driver.findElement(By.cssSelector("#admin_panel > div:nth-child(1) > div:nth-child(3) > input"));
        clickSearchButton.click();

        WebElement inputExistingUserNameToDelete=driver.findElement(By.cssSelector("#delete_user_record"));
        inputExistingUserNameToDelete.sendKeys("abcdf");

        WebElement clickDeleteButton=driver.findElement(By.cssSelector("#execute_form > div:nth-child(2) > div:nth-child(3) > input"));
        clickDeleteButton.click();


        Thread.sleep(10000);



    }
    @Test
    public void test_admin_remove_userEmail () throws InterruptedException {
        driver.get(Constants.BLOG_URL);

        driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(3) > a")).click();

        driver.findElement(By.cssSelector("body > form:nth-child(4) > div > input[type=\"submit\"]")).click();

        WebElement userName =driver.findElement(By.cssSelector("#information > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=\"text\"]"));
        userName.sendKeys("asdfgh");

        WebElement eMail =driver.findElement(By.cssSelector("#information > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=\"email\"]"));
        eMail.sendKeys("asdfgh@gmail.com");

        WebElement password=driver.findElement(By.cssSelector("#information > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=\"password\"]"));
        password.sendKeys("test");

        WebElement confirmPassword=driver.findElement(By.cssSelector(("#information > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=\"password\"]")));
        confirmPassword.sendKeys("test");

        WebElement realName=driver.findElement(By.cssSelector(("#information > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=\"text\"]")));
        realName.sendKeys("asdfgh");

        WebElement choseGender=driver.findElement(By.cssSelector(("#information > table > tbody > tr:nth-child(6) > td:nth-child(2) > select > option:nth-child(2)")));
        choseGender.click();

        WebElement chooseCountry=driver.findElement(By.cssSelector("#information > table > tbody > tr:nth-child(8) > td:nth-child(2) > select > option:nth-child(196)"));
        chooseCountry.click();

        WebElement iAccept=driver.findElement(By.cssSelector("#information > input[type=\"radio\"]:nth-child(22)"));
        iAccept.click();

        driver.findElement(By.cssSelector("#information > input[type=\"submit\"]:nth-child(26)")).click();

        WebElement logoutFromCreatedUser=driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(4) > a"));
        logoutFromCreatedUser.click();







       //TA BORT ANVÄNDARE MED ADMINPANELEN
        WebElement clickLoginButton = driver.findElement(By.cssSelector("#navbar-collapse-3 > ul > li:nth-child(3) > a"));
        clickLoginButton.click();

        WebElement enterAdminUser=driver.findElement(By.cssSelector("body > form:nth-child(3) > div:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > input"));
        enterAdminUser.sendKeys("admin");

        WebElement enterAdminPassword=driver.findElement(By.cssSelector("body > form:nth-child(3) > div:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > input"));
        enterAdminPassword.sendKeys("admin");

        WebElement clickLogInButton=driver.findElement(By.cssSelector("body > form:nth-child(3) > div:nth-child(3) > input[type=\"submit\"]"));
        clickLogInButton.click();

        WebElement searchForExistingUser=driver.findElement(By.cssSelector("body > form > div > input[type=\"text\"]:nth-child(1)"));
        searchForExistingUser.sendKeys("asdfgh@gmail.com");

        WebElement clickSearchButton=driver.findElement(By.cssSelector("body > form > div > input[type=\"submit\"]:nth-child(2)"));
        clickSearchButton.click();

        WebElement inputExistingUserNameToDelete=driver.findElement(By.cssSelector("body > div:nth-child(2) > form:nth-child(4) > input[type=\"text\"]:nth-child(2)"));
        inputExistingUserNameToDelete.sendKeys("asdfgh");

        WebElement clickDeleteButton=driver.findElement(By.cssSelector("body > div:nth-child(2) > form:nth-child(4) > input[type=\"submit\"]:nth-child(3)"));
        clickDeleteButton.click();

        Thread.sleep(10000);




    }

}



