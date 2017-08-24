package uptake.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageBase {

	public static WebDriver driver = null;
	public WebDriverWait wdWait;

	public PageBase() {
		if (driver == null)
		{
			driver = new FirefoxDriver();			
		}
		this.wdWait = new WebDriverWait(driver, 5);
	}
	
	public void CloseBrowserWindow()
	{
		driver.quit();
	}
	
	public void MaximizeWindow()
	{
		driver.manage().window().maximize();
	}
}
