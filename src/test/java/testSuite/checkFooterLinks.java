package testSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.Footer;
import utility.BrowserFactory;
import utility.ChefOnlineUtility;

public class checkFooterLinks {
	
		String tag ="checkFooterLinks";
		//WebDriver driver = BrowserFactory.startBrowser(ChefOnlineUtility.BROWSER_FIREFOX, ChefOnlineUtility.TEST_URL);
		WebDriver driver = BrowserFactory.startBrowser(ChefOnlineUtility.BROWSER_FIREFOX, ChefOnlineUtility.TEST_URL);
		Footer footerLinks = new Footer(driver);
	@Test
	public void clickOnIndianLinkTest() {
		
		try {
			
			//WebDriver driver = BrowserFactory.startBrowser(ChefOnlineUtility.BROWSER_FIREFOX, ChefOnlineUtility.TEST_URL);
			//Footer footerLinks = PageFactory.initElements(driver, Footer.class);
			//Footer footerLinks = new Footer(driver);
			footerLinks.clickOnIndianLink();
			driver.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(tag+" **** exception occured");
		}
		
	
	}
	@Test
	public void clickOnBangladeshiLinkTest() {
		
		try {
			WebDriver driver = BrowserFactory.startBrowser(ChefOnlineUtility.BROWSER_FIREFOX, ChefOnlineUtility.TEST_URL);
			Footer footerLinks = new Footer(driver);
			footerLinks.clickBangladeshiLink();
			driver.close();
			
		} catch (Exception e) {
			
			System.out.println(tag+" **** exception occured");
		}
		
	
	}
	

}
