package genericLib;


import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility {
	public int getRandom()
	{
		Random r=new Random();
		int num=r.nextInt(1000);
		return num;
	}
	public String getAlertmsg(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		return msg;
	}
	public void alertAccept(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
	}
	public void getSelectVisibleText(WebElement dropdown, String VisibleText) {
		Select s = new Select(dropdown);
		s.selectByVisibleText(VisibleText);
	}
}
