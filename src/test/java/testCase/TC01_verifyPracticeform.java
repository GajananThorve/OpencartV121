package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Testpracticeform_pageLocator;
import testBase.BaseClass;

public class TC01_verifyPracticeform extends BaseClass {
	
		@Test
		public void fName() throws InterruptedException
		{
			Testpracticeform_pageLocator pf=new Testpracticeform_pageLocator(driver);
			pf.setFirstName(randomString());
			pf.setLastName(randomString());
			pf.setEmail(randomeAlphaNumeric()+"@gmail.com"); //randomly generated the email
			pf.setGender();
			pf.setMobile(randomNumber());
			pf.setSubject(randomString());
			pf.setHobbies();
			pf.setCrntAddress(randomString());
			pf.btnbutton();
			
			String confirmmsg=pf.getConfirmationMsg();
			Assert.assertEquals(confirmmsg, "Thanks for submitting the form");
		}
	
}
