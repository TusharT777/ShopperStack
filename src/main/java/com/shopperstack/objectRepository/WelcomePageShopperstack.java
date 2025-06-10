package com.shopperstack.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageShopperstack {
	public WelcomePageShopperstack(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id  = "men")
	private WebElement mensLink;
	
	@FindBy(id = "women")
	private WebElement womensLink;
	
	@FindBy(id = "kids")
	private WebElement kidsLink;
	
	@FindBy(id = "electronics")
	private WebElement electroincsLink;
	
	@FindBy(id = "beautyProducts")
	private WebElement beautyProuctsLink;
	
	@FindBy(id = "category")
	private WebElement categorySelect;
	
	@FindBy(id = "search")
	private WebElement searchTextField;
	
	@FindBy(id = "searchBtn")
	private WebElement searchButton;
	
	@FindBy(id = "cart")
	private WebElement cartButton;
	
	@FindBy(xpath = "//div[text()='T']")
	private WebElement accountSetting;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myProfileButton;
	
	@FindBy(xpath = "//li[text()='Wish List']")
	private WebElement wishListButton;
	
	@FindBy(xpath = "My Orders")
	private WebElement myOrdersButton;
	
	@FindBy(xpath = "//li[text()='My Wallet']")
	private WebElement myWalletButton;
	
	@FindBy(xpath = "//li[text()='My Likes']")
	private WebElement myLinkesButton;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutButton;

	public WebElement getMensLink() {
		return mensLink;
	}

	public void setMensLink(WebElement mensLink) {
		this.mensLink = mensLink;
	}

	public WebElement getWomensLink() {
		return womensLink;
	}

	public void setWomensLink(WebElement womensLink) {
		this.womensLink = womensLink;
	}

	public WebElement getKidsLink() {
		return kidsLink;
	}

	public void setKidsLink(WebElement kidsLink) {
		this.kidsLink = kidsLink;
	}

	public WebElement getElectroincsLink() {
		return electroincsLink;
	}

	public void setElectroincsLink(WebElement electroincsLink) {
		this.electroincsLink = electroincsLink;
	}

	public WebElement getBeautyProuctsLink() {
		return beautyProuctsLink;
	}

	public void setBeautyProuctsLink(WebElement beautyProuctsLink) {
		this.beautyProuctsLink = beautyProuctsLink;
	}

	public WebElement getCategorySelect() {
		return categorySelect;
	}

	public void setCategorySelect(WebElement categorySelect) {
		this.categorySelect = categorySelect;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public void setCartButton(WebElement cartButton) {
		this.cartButton = cartButton;
	}

	public WebElement getAccountSetting() {
		return accountSetting;
	}

	public void setAccountSetting(WebElement accountSetting) {
		this.accountSetting = accountSetting;
	}

	public WebElement getMyProfileButton() {
		return myProfileButton;
	}

	public void setMyProfileButton(WebElement myProfileButton) {
		this.myProfileButton = myProfileButton;
	}

	public WebElement getWishListButton() {
		return wishListButton;
	}

	public void setWishListButton(WebElement wishListButton) {
		this.wishListButton = wishListButton;
	}

	public WebElement getMyOrdersButton() {
		return myOrdersButton;
	}

	public void setMyOrdersButton(WebElement myOrdersButton) {
		this.myOrdersButton = myOrdersButton;
	}

	public WebElement getMyWalletButton() {
		return myWalletButton;
	}

	public void setMyWalletButton(WebElement myWalletButton) {
		this.myWalletButton = myWalletButton;
	}

	public WebElement getMyLinkesButton() {
		return myLinkesButton;
	}

	public void setMyLinkesButton(WebElement myLinkesButton) {
		this.myLinkesButton = myLinkesButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public void setLogoutButton(WebElement logoutButton) {
		this.logoutButton = logoutButton;
	}

	
}