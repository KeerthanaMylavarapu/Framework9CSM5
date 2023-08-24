package genericLibraries;

import java.sql.Driver;

import org.apache.poi.hpsf.Property;
import org.openqa.selenium.WrapsDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPages.AddressFormPage;
import pomPages.CartPage;
import pomPages.HeadPhonesPage;
import pomPages.HomePage;
import pomPages.MyAddressPage;
import pomPages.MyProfilepage;
import pomPages.ShopperLoginPage;
import pomPages.SignUpPage;
import pomPages.WelocomePage;

public class BaseClass {
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected JavaUtility jutil;
	protected WebDriverUtility webutil;

	
	protected WelocomePage Welcome;
	protected ShopperLoginPage Login;
	protected HomePage Home;
	protected SignUpPage Signup;
	protected MyProfilepage myProfilepage;
	protected MyAddressPage myAddress;
	protected HeadPhonesPage Headphonepage;
	protected CartPage Cartpage;
	protected AddressFormPage AddressFormPage;
	
	
	@BeforeClass
	public void classConfiguration() {
		
		property=new PropertiesUtility();
		excel=new ExcelUtility();
		jutil=new JavaUtility();
		webutil=new WebDriverUtility();
		
		property.propertiesInit(IConstantPath.PROPERTIES_PATH);
		excel.excelInit(IConstantPath.EXCEL_PATH);
	}
	@BeforeMethod
	public void methodConfiguration() {
		 driver = webutil.navigateToApp(property.getData(), null, 0);