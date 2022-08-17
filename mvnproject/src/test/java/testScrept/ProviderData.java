package testScrept;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProviderData {
	@Test(dataProvider="dataSupplier")
	public void login(String username,String password) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.id("loginButton")).click();
	}
	@DataProvider
	public Object dataSupplier()
	{
		Object [][] objarr=new Object[3][2];
		objarr[0][0]="admin";
		objarr[0][1]="manager";
		objarr[1][0]="admin1";
		objarr[1][1]="manager1";
		objarr[2][0]="admin2";
		objarr[2][1]="manager2";
		return objarr;
		
	}

}
