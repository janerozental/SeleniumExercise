package uptake.tests;

import org.junit.Test;
import uptake.pages.*;

public class UptakePageNavigationTests {

	@Test
	public void navigateFromHometoContactPage() {

		UptakeHomePage uptakeFrontPage = new UptakeHomePage();
		UptakeAboutUsPage uptakeAboutPage = new UptakeAboutUsPage();

		uptakeFrontPage.openPage();
		uptakeFrontPage.maximizeWindow();
		uptakeFrontPage.verifyPage();
		uptakeFrontPage.clickAboutUs();
		uptakeAboutPage.verifyPage();
		uptakeAboutPage.closeBrowserWindow();
		
	}

}
