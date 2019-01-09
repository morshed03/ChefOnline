package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static String tag ="BrowserFactory";
	static WebDriver driver;
	
	static String projectPath = System.getProperty("user.dir");
	//System.out.println("projectPath :" +projectPath);
	
	public static WebDriver startBrowser(String browserName, String fullURL) {
		try {
			if(browserName.equals(ChefOnlineUtility.BROWSER_FIREFOX))
			{
				System.setProperty("webdriver.gecko.driver", projectPath + "/Driver/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if (browserName.equals(ChefOnlineUtility.BROWSER_CHROME)) 
			{
				System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browserName.equalsIgnoreCase(ChefOnlineUtility.BROWSER_EDGE)) 
			{
				System.setProperty("webdriver.edge.driver", projectPath + "/driver/MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.get(fullURL);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(tag +" **** exception occured");
			return driver;
		}
		return driver;
	}
}
