package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	
	public static void SelectFromDropDown(WebElement element, String text) {
		
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

}
