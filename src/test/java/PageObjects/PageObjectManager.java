package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    
	public OffersPage offer;
	public WebDriver driver;
	public LandingPage landing;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LandingPage getLandingPageObject() {
		landing = new LandingPage(driver);
		return landing;
	}
	public OffersPage getOffersPageObject() {
		offer = new OffersPage(driver);
		return offer;
	}
}
