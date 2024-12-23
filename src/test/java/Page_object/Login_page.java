package Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

    WebDriver driver;

    @FindBy(id= "username")
    WebElement usernameField;

    @FindBy(id ="password")
    WebElement passworField;

    @FindBy(xpath="//button[@class='btn__primary--large from__button--floating']")
    WebElement clickbutton;


    public Login_page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

//Actions
    public void enterusername(String username){
       usernameField.sendKeys();
    }
    public void enterpassword(String password){
        passworField.sendKeys();
    }

    public void buttonclick(){
        clickbutton.click();

    }


}
