package men;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shopperstack.genericUtility.BaseClassShopperstack;
import com.shopperstack.objectRepository.WelcomePageShopperstack;

public class AddTshirtToCart extends BaseClassShopperstack {
	@Test
	public void addTshirtToCart() throws InterruptedException
	{
		System.out.println("Added mens Tshirt To cart");
//		wlcmShop=new WelcomePageShopperstack(driver);
////		wlcmShop.getSearchTextField().sendKeys("men");
////		wlcmShop.getSearchButton().click();
////		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Men Woven Design Silk Blend Straight K...']/../../..//button[@id='addToCart']")).click();
//		Thread.sleep(2000);
////		driver.findElement(By.xpath("//span[text()='puma']/..//span[text()='tshirts']/../..//button[text()='add to cart']")).click();
	}
}
