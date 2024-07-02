package KlassWork.tests;

import KlassWork.actors.LoginActor;
import KlassWork.pages.LoginPage;
import KlassWork.utils.ConfigurationReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorLoginTests extends TestBase{
    @Test
    public void successLoginTest(){
        context.driver.get(ConfigurationReader.get("base_url"));
        Assertions.assertTrue(new LoginActor(context)
                .loginAsStandartUser()
                .getFooterTextA()
                .contains("Sauce Labs"));
    }

   @Test
    public  void successLoginInternalAssertTest(){
        context.driver.get(ConfigurationReader.get("base_url"));
        new LoginActor(context)
                .loginAsStandartUser()
                .assertFooterContainsA("Sauce Labs");
   }

}
