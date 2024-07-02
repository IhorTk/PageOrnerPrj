package KlassWork.pages.plain;

import KlassWork.context.TestContext;
import KlassWork.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlainLoginPage extends BasePage {


    public PlainLoginPage(TestContext context) {
        super(context);
    }
    @FindBy(css = ".error-message-container")
    public WebElement loginMessageContainerA;

    @FindBy(css = "#user-name")
    public WebElement userNameInputA;

    @FindBy(css = "#password")
    public WebElement passwordInputA;

    @FindBy(css = "#login-button")
    public WebElement loginButtonA;
}
