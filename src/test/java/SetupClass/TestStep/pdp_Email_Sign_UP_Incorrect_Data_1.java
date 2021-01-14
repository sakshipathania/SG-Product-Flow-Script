package SetupClass.TestStep;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class pdp_Email_Sign_UP_Incorrect_Data_1 extends Set {

	WebDriverWait wait = new WebDriverWait(driver,30);
	 JavascriptExecutor js = (JavascriptExecutor) driver;

	
	@Given("^user is already on PDP Page FP i$")
	public void user_is_already_on_PDP_Page_FP_i() throws Throwable {
	   
		driver.get("https://www.slideteam.net/technology-powerpoint-templates/private-public-cloud-computing/0115-big-data-icon-set-data-analytics-icon-set-cloud-computing-networking-funnel-ppt-slide.html");
		Thread.sleep(2000);
	    
	}

	@Then("^User click on Download button to download the product i$")
	public void user_click_on_Download_button_to_download_the_product_i() throws Throwable {
	   
		WebElement download_btn_pdp = wait.until(ExpectedConditions.elementToBeClickable(By.id("clicking")));
		js.executeScript("arguments[0].scrollIntoView();",download_btn_pdp);
		Thread.sleep(2000);
		download_btn_pdp.click();
		Thread.sleep(2000);
	   
		
	}

	@Then("^user is redirected to sign up page i$")
	public void user_is_redirected_to_sign_up_page_i() throws Throwable {
	   
	try
	{
		WebElement sign_up_page = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(.,'Create an Account')])[1]")));
		Thread.sleep(2000);
		sign_up_page.click();
		Thread.sleep(2000);
		
	}
		
	catch (Exception e) {
		// TODO: handle exception
	}
	
	
	}

	@Then("^user enter incorrect details to sign up i$")
	public void user_enter_incorrect_details_to_sign_up_i() throws Throwable {
	    Thread.sleep(2000);
		WebElement new_fname_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_name1")));
	    Thread.sleep(1000);
	    new_fname_signup.sendKeys("!$#");
	    
		Thread.sleep(2000);
	    WebElement new_email_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_email1")));
	    Thread.sleep(1000);
	    new_email_signup.sendKeys("123@$#!%@.$%q!");
	    Thread.sleep(2000);
	    
	   // WebElement new_lname_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("lastname")));
	  //  Thread.sleep(1000);
	   // new_lname_signup.sendKeys("254204254");
	   // Thread.sleep(2000);
	    WebElement new_pwd_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_password1")));
	    Thread.sleep(1000);
	    new_pwd_signup.sendKeys("123456");
	    Thread.sleep(2000);
	    WebElement new_pwd1_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_password2")));
	    Thread.sleep(1000);
	    new_pwd1_signup.sendKeys("123456");
	    Thread.sleep(2000);
	    WebElement new_captcha_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#captchtext")));
	    Thread.sleep(1000);
	    new_captcha_signup.sendKeys("Aj7W2mtf9namwf55");
	    Thread.sleep(2000);
	    WebElement new_btn_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pg-register-button-new")));
	    Thread.sleep(1000);
	    new_btn_signup.click();
	    
	    Thread.sleep(7000);
		
	}

	@Then("^error message is displayed i$")
	public void error_message_is_displayed_i() throws Throwable {
		

		log.info("ERROR MESSAGE IS DISPLAYED IN CONSOLE");

		Thread.sleep(2000);
	    WebElement new_email_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_email1")));
	    Thread.sleep(1000);
	    new_email_signup.clear();
	    Thread.sleep(2000);
	    WebElement new_fname_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_name1")));
	    Thread.sleep(1000);
	    new_fname_signup.clear();
	    Thread.sleep(2000);
	   
	    WebElement new_pwd_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_password1")));
	    Thread.sleep(1000);
	    new_pwd_signup.clear();
	    Thread.sleep(2000);
	    WebElement new_pwd1_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_password2")));
	    Thread.sleep(1000);
	    new_pwd1_signup.clear();
	    Thread.sleep(2000);
	    WebElement new_captcha_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#captchtext")));
	    Thread.sleep(1000);
	    new_captcha_signup.clear();
	    Thread.sleep(4000);
	    driver.navigate().refresh();
	    
	}

	@Then("^user enter new email and correct details to sign up i$")
	public void user_enter_new_email_and_correct_details_to_sign_up_i() throws Throwable {
	 
	
				 WebElement new_fname_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_name1")));
					Thread.sleep(2000);
				    new_fname_signup.sendKeys("Automated Program");
					Thread.sleep(2000);

				 //generate new email id  to sign up
				int leftLimit = 97; // letter 'a'
			    int rightLimit = 122; // letter 'z'
			    int targetStringLength = 10;
			    Random random = new Random();
			    StringBuilder buffer = new StringBuilder(targetStringLength);
			    for (int i = 0; i < targetStringLength; i++) {
			        int randomLimitedInt = leftLimit + (int) 
			          (random.nextFloat() * (rightLimit - leftLimit + 1));
			        buffer.append((char) randomLimitedInt);
			    }
			    String generatedString = buffer.toString();
			 
			    System.out.println(generatedString);
			    
			    String signup_email=generatedString;
			    String full_email="selenium.testing."+generatedString+"@gmail.com";
			    System.out.println(full_email);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
				Thread.sleep(2000);
			    WebElement new_email_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_email1")));
				Thread.sleep(2000);
			    new_email_signup.sendKeys(full_email);
				Thread.sleep(2000);
		
					 WebElement new_pwd_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_password1")));
						Thread.sleep(2000);
					    new_pwd_signup.sendKeys("Geeks@123");
						Thread.sleep(2000);

					    WebElement new_pwd1_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_password2")));
						Thread.sleep(2000);
					    new_pwd1_signup.sendKeys("Geeks@123");
						Thread.sleep(2000);
						
						WebElement new_captcha_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#captchtext")));
						Thread.sleep(2000);
					    new_captcha_signup.sendKeys("Y3Tt6bfwI");
					    
					    WebElement new_btn_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pg-register-button-new")));
						Thread.sleep(2000);
					    new_btn_signup.click();
						Thread.sleep(2000);
		
	}

	@Then("^user is redirected to pricing page And then user navigates to free ppt page i$")
	public void user_is_redirected_to_pricing_page_And_then_user_navigates_to_free_ppt_page_i() throws Throwable {
	

	driver.get("https://www.slidegeeks.com/free-downloads");
		Thread.sleep(6000);
		
		WebElement Download1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/section[2]/div/div/div[1]/div/div[2]/div[1]/div/div/p/a/span")));
		
		//WebElement Download = (WebElement)js.executeScript("('a.btn-download')", "");
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",Download1);
		Download.click();
		Thread.sleep(3000);
							
		WebElement Signout1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href ='/logout']")));
		Thread.sleep(3000);
		Signout1.click();
}
	
}
