package testScrept;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.CommonUtility;



@Listeners(genericLib.ListnerImplementation.class)
	public class ActiCustomerCreationTest  extends BaseClass {
		@Test
		//(groups= {"smoke"})
		public void createCustomer() throws IOException 
		{
			driver=new ChromeDriver();
			CommonUtility cu=new CommonUtility();
			int num=cu.getRandom();
			driver.findElement(By.id("container_tasks")).click();
			driver.findElement(By.className("downIcon")).click();
			driver.findElement(By.cssSelector(".item.createNewCustomer")).click();
			driver.findElement(By.className("newNameField")).sendKeys(du.getDtaFromExcelsheet("Sheet1",0,0)+num);
			driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("xyz");
			driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		}
}
