package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
    public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));			
	}
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	public String randomString()
	{
		@SuppressWarnings("deprecation")
		String generatestring=RandomStringUtils.randomAlphabetic(5);
		return generatestring;
	}
	public String randomNumber()
	{
		@SuppressWarnings("deprecation")
		String generatenumber=RandomStringUtils.randomNumeric(10);
	    return generatenumber;
	}
	public String randomeAlphaNumeric()
	{
		@SuppressWarnings("deprecation")
		String generatestring=RandomStringUtils.randomAlphabetic(5);
		@SuppressWarnings("deprecation")
		String generatenumber=RandomStringUtils.randomNumeric(3);
		return (generatestring+generatenumber);
	}

}
