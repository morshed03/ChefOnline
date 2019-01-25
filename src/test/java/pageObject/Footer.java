package pageObject;

import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer {
	
	WebDriver driver;
	String tag = "Footer";
	By indianLink = By.xpath("//a[@href='https://www.chefonline.co.uk/indian-takeaways']");
	By bangladeshi = By.xpath("//a[@href='https://www.chefonline.co.uk/bangladeshi-takeaways']");
	
	//Page contractor 
	public Footer(WebDriver driver) {
		this.driver = driver;
	}
	
	//Click on Indian Link from footer 
	public void clickOnIndianLink() {
		try {
			
			driver.findElement(indianLink).click();
						
		} catch (NoSuchElementException e) {
					
			System.out.println(tag +"  No such element exception occured");
		
		} catch (Exception e) {
			System.out.println(tag + "exception occured");
		}
			
	}
	
	//Click on Bangladeshi link from footer 
	public void clickBangladeshiLink() {
		try {
			driver.findElement(bangladeshi).click();
		} catch (NoSuchElementException e) {
			System.out.println(tag +"  No such element exception occured");
		}
		
		catch (Exception e) {
			System.out.println(tag + "exception occured");
		}
	}
}
