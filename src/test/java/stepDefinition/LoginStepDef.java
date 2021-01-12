package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import cucumber


//import cucumber.api.

//import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPageObjects;

public class LoginStepDef {
    public WebDriver driver;
    public LoginPageObjects lgnPage;

    @Given("user launches chrome browser")
    public void userLaunchesChromeBrowser() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers/chromedriver" );
        driver= new ChromeDriver();
        lgnPage = new LoginPageObjects(driver);
    }

    @When("user opens URL {string}")
    public void userOpensURL(String URL) {
       driver.get(URL);
    }

    @And("user enter username {string}")
    public void userEnterUsername(String userName) {
        lgnPage.setUsername(userName);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        lgnPage.setPassword(password);
    }

    @And("user clicks on button {string}")
    public void userClicksOnButton(String btnLogin) {
        lgnPage.clickLogin();
    }

    @Then("page opens and it has title {string}")
    public void pageOpensAndItHasTitle(String title) {
        if(driver.getPageSource().contains("Login was unsuccessful")){
            driver.close();
            Assert.assertTrue(false);
        }else
            //Assert.assertTrue(title.equals(driver.getTitle()));
        Assert.assertTrue((driver.getTitle()).contains(title));
    }

    @And("user clicks on link {string}")
    public void userClicksOnLink(String logout) {
        lgnPage.clickLogout();
    }

    @Then("user closes the browser")
    public void userClosesTheBrowser() {
    }


}
