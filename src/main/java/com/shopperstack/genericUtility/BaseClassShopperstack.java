package com.shopperstack.genericUtility;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.shopperstack.objectRepository.LoginPageShopperstack;
import com.shopperstack.objectRepository.WelcomePageShopperstack;
@Listeners(ImplementationClassShopperstack.class)
public class BaseClassShopperstack {
	public static WebDriver driver;
	public WelcomePageShopperstack wlcmShop;
	public LoginPageShopperstack lpShop;
	public FileUtilityShopperstack propShop;
	public ExcelUtilityShopperstack excelLib;
	public WebDriverUtilityShopperstack webdriverLib;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		driver=new ChromeDriver();
		propShop=new FileUtilityShopperstack();
		String url = propShop.getDataFromProperties("url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		Assert.assertEquals(driver.getTitle(),"ShoppersStack", "Login page not displayed");
	}
	@BeforeMethod
	public void login() throws IOException
	{
		wlcmShop=new WelcomePageShopperstack(driver);
		lpShop=new LoginPageShopperstack(driver);
		String email = propShop.getDataFromProperties("email");
		String password = propShop.getDataFromProperties("password");
		lpShop.getLoginLink().click();
		Assert.assertEquals(driver.getTitle(),"ShoppersStack | Login","Login page not displayed");
		lpShop.getEmailTextField().sendKeys(email);
		lpShop.getPasswordtextField().sendKeys(password);
		lpShop.getLoginButton().click();	
	}
	@AfterMethod
	public void logout()
	{
		wlcmShop=new WelcomePageShopperstack(driver);
		wlcmShop.getAccountSetting().click();
		wlcmShop.getLogoutButton().click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
