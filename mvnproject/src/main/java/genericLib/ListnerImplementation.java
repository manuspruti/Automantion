package genericLib;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplementation implements ITestListener {

	
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot) BaseClass.Listnerdriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Listner/fail.png");
		try {
		FileUtils.copyFile(src,trg);
		}
		catch(IOException e) {
		e.printStackTrace();	
		}
	}

}