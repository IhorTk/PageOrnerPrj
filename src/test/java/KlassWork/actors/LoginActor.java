package KlassWork.actors;

import KlassWork.context.TestContext;
import KlassWork.pages.plain.PlainLoginPage;
import KlassWork.utils.ConfigurationReader;

public class LoginActor {
    TestContext context;
    PlainLoginPage plp;

    public LoginActor(TestContext context){
        this.context=context;
        plp=new PlainLoginPage(context);
    }

    public MainPageActor loginAsStandartUser(){
        return loginAsA(ConfigurationReader.get("standard_login"),ConfigurationReader.get("password"));
    }

    public MainPageActor loginAsA(String name, String password){
        loginA(name,password);
        return new MainPageActor(context);
    }

    public String inCorrectLoginAsA(String username, String password){
        loginA(username, password);
        return plp.loginMessageContainerA.getText();
    }



    private void loginA(String login, String password) {
        plp.userNameInputA.sendKeys(login);
        plp.passwordInputA.sendKeys(password);
        plp.loginButtonA.click();
    }

}
