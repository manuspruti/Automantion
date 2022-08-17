package testScrept;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.CommonUtility;



public class ActiDropDown extends BaseClass {
	@Test
	//(groups= {"system"})
	public void settings()
	{
	driver.findElement(By.className("popup_menu_button_settings")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Manage system settings')]/..")).click();
	WebElement dropdown = driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
	CommonUtility cu=new CommonUtility();
	cu.getSelectVisibleText(dropdown,"Product");
	String result=driver.findElement(By.id("FormModifiedTextCell")).getText();
	System.out.println(result);
	}
}
