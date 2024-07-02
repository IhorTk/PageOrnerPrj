package KlassWork.pages;

import KlassWork.actors.MainPageActor;
import KlassWork.context.TestContext;
import KlassWork.utils.ConfigurationReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    public LoginPage(TestContext context) {
        super(context);
    }
    @FindBy(css = ".error-message-container")
    public WebElement loginMessageContainer;

    @FindBy(css = "#user-name")
    public WebElement userNameInput;

    @FindBy(css = "#password")
    public WebElement passwordInput;

    @FindBy(css = "#login-button")
    public WebElement loginButton;

    public MainPage loginAsStandartUser(){
        return loginAs(ConfigurationReader.get("standard_login"),ConfigurationReader.get("password"));
    }
    public MainPage loginAs(String name, String password){
        login(name,password);
        return new MainPage(context);
    }
    public String inCorrectLoginAs(String username, String password){
        login(username, password);
        return loginMessageContainer.getText();
    }

    private void login(String login, String password) {
        userNameInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
    }



}
