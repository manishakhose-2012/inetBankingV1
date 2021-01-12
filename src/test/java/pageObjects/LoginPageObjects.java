package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Unit test for simple App.
 */
public class LoginPageObjects
{

  public WebDriver lDriver;


  public LoginPageObjects(WebDriver rDriver){
    PageFactory.initElements(rDriver, this);
  }

  @FindBy(id="Email")
  WebElement txtUserName;

  @FindBy(id="Password")
  WebElement txtPassword;

  @FindBy(xpath="//input[@value= 'Log in']")
  WebElement btnLogin;

  @FindBy(xpath="/html/body/div[3]/div[1]/div/div/ul/li[3]/a")
  WebElement lnkLogout;

  public void setUsername(String usrName){
      txtUserName.clear();
      txtUserName.sendKeys(usrName);
  }
  public void setPassword(String password){
    txtPassword.clear();
    txtPassword.sendKeys(password);
  }
  public void clickLogin(){
    btnLogin.click();
  }

  public void clickLogout(){
    lnkLogout.click();
  }




}
