package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OrangeHRMApplicationMethods {

	public static WebDriver driver;
	public String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

@Given("^user should Launch the Edge Browser$")
public void user_should_Launch_the_Edge_Browser()  {
	
	
	System.setProperty("webdriver.edge.driver", "./DriverFiles/chromedriver.exe");
	driver=new EdgeDriver();
   
}


@When("^user enters OrangeHRM App URL address$")
public void user_enters_OrangeHRM_App_URL_address() 
{
    driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	
}
@Then("^user should be validate the login page$")
public void user_should_be_validate_the_login_page()  {
    
	String expected_LoginPageTitle="OrangeHRM";
	String actual_LoginPageTitle=driver.getTitle();	
	Assert.assertEquals("Title not Matched - FAIL", expected_LoginPageTitle, actual_LoginPageTitle);
}

@When("^user enter Username and password and click on LoginButton$")
public void user_enter_Username_and_password_and_click_on_LoginButton() 
{
	driver.findElement(By.id("txtUsername")).sendKeys("ALavanya19");
	driver.findElement(By.id("txtPassword")).sendKeys("ALavanya@19");
	driver.findElement(By.id("btnLogin")).click();

}

@When("^user enter \"([^\"]*)\" and \"([^\"]*)\" and click on LoginButton$")
public void user_enter_and_and_click_on_LoginButton(String Username, String Password)  {

	driver.findElement(By.id("txtUsername")).sendKeys(Username);
	driver.findElement(By.id("txtPassword")).sendKeys(Password);
	driver.findElement(By.id("btnLogin")).click();

}



@Then("^user should navigated to Homepage of OrangeHRM application$")
public void user_should_navigated_to_Homepage_of_OrangeHRM_application() 
{

	String actual_WelcomeAdminText=driver.findElement(By.linkText("Welcome Admin")).getText();
	String expected_WelcomeAdminText="Welcome Admin";
	Assert.assertEquals("WelcomeAdmin Text is not Matched - FAIL", expected_WelcomeAdminText, actual_WelcomeAdminText);
	
}


@Then("^user should close the OrangeHRM application$")
public void user_should_close_the_OrangeHRM_application()  {
    
	
	driver.quit();
}

	
}
