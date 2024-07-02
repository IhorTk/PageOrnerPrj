package KlassWork.tests;

import KlassWork.pages.LoginPage;
import KlassWork.utils.ConfigurationReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTests extends TestBase{
    @Test
    public void successLoginTest(){
        context.driver.get(ConfigurationReader.get("base_url"));
        Assertions.assertTrue(new LoginPage(context)
                .loginAsStandartUser()
                .getFooterText()
                .contains("Sauce Labs"));
    }

    @Test
    public void emptyLoginTest(){
        context.driver.get(ConfigurationReader.get("base_url"));

        Assertions.assertEquals("Epic sadface: Username is required",
                new LoginPage(context).inCorrectLoginAs("",""));
    }
}
