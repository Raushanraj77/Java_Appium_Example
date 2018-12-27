package TestBankPkg;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
public class BankAppTest {
	
	WebDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");

		capabilities.setCapability("deviceName","AVY9KA9631900412");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appPackage", "com.experitest.ExperiBank");
		capabilities.setCapability("appActivity", ".LoginActivity");
	   
	    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@Test
	public void testCal() throws Exception {
		  driver.findElement(By.id("com.experitest.ExperiBank:id/usernameTextField")).sendKeys("company");
		  driver.findElement(By.id("com.experitest.ExperiBank:id/passwordTextField")).sendKeys("company");
		  driver.findElement(By.id("com.experitest.ExperiBank:id/loginButton")).click();

	  
	}

	@AfterClass
	public void teardown(){
		//close the app
		driver.quit();
	}
}
