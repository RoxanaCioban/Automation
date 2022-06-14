package Tests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseTest {

    public WebDriver Driver;

    @Test
    public void MetodaLogin(){
        /* setam diverul de chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        //deschidem un brower de chrome
        Driver =new ChromeDriver();
        // accesam un URL
        Driver.get("http://demo.automationtesting.in/Index.html");

        //maximize page
        Driver.manage().window().maximize();*/

        //identificam butonul sign in
        WebElement SignInElement = Driver.findElement(By.id("btn1"));
        SignInElement.click();

        //validam pagina de login

        String expectedPage = "SignIn";
        String actualPage = Driver.getTitle();
        Assert.assertEquals("The expected page was displayed", expectedPage, actualPage);

        //identificam butonul de email
        WebElement EmailElement = Driver.findElement(By.xpath("//input[@placeholder='E mail']"));
        String EmailValue = "abc@yahoo.com";
        EmailElement.sendKeys(EmailValue);

        // identificam butonul parola
        WebElement PasswordElement = Driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String PasswordValue = "parola";
        PasswordElement.sendKeys(PasswordValue);

        WebElement EnterElement = Driver.findElement(By.id("enterbtn"));
        EnterElement.click();

        //validam mesaj de eroare
        WebElement messageElement = Driver.findElement(By.id("errormsg"));
        String expectedError= "Invalid User Name or PassWord";
        String actualError= messageElement.getText();
        Assert.assertEquals("Text of the error displyed is not correct", expectedError, actualError);

        //inchidem pagina
        /*Driver.close();*/
        /*Driver.quit();*/
        // Diferenta intre close si quit: close inchide cate un tab si quit inchide toate paginile deodata
    }
}
