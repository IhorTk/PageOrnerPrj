package KlassWork.pages.plain;

import KlassWork.context.TestContext;
import KlassWork.pages.BasePage;
import KlassWork.pages.InternalPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class PlainMainPage extends InternalPage {

    public PlainMainPage(TestContext context) {
        super(context);
    }
    @CacheLookup//Opasno
    @FindBy(css = ".btn_inventory")
    public List<WebElement> addToCartButtonA;

    @FindBy(how = How.XPATH, using = "//input")
    public WebElement inputA;

    @FindBys({@FindBy(css = "id"), @FindBy(xpath = "//input[@id='ad'")})//AND
    public WebElement elementBysA;

    @FindAll({@FindBy(css = "id"), @FindBy(xpath = "//input[@id='ad'")})// OR
    public List<WebElement> elementAllA;


}
