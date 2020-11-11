package SetupClass.TestStep;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class pdp_Email_Login_Incorrect_Data_Paid_User_7 extends Set{
	

	WebDriverWait wait = new WebDriverWait(driver,30);
	 JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("^user is already on PDP Page MD vii$")
	public void user_is_already_on_PDP_Page_MD_vii() throws Throwable {
		//driver.get("https://www.slideteam.net/slides-for-a-startup-pitch-deck-powerpoint-presentation-slides.html");
		Thread.sleep(2000);
	    driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
		try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
			Thread.sleep(2000);
			log.info("It's opening the website URL and redirect user to sign in page");
		} 
		catch (NoSuchElementException popup) {
		}
	}

	@Then("^User click on Download button to download the product vii$")
	public void user_click_on_Download_button_to_download_the_product_vii() throws Throwable {
	    
		//WebElement download_btn_pdp_fp = wait.until(ExpectedConditions.elementToBeClickable(By.id("clicking")));
		//js.executeScript("arguments[0].scrollIntoView();",download_btn_pdp_fp);
		//Thread.sleep(2000);
		//download_btn_pdp_fp.click();
		//Thread.sleep(2000);
		
	}

	@Then("^user is redirected to Login page vii$")
	public void user_is_redirected_to_Login_page_vii() throws Throwable {
	    
	}

	@Then("^user enter incorrect details to login vii$")
	public void user_enter_incorrect_details_to_login_vii() throws Throwable {
	   
		WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		Thread.sleep(2000);
		username.sendKeys("*&#@Y #RHFGHJEGFYUJEh");
		Thread.sleep(2000);
		
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
		Thread.sleep(2000);
		password.sendKeys("jhjhddhjdhdfhfhfh");
		Thread.sleep(2000);
		
		WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("send2")));
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
		
	}

	@Then("^error message is displayed vii$")
	public void error_message_is_displayed_vii() throws Throwable {
	   
		WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}

	@Then("^user login with correct details vii$")
	public void user_login_with_correct_details_vii() throws Throwable {
	    
		WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		Thread.sleep(2000);
		username.sendKeys("sumit@slideteam.net");
		Thread.sleep(2000);
		
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
		Thread.sleep(2000);
		password.sendKeys("sumittest@21234");
		Thread.sleep(2000);
		
		WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.id("send2")));
		Thread.sleep(2000);
		login_btn.click();
		Thread.sleep(2000);
		
	}

	@Then("^user will be redirected to same pdp page vii$")
	public void user_will_be_redirected_to_same_pdp_page_vii() throws Throwable {
	  

		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Then("^user download the product vii$")
	public void user_download_the_product_vii() throws Throwable {
	   
		   
		WebElement download_btn_pdp_fp = wait.until(ExpectedConditions.elementToBeClickable(By.id("clicking")));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",download_btn_pdp_fp);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
				
		
	}

	@Then("^user logout from website vii$")
	public void user_logout_from_website_vii() throws Throwable {
	  

		Thread.sleep(1000);
		try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
		
	}


	
}
