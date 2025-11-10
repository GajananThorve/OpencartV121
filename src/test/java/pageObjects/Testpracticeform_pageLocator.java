package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Testpracticeform_pageLocator extends BasePage {
	
	public Testpracticeform_pageLocator(WebDriver driver)
	{
		super(driver);
	}
	
	//locators
			@FindBy(xpath="//*[@placeholder='First Name']") WebElement firstName;
			@FindBy(xpath="//*[@placeholder='Last Name']") WebElement lastName;
			@FindBy(xpath="//*[@id='userEmail']") WebElement Email;
			@FindBy(xpath="//label[normalize-space()='Other']") WebElement Gender;
			@FindBy(xpath="//*[@placeholder='Mobile Number']") WebElement Mobile;
	  @FindBy(xpath="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']") 
			WebElement Subject;
	        @FindBy(xpath="//label[normalize-space()='Music']") WebElement Hobbies;
			@FindBy(xpath="//*[@id='currentAddress']") WebElement CrntAddress;
			@FindBy(xpath="//button[@id='submit']") WebElement btn;
			@FindBy(xpath="//*[text()='Thanks for submitting the form']") WebElement msgConfimation;
			
			//actions
			
			public void setFirstName(String f1stname) 
			{
				firstName.sendKeys(f1stname);
			}
			public void setLastName(String lName) 
			{
				lastName.sendKeys(lName);
			}
			public void setEmail(String email) 
			{
				Email.sendKeys(email);
			}
			public void setGender() 
			{
				Gender.click();			
			}

			public void setMobile(String mob) 
			{
				Mobile.sendKeys(mob);
			}
			public void setSubject(String vishay)  
			{
				Actions actions = new Actions(driver);
				actions.moveToElement(Subject).click().sendKeys(vishay).sendKeys(Keys.ENTER).build().perform();
			}
			public void setHobbies() 
			{
//				Hobbies.click();
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", Hobbies);
			}
			public void setCrntAddress(String crntAddr) 
			{
				CrntAddress.sendKeys(crntAddr);
			}
			public void btnbutton()
			{
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
			}
			public String getConfirmationMsg()
			{
				try
				{
					return (msgConfimation.getText());
				}
				catch(Exception e)
				{
					return e.getMessage();
				}				
			}

}
