package Tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import base.Hooks;

public class WindowTest extends Hooks {
    public void windowsTest() {
        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToWindowPage();

        WindowPage windowPage = new WindowPage(getDriver());
        windowPage.dealWithTab(1);
        windowPage.dealWithWindow(1);
        windowPage.dealWithMultipleTab(2);




        // ElementMethods elementMethods = new ElementMethods(Driver);

        // PageMethods pageMethods = new PageMethods(Driver);

        // TabMethods tabMethods = new TabMethods(Driver);

        //  WebElement skipSignInElement = Driver.findElement(By.id("btn2"));
        //  elementMethods.clickElement(skipSignInElement);

        //String expectedPage = "Register";
        // String actualPage = Driver.getTitle();
        //assertTrue("The expected page was not diplayed", expectedPage.equals(actualPage));

        // WebElement switchElement = Driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        // Actions action = new Actions(Driver);   //obiect fac cu mouse orice
        //action.moveToElement(switchElement).build().perform();
        //  elementMethods.hoverElement(switchElement);


        // WebElement alertsElement = Driver.findElement(By.xpath("//a[text()='Windows']"));
        //alertsElement.click();
        // elementMethods.clickElement(alertsElement);

        //  Driver.navigate().to("http://demo.automationtesting.in/Windows.html");

        // List<WebElement> windowsList = //Driver.findElements(By.cssSelector(".analystic"));

        //windowsList.get(0).click();
        //WebElement newTabElement = Driver.findElement(By.cssSelector("#Tabbed>a>button")); //diez se foloseste pt css
        //newTabElement.click();
        // elementMethods.clickElement(newTabElement);

        // List<String> TabList = new ArrayList<>(Driver.getWindowHandles());
        // Driver.switchTo().window(TabList.get(1)); // ma mut pe al 2-lea tab
        // System.out.println(Driver.getTitle());
        //  Driver.switchTo().window(TabList.get(0)); // ma mut pe primul tab
        // System.out.println(Driver.getTitle());



        // windowsList.get(1).click();
        //  WebElement newSeparateElement = Driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        //newSeparateElement.click();
        // elementMethods.clickElement(newSeparateElement);

        // List<String> WindowList =new ArrayList<>(Driver.getWindowHandles());
        // Driver.switchTo().window(WindowList.get(1)); //
        // System.out.println(Driver.getTitle());
        // Driver.close();
        // Driver.switchTo().window(WindowList.get(0));
        //  System.out.println(Driver.getTitle());


        // windowsList.get(2).click();
        // WebElement separateMultipleElement = Driver.findElement(By.cssSelector("#Multiple>button"));
        //separateMultipleElement.click();
        // elementMethods.clickElement(separateMultipleElement);

        // List<String> MultList =new ArrayList<>(Driver.getWindowHandles());
        // Driver.switchTo().window(MultList.get(2));
        // System.out.println(Driver.getTitle());
        // Driver.close();
        //  Driver.switchTo().window(MultList.get(1));
        //  System.out.println(Driver.getTitle());
        //  Driver.close();
        // Driver.switchTo().window(MultList.get(0));
        // System.out.println(Driver.getTitle());







        //Obiect= instanta unei clase
        // Constructor= initializeaza prop unei clase


        // Driver.getWindowHandles();
        // Driver.switchTo().defaultContent();


        //POM= Page object model
        //1. Actions
        //2. Elements
        //3. Input data


    }
}
