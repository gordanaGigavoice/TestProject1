package demoJenkins;
import java.io.IOException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
@Test
public class TecAdminSeleniumTest {



	 
	        public static void main(String[] args) throws IOException, InterruptedException {
//	                System.setProperty("webdriver.chrome.driver", "/home/gigavoice/chromedriver");
	                
	                ChromeOptions chromeOptions = new ChromeOptions();
	                chromeOptions.addArguments("--headless");
	                chromeOptions.addArguments("--no-sandbox");
	 
//	           WebDriver     driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"), chromeOptions);
	               WebDriver  driver = new ChromeDriver(chromeOptions);
	 
	                driver.get("https://google.com");
	 
	                Thread.sleep(3000);
	 
	                if (driver.getPageSource().contains("Google")) {
	                        System.out.println("Pass");
	                } else {
	                        System.out.println("Fail");
	                }
	                driver.quit();
	        }
	
}
