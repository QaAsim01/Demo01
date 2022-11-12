package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
 
	public WebDriver driver;
	
	public WebDriver WebdriverManaGer() throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\Resources\\global.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		String url = prop.getProperty("QaUrl");
		
		if (driver== null) {
		
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {		
			
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\Resources\\chromedriver.exe");
	    driver = new ChromeDriver();
			}
			else if (prop.getProperty("browser").equalsIgnoreCase("firefox")){
				//geckodriver
			}
	    driver.get(url);
		}
	    return driver;
	}
}
