package util;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}

	
	public void switchWindowToChild() {
		Set<String> win =driver.getWindowHandles();
        Iterator<String> itr = win.iterator();
        String parentWindow = itr.next();
        String childWindow = itr.next();
        driver.switchTo().window(childWindow);
	}
}
