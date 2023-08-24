package testscripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class AddToCartTest extends BaseClass {
	@Test
	public void addToCartTest() {
		Map<String, String> map = excel.getData("Sheet1", "AddAddress");
		Welcome.clickLoginButton();
		Login.loginToApp(map.get("Email"), map.get("Password"));
		Thread.sleep(2000);
		Home.mouseHoverToElectronic(webutil);
		Thread.sleep(3000);
		Home.clickHeadPhonesLink();
		headphone.clickAddToCart();
		Thread.sleep(3000);
		Assert.assertEquals(headPhone.getAddToCartText(), "ADDED");
		String itemName = headPhone.getItemName();
		headphone.clickCartIcon();
		Assert.assertTrue(cart.getCartItem().equalsIgnoreCase(itemName));
	}

}
