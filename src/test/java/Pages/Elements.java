package Pages;

import Utilities.Driver;
import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends TestBase {

    public Elements(){
        PageFactory.initElements(driver , this);
    }


public @FindBy(xpath = ".//input[@class='gLFyf gsfi' and @type='text']")
    WebElement GoogleSearch;

  public  @FindBy(xpath = ".//input[@type='text' and @id='twotabsearchtextbox']")
  WebElement AmazonSearch;


}
