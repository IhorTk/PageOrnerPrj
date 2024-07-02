package KlassWork.pages;

import KlassWork.context.TestContext;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage extends InternalPage{

    public MainPage(TestContext context) {
        super(context);
    }

    @FindBy(css = ".btn_inventory")
    public List<WebElement> addToCartButton;

    @FindBy(how = How.XPATH, using = "//input")
    public WebElement input;

    @FindBys({@FindBy(css = "id"), @FindBy(xpath = "//input[@id='ad'")})//AND
    public WebElement elementBys;

    @FindAll({@FindBy(css = "id"), @FindBy(xpath = "//input[@id='ad'")})// OR
    public List<WebElement> elementAll;

    public MainPage clickAllAddToCartButton(){
        Assertions.assertTrue(addToCartButton.get(0).isEnabled(), "Add to cart button at main page wasn't enabled!");
        addToCartButton.forEach(WebElement::click);
        return this;
    }



}
