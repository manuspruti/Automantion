package genericLib;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import elementRepository.LoginLocators;

public class BaseClass {
	public WebDriver driver;
	public DataUtility du=new DataUtility();
	static WebDriver Listnerdriver;
	@BeforeClass(alwaysRun=true)
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		}
	@Parameters({"username","password"})
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException
	{
		driver.get(du.getDatafromProperties("URL"));
		LoginLocators ll=new LoginLocators(driver);
		ll.loginApp(du.getDatafromProperties("username"), du.getDatafromProperties("password"));
		//driver.findElement(By.name("username")).sendKeys(username);
		//driver.findElement(By.name("pwd")).sendKeys(password);
		//driver.findElement(By.name("remember")).click();
		//driver.findElement(By.id("loginButton")).click();
	}
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}

}
