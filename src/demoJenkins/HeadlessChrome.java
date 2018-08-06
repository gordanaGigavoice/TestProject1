package demoJenkins;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class HeadlessChrome {
@Test
	public void createChromeDriverHeadless() throws IOException {
    ChromeOptions chromeOptions = new ChromeOptions();
//  chromeOptions.setBinary("/");
  chromeOptions.addArguments("--headless");

  WebDriver Driver = new ChromeDriver(chromeOptions);
  Driver.navigate().to("https://www.google.com");
  String actualTitle = Driver.getTitle();
	
	 String expectedTitle = "google";
	 if(actualTitle.equalsIgnoreCase(expectedTitle))
	 System.out.println("Title Matched");
	 else
	 System.out.println("Title didn't match");
  Driver.quit();
}
}
