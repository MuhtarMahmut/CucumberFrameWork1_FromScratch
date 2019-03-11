package Steps;

import Pages.Elements;
import Utilities.Driver;
import Utilities.MyLibraray;
import Utilities.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks extends TestBase {

    @Before(order = 1)
    public void setup(){
        driver=Driver.getDriver();
        driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Before(order = 2)
    public void setup2(){
        act=new Actions(driver);
        wait=new WebDriverWait(driver,20);
        e=new Elements();
        mylib=new MyLibraray(driver);
    }

    @Before(order = 3)
    public void login(){

    }


    @After
    public void EndTask(Scenario result){
        if( result.isFailed()){
            TakesScreenshot ss=(TakesScreenshot) driver;
            result.embed(ss.getScreenshotAs(OutputType.BYTES),"image/png");
        }

        Driver.CloseDriver();

    }
}
