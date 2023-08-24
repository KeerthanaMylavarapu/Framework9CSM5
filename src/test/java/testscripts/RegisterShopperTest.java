package testscripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import genericLibraries.ExcelUtility;
import genericLibraries.JavaUtility;
import pomPages.WelocomePage;

public class RegisterShopperTest extends BaseClass {
	
		@Test
		public void createAccountTest() {
			Welcome.clickLoginButton();
			Login.clickCreateAccountButton();
			Map<String, String> map = excel.getData("Sheet1", "Shopper Registration");
			int randomNum = jutil.generateRandomNum(100);
			String email = randomNum + map.get("Email Address");
			String pwd = map.get("Password") + randomNum;
			signUp.createUserAccount(map.get("FirstName"),map.get("LastName")),
			map.get("Gender"),map.get("Phone number"),email,pwd);
			Thread.sleep(10000);
			Welcome.clickLoginButton();
			Login.loginToApp(email, pwd);
			Thread.sleep(2000);
			Assert.assertTrue(driver.getTitle().contains("Home"));
			
	}

}
