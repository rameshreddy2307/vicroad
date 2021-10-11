package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.UtilityMethods;

public class GetVehiclePermitPage extends BaseClass{
	
	public GetVehiclePermitPage(WebDriver driver) {		
		super(driver);		
	}

	WebDriver driver;
	
	public String url = "https://www.vicroads.vic.gov.au/registration/limited-use-permits/unregistered-vehicle-permits/get-an-unregistered-vehicle-permit";

	@FindBy(id="ph_pagebody_0_phthreecolumnmaincontent_0_panel_VehicleType_DDList")
	WebElement Vehicle_Type_DropDown;
	
	@FindBy(xpath = "//select[@id='ph_pagebody_0_phthreecolumnmaincontent_0_panel_PassengerVehicleSubType_DDList']")
	WebElement PassengerVehicle_Type_DropDown;
	
	@FindBy(id = "ph_pagebody_0_phthreecolumnmaincontent_0_panel_AddressLine_SingleLine_CtrlHolderDivShown")
	WebElement txt_Address_Vehicle_Garaged;
	
	@FindBy(xpath = "//body/form[@id='form1']/div[@id='outer-wrap']/div[@id='inner-wrap']/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[9]/div[1]/img[1]']")
	WebElement Select_Permit_Start_Date;
	
	@FindBy(id = "ph_pagebody_0_phthreecolumnmaincontent_0_panel_PermitDuration_DDList")
	WebElement Select_Permit_Duration;
	
	@FindBy(id = "ph_pagebody_0_phthreecolumnmaincontent_0_panel_PermitStartDate_Date")
	WebElement Select_Permit_StartDate;
		
	@FindBy(id = "ph_pagebody_0_phthreecolumnmaincontent_0_panel_btnCal")
	WebElement Button_Calculate;
	
	@FindBy(xpath = "//input[@name='ph_pagebody_0$phthreecolumnmaincontent_0$panel$btnNext']")
	WebElement Button_Next;
	
	public void CalculateFee() {
		
		UtilityMethods.SelectFromDropDown(Vehicle_Type_DropDown, "Passenger vehicle");
		UtilityMethods.SelectFromDropDown(PassengerVehicle_Type_DropDown, "Sedan");
		txt_Address_Vehicle_Garaged.sendKeys("6 Chantelle Pde, TARNEIT VIC 3029");
		UtilityMethods.SelectFromDropDown(Select_Permit_Duration, "5 days");
		Select_Permit_StartDate.clear();
		Select_Permit_StartDate.sendKeys("17/09/2021");
		Button_Calculate.click();
		Button_Next.click();
	}
	
}
