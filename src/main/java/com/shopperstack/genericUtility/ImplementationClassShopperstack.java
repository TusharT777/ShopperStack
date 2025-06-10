package com.shopperstack.genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ImplementationClassShopperstack extends BaseClassShopperstack implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		JavaUtilityShopperstack ju= new JavaUtilityShopperstack();
		String methodname= result.getName();
		Reporter.log("-----------TestScript Failed-----------",true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+methodname+ju.getSystemTime()+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
