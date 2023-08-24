package testscripts;

import java.util.Map;

import org.apache.poi.ss.formula.functions.Address;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class AddAddressTest extends BaseClass {
	@Test
	public void addAddressTest()  {
		Map<String, String> map = excel.getData("Sheet1","AddAddress");
		Welcome.clickLoginButton();
		Login.loginToApp(map.get("Email"), map.get("Password"));
		Thread.sleep(2000);
		Home.clickProfileButton();
		Thread.sleep(2000);
		Home.selectMyprofile();
		Thread.sleep(2000);
		myProfilepage.clickMyAddresses();
		myAddress.clickAddAddress();
		address.addAddressDetails(webutil,map);
		Thread.sleep(2000);
		Assert.assertEquals(myAddress.getSuccessMessage(), "succesfully added");
		Thread.sleep(5000);
		
	}

}
