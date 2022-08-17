package testScrept;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.CommonUtility;

//import org.openqa.selenium.Alert;

public class AlertHandling extends BaseClass {
	@Test
	//(groups= {"smoke","system"})
	public void alertPop()
	{
		driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings")).click();
		driver.findElement(By.linkText("Types of Work")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.name("name")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
		CommonUtility cu=new CommonUtility();
		String msg=cu.getAlertmsg(driver);
		System.out.println(msg);
		cu.alertAccept(driver);
		
		
	
	}
}
