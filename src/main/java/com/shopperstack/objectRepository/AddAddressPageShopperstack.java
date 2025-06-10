package com.shopperstack.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressPageShopperstack {
	public AddAddressPageShopperstack(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[text()='My Addresses']")
	private WebElement myAddressLink;
	
	public WebElement getMyAddressLink() {
		return myAddressLink;
	}

	public WebElement getAddAddressLink() {
		return addAddressLink;
	}
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressLink;
	
	@FindBy(id = "Home")
	private WebElement homeRadioButton;
	
	@FindBy(id = "Name")
	private WebElement nameTextField;
	
	@FindBy(id = "House/Office Info")
	private WebElement houseTextField;
	
	@FindBy(id = "Street Info")
	private WebElement streetTextField;
	
	@FindBy(id = "Landmark")
	private WebElement landmarkTextFiled;
	
	@FindBy(id = "Country")
	private WebElement countryDropDown;
	
	@FindBy(id = "State")
	private WebElement stateDropDown;
	
	@FindBy(id = "City")
	private WebElement cityDropDown;
	
	@FindBy(id = "Pincode")
	private WebElement pinCodeTextField;
	
	@FindBy(id = "Phone Number")
	private WebElement phoneNumberTextField;
	
	@FindBy(id = "addAddress")
	private WebElement addAddressButton;

	public WebElement getHomeRadioButton() {
		return homeRadioButton;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseTextField() {
		return houseTextField;
	}

	public WebElement getStreetTextField() {
		return streetTextField;
	}

	public WebElement getLandmarkTextFiled() {
		return landmarkTextFiled;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getPinCodeTextField() {
		return pinCodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getAddAddressButton() {
		return addAddressButton;
	}

}
