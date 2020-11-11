package SetupClass.TestStep;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class pdp_Facebook_Login_Paid_User_15 extends Set {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^user is already on pdp page FP xv$")
	public void user_is_already_on_pdp_page_FP_xv() throws Throwable {
	    
		//driver.get("https://www.slideteam.net/adm-risk-monitoring-and-management-techniques-2018.html");
		//Thread.sleep(2000);
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(5000);

		try {
			driver.findElement(By.cssSelector("div.social-login-authentication-channel:nth-child(3) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")).click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} 
		catch (NoSuchElementException popup) {
		}
	}

	@Then("^User click on Download button to download the product xv$")
	public void user_click_on_Download_button_to_download_the_product_xv() throws Throwable {
		
		//WebElement download_btn_pdp_fp = wait.until(ExpectedConditions.elementToBeClickable(By.id("clicking")));
		//js.executeScript("arguments[0].scrollIntoView();",download_btn_pdp_fp);
		//Thread.sleep(2000);
		//download_btn_pdp_fp.click();
		//Thread.sleep(2000);
	    
	}

	@Then("^user is redirected to Login page xv$")
	public void user_is_redirected_to_Login_page_xv() throws Throwable {
		Thread.sleep(4500);
	}

	@Then("^User click on sign in with facebook button xv$")
	public void user_click_on_sign_in_with_facebook_button_xv() throws Throwable {
	    
		 WebElement fb_login_link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-block btn-social btn-facebook social-btn']")));
		 Thread.sleep(2000);
		 fb_login_link.click();
		Thread.sleep(3000);
		log.info("It's opening the website URL");
		
		 WebElement fb_email = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		 Thread.sleep(2000);
		    fb_email.sendKeys("sumit.kumar@slidetech.in");
		    Thread.sleep(2000);
		    WebElement fb_pass = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
		    Thread.sleep(2000);
		    fb_pass.sendKeys("redhat2090");
		    Thread.sleep(2000);
		    WebElement fb_login_btn=wait.until(ExpectedConditions.elementToBeClickable(By.id("loginbutton")));
		    Thread.sleep(2000);
		    fb_login_btn.click();
		    Thread.sleep(2000);
	}

	@Then("^user will be redirected to same page  xv$")
	public void user_will_be_redirected_to_same_page_xv() throws Throwable {
	    Thread.sleep(2000);
         driver.get("https://www.slideteam.net/adm-risk-monitoring-and-management-techniques-2018.html");
		Thread.sleep(2000);
	}

	@Then("^user download the product xv$")
	public void user_download_the_product_xv() throws Throwable {
	    Thread.sleep(1000);
           
		WebElement download_btn_pdp_fp = wait.until(ExpectedConditions.elementToBeClickable(By.id("clicking")));
		js.executeScript("arguments[0].scrollIntoView();",download_btn_pdp_fp);
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
		driver.get("https://www.slideteam.net/");
	}

	@Then("^user logout from website xv$")
	public void user_logout_from_website_xv() throws Throwable {
	   
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
		    Thread.sleep(2000);


		}
		
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
	    driver.manage().deleteAllCookies();
	    Thread.sleep(7000);
	    
	}

}
