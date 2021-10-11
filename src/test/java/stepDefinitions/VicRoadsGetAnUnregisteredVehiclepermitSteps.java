package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GetVehiclePermitPage;
import pageObjects.SelectPermitTypePage;


public class VicRoadsGetAnUnregisteredVehiclepermitSteps {
	
	WebDriver driver;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium down\\broswer driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.vicroads.vic.gov.au/registration/limited-use-permits/unregistered-vehicle-permits/get-an-unregistered-vehicle-permit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@When("User Calaculates the Fee")
	public void user_calaculates_the_fee() {
		
		GetVehiclePermitPage getVehiclePermitPage = new GetVehiclePermitPage(driver);
		getVehiclePermitPage.CalculateFee();
		
	}

	@Then("Verify {string} displayed")
	public void verify_displayed(String string) {
		
		SelectPermitTypePage selectPermitTypePage = new SelectPermitTypePage(driver);		
		String actual = selectPermitTypePage.Txt_PermitType.getText();
		Assert.assertEquals("Step 2 of 7 : Select permit type", actual);
		System.out.println("Step 2 of 7 : Select permit type");
	}

	@Then("Close browser")
	public void close_browser() {
		driver.quit();
	   
	}

}
