package testscripts;

import java.util.Map;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class AddAddressTest extends BaseClass {
	@Test
	public void addAddressTest() {
		Map<String, String> map = excel.getData("Sheet1","AddAddress")
	}

}
