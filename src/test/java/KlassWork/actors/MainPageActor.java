package KlassWork.actors;

import KlassWork.context.TestContext;
import KlassWork.pages.MainPage;
import KlassWork.pages.plain.PlainMainPage;
import org.junit.jupiter.api.Assertions;

public class MainPageActor {
    PlainMainPage pmp;
    TestContext context;

    public MainPageActor(TestContext context){
    this.context=context;
    pmp = new PlainMainPage(context);
    }

    public MainPageActor assertFooterContainsA(String expectedText){
        Assertions.assertTrue(pmp.footer.getText().contains(expectedText));
        return this;
    }
    public String getFooterTextA(){
        return pmp.getFooterText();
    }
}
