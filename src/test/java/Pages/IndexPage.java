package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage{
    public IndexPage(WebDriver driver){
        //this.driver = driver;
        //elementMethods = new ElementMethods(this.driver);
        //trebuie sa initializam elementele de pe pagina
        //PageFactory.initElements(driver, this);

        super(driver);

    }

    //elementele specifice acestei pagini
    @FindBy(id = "btn1")
    private WebElement signInElement;
    @FindBy(id = "btn2")
    private WebElement skipSignInElement;

    //metodele specifice acestei clase
    public void clickSignIn(){elementMethods.clickElement(signInElement);}
    public void clickSkipSignIn(){elementMethods.clickElement(skipSignInElement);}
}
