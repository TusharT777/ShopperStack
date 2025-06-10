package com.shopperstack.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageShopperstack {
	public LoginPageShopperstack(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "loginBtn")
	private WebElement loginLink;
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordtextField;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[text()='Create Account']")
	private WebElement createAccountButton;
	
	@FindBy(id ="Forgot Password?")
	private WebElement forgotPassword;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordtextField() {
		return passwordtextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}
	
	public WebElement getForgotPassword() {
		return forgotPassword;
	}
	

}
