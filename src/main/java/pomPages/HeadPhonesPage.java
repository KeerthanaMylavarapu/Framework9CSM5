package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeadPhonesPage {
@FindBy(xpath="//span[text()='boat rockerz 450']")
private WebElement addToCartButton;
@FindBy(xpath="")
private WebElement itemName;
//Initialization
public HeadPhonesPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//Utilization
public void clickAddToCart() {
	addToCartButton.click();
}
public String GetAddToCartText() {
	return addToCartButton.getText();
}
}
