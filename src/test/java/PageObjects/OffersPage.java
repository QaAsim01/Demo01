package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	
	 public WebDriver driver;
	 
	 By search = By.xpath("//input[@id='search-field']");
	 By ProductNameOnOffersPage = By.xpath("//td[text()='Tomato']");
	 
	 
	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchProduct(String name) {
		driver.findElement(search).sendKeys(name);
	}
	public String getProduct() {
		return driver.findElement(ProductNameOnOffersPage).getText();
	}
}
