package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
     public WebDriver driver;
	 By search = By.xpath("//input[@type='search']");
	 By productNameOnSearchpage = By.xpath("//h4[@class='product-name']");
	 By topDeals = By.xpath("//a[text()='Top Deals']");
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	public void searchObject(String name) {
		driver.findElement(search).sendKeys(name);
	}
	public String getProduct() {
		return driver.findElement(productNameOnSearchpage).getText();
	}
	
	public void selectTopdeals() {
		driver.findElement(topDeals).click();
	}
}

