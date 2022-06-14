package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class alertTest {
    public WebDriver Driver;

    @Test
    public void registerTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("http://demo.automationtesting.in/Index.html");
        Driver.manage().window().maximize();

        WebElement skipSignIn = Driver.findElement(By.id("btn2"));
        skipSignIn.click();

        String expectedPage = "Register";
        String actualPage = Driver.getTitle();
        Assert.assertTrue("The expected page was not displayed", expectedPage.equals(actualPage));

        WebElement switchElement = Driver.findElement(By.xpath("//a[text()='SwitchTo' ]"));
        Actions action = new Actions(Driver);
        action.moveToElement(switchElement).build().perform();

        WebElement alertsElement = Driver.findElement(By.xpath("//a[text()='Alerts' ]"));
        alertsElement.click();

        Driver.navigate().to("http://demo.automationtesting.in/Alerts.html");

        List<WebElement> alertList = Driver.findElements(By.cssSelector(".analystic"));
        alertList.get(0).click();
        WebElement simpleAlertElement = Driver.findElement(By.cssSelector(".btn btn-danger"));
        simpleAlertElement.click();
        Alert simpleAlert = Driver.switchTo().alert();
        simpleAlert.accept();

        alertList.get(1).click();
        WebElement alertButtonElement = Driver.findElement(By.cssSelector(".btn btn-primary"));
        alertButtonElement.click();
        Alert dismissAlert = Driver.switchTo().alert();
        String alertText = dismissAlert.getText();
        System.out.println("Alert text is" + alertText);
        dismissAlert.dismiss();
        WebElement cancelmessageElement = Driver.findElement(By.id("demo"));
        String expectedMessage= "You pressed cancel";
        String actualMessage = cancelmessageElement.getText();
        Assert.assertEquals("The same message", expectedMessage, actualMessage);


        alertList.get(2).click();
        WebElement promptElement = Driver.findElement(By.cssSelector(".btn btn-info"));
        promptElement.click();
        Alert promptAlert = Driver.switchTo().alert();
        String alertValue = "Roxana";
        promptAlert.sendKeys(alertValue);
        promptAlert.accept();
        WebElement textBoxElement = Driver.findElement(By.id("demo1"));
        String expectedTextBox= "You pressed cancel";
        String actualTextBox = textBoxElement.getText();
        Assert.assertEquals("The same message", expectedTextBox, actualTextBox);

    }
}
