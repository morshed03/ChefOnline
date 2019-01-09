package testSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RestaurantsSearchResult;
import utility.BrowserFactory;
import utility.ChefOnlineUtility;


public class RestaurantSearchTest extends BrowserFactory {
	WebDriver driver = null;
	
	String tag = "RestaurantSearchTest"; 
	
	@Test
	public void verifyRestaurantListingOnSearchResultPageTest()  {
		try {
			driver = BrowserFactory.startBrowser(ChefOnlineUtility.BROWSER_FIREFOX, ChefOnlineUtility.TEST_URL);
			HomePage homepage = new HomePage(driver);
			RestaurantsSearchResult searchPage = new RestaurantsSearchResult(driver);
			
			homepage.InputTownOnPostalCodeField("London");
			homepage.clickOnFindRestaurant();
			Thread.sleep(4000);
			searchPage.totalRestaurantOnSearchResultListing();
			
			driver.close();
		} catch (Exception e) {
			System.out.println(tag + "exception occured on verifyRestaurantListingOnSearchResultPageTest");
		}
		
	}
	
	@Test
	public void blankSearchTest() {
		try {
			driver = BrowserFactory.startBrowser(ChefOnlineUtility.BROWSER_FIREFOX, ChefOnlineUtility.TEST_URL);
			HomePage homepage = new HomePage(driver);
			
			homepage.clickOnOrderATakeway();
			homepage.clickOnFindRestaurant();
			homepage.closeTheValidationMessageModal();
			driver.close();
		} catch (Exception e) {
			System.out.println(tag + "exception occured on blankSearchTest");
		}
		
	}
	
	@Test
	public void restaurantSearchUsingPostalCodeTest() {
		try {
			driver = BrowserFactory.startBrowser(ChefOnlineUtility.BROWSER_FIREFOX, ChefOnlineUtility.TEST_URL);
			HomePage homepage = new HomePage(driver);
			
			homepage.InputPostalCodeOnPostalCodeField("E1");
			homepage.clickOnFindRestaurant();
			driver.close();
		} catch (Exception e) {
			System.out.println(tag + "exception occured on restaurantSearchUsingPostalCodeTest");
		}
		
	}
	@Test
	public void restaurantSearchUsingTownTest() {
		try {
			driver = BrowserFactory.startBrowser(ChefOnlineUtility.BROWSER_FIREFOX, ChefOnlineUtility.TEST_URL);
			HomePage homepage = new HomePage(driver);
			
			homepage.InputTownOnPostalCodeField("London");
			homepage.clickOnFindRestaurant();
			driver.close();
		} catch (Exception e) {
			System.out.println(tag + "exception occured on restaurantSearchUsingTownTest");
		}
		
	}
	@Test
	public void restaurantSearchUsingPostCodeAndBangladeshiCuisineTest() {
		try {
			driver = BrowserFactory.startBrowser(ChefOnlineUtility.BROWSER_FIREFOX, ChefOnlineUtility.TEST_URL);
			HomePage homepage = new HomePage(driver);
			
			homepage.InputPostalCodeOnPostalCodeField("E1");
			homepage.searchByBangladeshiCuisine();
			homepage.clickOnFindRestaurant();
			driver.close();
		} catch (Exception e) {
			System.out.println(tag + "exception occured on restaurantSearchUsingPostCodeAndBangladeshiCuisineTest");
		}
		
	}
	
}
