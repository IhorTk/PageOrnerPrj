package KlassWork.tests;

import KlassWork.context.TestContext;
import KlassWork.utils.ConfigurationReader;
import KlassWork.utils.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestBase {
    TestContext context;
    
    @BeforeEach
    public void beforEach(){
        context = new TestContext();
        context.driver = DriverFactory.get();
        context.wait = new WebDriverWait(context.driver, Duration.ofSeconds(Long.parseLong(ConfigurationReader.get(
                "timeout"))));
        context.actions = new Actions(context.driver);
        context.js = (JavascriptExecutor) context.driver;
    }
    @AfterEach
    public void afterEach(){
        if(context.driver !=null){
            context.driver.quit();
        }
    }
}
