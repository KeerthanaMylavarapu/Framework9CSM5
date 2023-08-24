package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class AddressFormPage {

	@FindBy(id="Name")
	private WebElement nameTF;
	@FindBy(id="House/Office Info")
	private WebElement houseInfoTF;
	@FindBy(id="Street Info")
	private WebElement streetInfoTF;
	@FindBy(id="Landmark")
	private WebElement landmarkTF;
	@FindBy(id="Country")
	private WebElement countryDropdown;
	@FindBy(id="State")
	private WebElement stateDropdowm;
	@FindBy(id="City")
	private WebElement cityDropdown;
	@FindBy(id="Pincode")
	private WebElement pincodeTF;
	@FindBy(id="Phone Number")
	private WebElement phonenumberTF;
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressButton;


   //Initialization
   public AddressFormPage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }
   
   //Utilization
   public void addAddressDetails(WebDriverUtility web, String name, String houseInfo, String street, String landmark,
		   String Country, String state, String city, String pincode, String phonenum) {
   nameTF.sendKeys(name);
   houseInfoTF.sendKeys(houseInfo);
   streetInfoTF.sendKeys(street);
   landmarkTF.sendKeys(landmark);
   web.selectFromDropdown(Country, countryDropdown);
   web.selectFromDropdown(state, stateDropdowm);
   web.selectFromDropdown(city, cityDropdown);
   pincodeTF.sendKeys(pincode);
   phonenumberTF.sendKeys(phonenum);
   addAddressButton.click();
   }
}
   
   
   
   
   