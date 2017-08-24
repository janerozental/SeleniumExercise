package uptake.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UptakeHomePage extends PageBase {
	By uptakeHomePage = new By.ByCssSelector("#home");
	By uptakeAboutPage = new By.ByCssSelector("a[href='/about'].menu__item");
	String url = "https://uptake.com/";
	
	public void openPage() {
		System.out.println("Opening page " + url);
		driver.get(url);
	}

	public void verifyPage() {
		System.out.println("Verifying Home page");
		wdWait.until(ExpectedConditions.visibilityOfElementLocated(uptakeHomePage));
	}
	
	 public void clickAboutUs() {
		 System.out.println("Navigating to About Us page from Home page");
		 WebElement aboutUs = driver.findElement(uptakeAboutPage);  
		 aboutUs.click();	
	 }
}
