package demoJenkins;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
@Test
public class OpenBrowserJob {
	
	public void checkPageTitle() throws MalformedURLException {
		
//		System.setProperty("webdriver.chrome.driver", "/home/gigavoice/chromedriver");
//		ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
		Capabilities chromeCapabilities = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"), chromeCapabilities);
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
