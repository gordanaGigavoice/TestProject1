package demoJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowserJob {
	
	@Test
	public void checkPageTitle() {
		
//		System.setProperty("webdriver.chrome.driver", "/home/gigavoice/chromedriver");
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
		
		 String expectedTitle = "Google";
		 if(actualTitle.equalsIgnoreCase(expectedTitle))
		 System.out.println("Title Matched");
		 else
		 System.out.println("Title didn't match");
		 driver.close();
	}
}
