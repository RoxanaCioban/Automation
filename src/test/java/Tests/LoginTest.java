package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public WebDriver Driver;

    @Test
    public void MetodaLogin(){
        // setam diverul de chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        //deschidem un brower de chrome
        Driver =new ChromeDriver();
        // accesam un URL
        Driver.get("http://demo.automationtesting.in/Index.html");

        //identificam butonul sign in
        WebElement SignInElement = Driver.findElement(By.id("btn1"));
        SignInElement.click();

        //identificam butonul de email
        WebElement EmailElement = Driver.findElement(By.xpath("//input[@placeholder='E mail']"));
        String EmailValue = "abc@yahoo.com";
        EmailElement.sendKeys(EmailValue);

        // identificam butonul parola
        WebElement PasswordElement = Driver.findElement(By.xpath("//input[@placeholder='Password']"));
        String PasswordValue = "parola";
        PasswordElement.sendKeys(PasswordValue);

        WebElement EnterInElement = Driver.findElement(By.id("enterbtn"));
        EmailElement.click();

    }
}
