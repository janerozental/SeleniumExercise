package uptake.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class UptakeAboutUsPage extends PageBase {
	By uptakeAboutActive = new By.ByCssSelector(".menu__item.menu__item--active");

	public void verifyPage() {
		System.out.println("Verifying About Us page");
		wdWait.until(ExpectedConditions.visibilityOfElementLocated(uptakeAboutActive));
	}
}
