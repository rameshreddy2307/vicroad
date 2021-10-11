package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SelectPermitTypePage extends BaseClass {
	
	public SelectPermitTypePage(WebDriver driver) {		
		super(driver);		
	}

	@FindBy(xpath="//p[contains(text(),'Step 2 of 7 : Select permit type')]")
	public WebElement Txt_PermitType ;
	
	@FindBy(css=".fn_showhide")
	WebElement Radiobuttion_SingleTrip ;
	
	@FindBy(xpath="//input[@id='ph_pagebody_0_phthreecolumnmaincontent_0_panel_From_SuburbText']")
	WebElement TxtField_From;
	
	@FindBy(xpath="//input[@id='ph_pagebody_0_phthreecolumnmaincontent_0_panel_To_SuburbText']")
	WebElement TxtField_To ;
	
	@FindBy(xpath="//input[@id='ph_pagebody_0_phthreecolumnmaincontent_0_panel_btnNext']")
	WebElement Button_Next;
	
	public void SelectPermitType() {
		
		Radiobuttion_SingleTrip.click();
		TxtField_From.clear();
		TxtField_From.sendKeys("3029");
		TxtField_To.sendKeys("3000");
		Button_Next.click();
	}
	
}
