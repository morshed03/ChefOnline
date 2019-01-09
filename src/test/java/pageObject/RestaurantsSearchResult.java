package pageObject;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RestaurantsSearchResult {
	
	WebDriver driver;
	String tag = "RestaurantsSearchResult";
	boolean bool = false;
	
	By restaurantList = By.xpath("//div/div[@class='item-block']");
	By restaurantCount = By.xpath("//span[@id='count_restaurant']");
	
	//Page contractor 
	public RestaurantsSearchResult(WebDriver driver) {
		this.driver = driver;
	}
	
	public void totalRestaurantOnSearchResultListing() {
		try {
			List<WebElement> fullRestaurantList = driver.findElements(restaurantList);
			
			int count = fullRestaurantList.size();
			System.out.println("Count of Total Restaurant: "+ count);
			String countStr = "" + count;
			
			WebElement total = driver.findElement(restaurantCount);
			String titleTotalRestaurant = total.getText();
			System.out.println("Count of Total Restaurant: "+ titleTotalRestaurant);
			
						
			if (titleTotalRestaurant.contains(countStr)) {
				bool = true;
			}
			
			assertTrue(bool, "Not matched");
			
		} catch (NoSuchElementException e) {
			System.out.println(tag + "  No such element exception occured");
		}
		catch (Exception e) {
			System.out.println(tag + "exception occured");
		}
		
	}
}
