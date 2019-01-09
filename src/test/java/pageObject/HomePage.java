package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	String tag = "HomePage";
	
	//Search related locator
	By orderATakeway = By.xpath("//a[@id='takeaway']");
	By makeAReservation = By.xpath("//a[@id='reservation']");
	By postalCode = By.xpath("//input[@id='postcode']");
	By cuisineType = By.xpath("//select[@id='cuisineType']");
	By findRestaurant = By.xpath("//input[@id='submit']");
	
	By closeModal = By.xpath("//div[@id='myModal']//button[@type='button'][contains(text(),'Close')]");
	
	
	//Page contractor 
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}
	
	//Click on "Order a Takeaway" on Restaurant Search
	public void clickOnOrderATakeway() {
		try {
			driver.findElement(orderATakeway).click();
			
		}catch (NoSuchElementException e) {
			
			System.out.println(tag + "  No such element exception occured");
		}
		catch (Exception e) {
			
			System.out.println(tag + "exception occured");
		}
		
		
	}
	
	//Click on "Make A Reservation" on Restaurant Search
	public void clickOnMakeAReservation() {
		try {
			driver.findElement(makeAReservation).click();
				
		}catch (NoSuchElementException e) {
				
			System.out.println(tag + "  No such element exception occured");
		}
		catch (Exception e) {
				
			System.out.println(tag + "exception occured");
		}	
			
	}
	
	//Click on "Find Restaurant" button for search
	public void clickOnFindRestaurant() {
		try {
			driver.findElement(findRestaurant).click();
			
		}catch (NoSuchElementException e) {
			System.out.println(tag + "  No such element exception occured");
		} 
		catch (Exception e) {
			System.out.println(tag + "exception occured");
		}
		
	}
	
	//Close the validation message modal
	public void closeTheValidationMessageModal() {
		try {
			driver.findElement(closeModal).click();
			
		} catch (NoSuchElementException e) {
			System.out.println(tag + "  No such element exception occured");
		}catch (Exception e) {
			System.out.println(tag + "exception occured");
		}
		
	}
	
	//Input postal code on "Postcode/Town/Restaurant name" field
	public void InputPostalCodeOnPostalCodeField(String PostalCode) {
		try {
			driver.findElement(postalCode).sendKeys(PostalCode);
		} catch (NoSuchElementException e) {
			System.out.println(tag + "  No such element exception occured");
		}catch (Exception e) {
			System.out.println(tag + "exception occured");
		}
		
	}
	
	//Input Town name on "Postcode/Town/Restaurant name" field
	public void InputTownOnPostalCodeField(String Town) {
		try {
			driver.findElement(postalCode).sendKeys(Town);
		} catch (NoSuchElementException e) {
			System.out.println(tag + "  No such element exception occured");
		}catch (Exception e) {
			System.out.println(tag + "exception occured");
		}
		
	}
	
	//Select 'BANGLADESHI' on 'Select Cuisine' drop-down
	public void searchByBangladeshiCuisine() {
		try {
			Select dropdown = new Select(driver.findElement(cuisineType));
			dropdown.selectByVisibleText("BANGLADESHI");
		} catch (NoSuchElementException e) {
			System.out.println(tag + "  No such element exception occured");
		}catch (Exception e) {
			System.out.println(tag + "exception occured");
		}
		
	}

}
