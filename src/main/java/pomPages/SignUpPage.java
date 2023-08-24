package pomPages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
	//Declaration
	@FindBy(id="First Name")
	private WebElement firstNameTF;
	@FindBy(id="Last Name")
	private WebElement lastNameTF;
	@FindBy(xpath = "//div[@id='Gender']/descendant::label/span[2]")
	private List<WebElement> genderRadioButtons;
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTF;
	@FindBy(id="Email Address")
	private WebElement emailAddresTF;
	@FindBy(id="password")
	private WebElement passwordTF;
	@FindBy(id="Confirm Password")
	private WebElement ConfirmpasswordTF;
	@FindBy(id="Terms and Conditions")
	private WebElement termsAndConditionsCB;
	@FindBy(xpath="//button[text()='Register']")
	private WebElement registerButton;
	//Utilization
	public void crateUserAccount(String firstName, String lastname,
			String expectedGender, String PhoneNum, String email, String password) {
		firstNameTF.sendKeys(firstName);
		lastNameTF.sendKeys(lastname);
		for(WebElement element: genderRadioButtons) {
			String gender = element.getText();
			if (gender.equals(expectedGender)) {
				element.click();
				break;
			}
		}
		phoneNumberTF.sendKeys(PhoneNum);
		emailAddresTF.sendKeys(email);
		passwordTF.sendKeys(password);
		ConfirmpasswordTF.sendKeys(password);
		termsAndConditionsCB.click();
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
		registerButton.click();
		
	}
}
