package Stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import BaseClass.IBaseClass;
import ObjectRepository.ForesterLocators;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ForestersLifeInsurance {
	
	IBaseClass base = new IBaseClass();
	ForesterLocators locators = new ForesterLocators();


	@Given("Launch the foresters application {string}")
	public void launch_the_foresters_application(String string) {
	    base.launchApplication(string);
	    base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
	
	@Then("Validate the homepage  {string}")
	public void validate_the_homepage(String string) {
		if(base.currentUrl().equals(string)) {
			System.out.println("Application launched succesfully");
			}
		else {
			System.out.println("Application not launched succesfully");
		}
	    
	}

	@When("user click Login")
	public void user_click_Login() {
		base.button(locators.getLogin());
	    
	}

	@When("User clicked on Myforesters")
	public void user_clicked_on_Myforesters() {
		base.button(locators.getMyfor());
	    
	}

	@When("user pass the username and password with onedim map")
	public void user_pass_the_username_and_password_with_onedim_map(DataTable dataTable) {
		base.childWindow();
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		String name = map.get("username");
		String pass = map.get("password");
		base.sendText(locators.getName(), name);
		base.sendText(locators.getPwd(), pass);
		
	   
	}
	
	@When("user click login")
	public void user_click_login() {
	   base.button(locators.getForlogin());
	   base.ElementToPresent(locators.getLoginmess());
	   base.scrolldown(locators.getLoginmess());
	   base.ss("myforestor login");
	}

	@When("user click contactUs")
	public void user_click_contactUs() {
	   base.button(locators.getContactus());
	}

	@When("user scroll down the page")
	public void user_scroll_down_the_page() {
	   base.scrolldown(locators.getEmailid());
	}

	@Then("user validate the contactUs text {string}")
	public void user_validate_the_contactUs_text(String string1) {
        WebElement email = locators.getEmailid();
		String text = email.getText();
		System.out.println("contactus " + text);
		if(text.equals(string1)) {
			System.out.println("given emaild are same");
		}else {
			System.out.println("given emaild are not same");
		}
			
	}
	
	
	@When("user click contact us")
	public void user_click_contact_us() {
		base.button(locators.getContactus());
		
	}


	@When("user select option in how can we help")
	public void user_select_option_in_how_can_we_help() {
		
		
	    base.childWindow();
		base.scrolldown(locators.getHowWe());
		base.ElementToClickable(locators.getHowWe());
		base.SelectByIndex(locators.getHowWe(),1);
		base.getAllSelectedoption(null, locators.getHowWe());

		
	   
	}

	@When("user select option in subject")
	public void user_select_option_in_subject() {
		
		base.mouseOver(locators.getSubject());
		base.ElementToClickable(locators.getSubject());
		base.SelectByIndex(locators.getSubject(), 3);
		base.getAllSelectedoption(null, locators.getSubject());
	
//		base.button(locators.getContactus());
//	    base.childWindow();
//		base.mouseOver(locators.getSubject());
//		for(WebElement x : base.options(locators.getSubject())) {
//	    	 String option= x.getText();
//	     	if(option.equals("I want to make a claim")) {
//          base.SelectVisibleText(x,"I want to make a claim");
//          
//        List<WebElement> a = base.getAllSelectedoption(option, x);
//        
//          System.out.println(a);
//          
//	     	}
//	     	
//	     }  
		
		
	    
	}

	@When("user enter details in additional information {string}")
	public void user_enter_details_in_additional_information(String string) {
		base.scrolldown(locators.getMyAddInfo());
		base.sendText(locators.getMyAddInfo(), string);
	    
	}

	@When("user pass firstName {string}")
	public void user_pass_firstName(String string) {
		base.mouseOver(locators.getFirstName());
		base.sendText(locators.getFirstName(), string);
	   
	}

	@When("user pass LastName {string}")
	public void user_pass_LastName(String string) {
		base.scrolldown(locators.getLasttName());
		base.sendText(locators.getLasttName(), string);
	    
	}

	@When("user pass phoneNumber {string}")
	public void user_pass_phoneNumber(String string) {
		base.mouseOver(locators.getPhNum());
		base.sendText(locators.getPhNum(), string);
	    
	}

	@When("user pass extn {string}")
	public void user_pass_extn(String string) {
		base.scrolldown(locators.getExt());
		base.sendText(locators.getExt(), string);
	  
	}

	@When("user pass emailId {string}")
	public void user_pass_emailId(String string) {
		base.scrolldown(locators.getMailId());
		base.sendText(locators.getMailId(), string);
		
	    
	}

	@When("user pass zipcode {string}")
	public void user_pass_zipcode(String string) {
		base.mouseOver(locators.getZipcode());
		base.sendText(locators.getZipcode(), string);
	   
	}

	@When("user select contact preference")
	public void user_select_contact_preference() {
		base.mouseOver(locators.getConPre());
		base.button(locators.getConPre());
	    
	}

	@When("user pass existing policy or certificate number {string}")
	public void user_pass_existing_policy_or_certificate_number(String string) {
		base.scrolldown(locators.getExtPolNum());
		base.sendText(locators.getExtPolNum(), string);
	   
	}

	@When("user click agree check box")
	public void user_click_agree_check_box() {
		base.scrolldown(locators.getAgree());
		base.ElementToClickable(locators.getAgree());
        base.button(locators.getAgree());
		
	   
	}

	@When("user click submit button")
	public void user_click_submit_button() {
		base.mouseOver(locators.getSubmit());
		base.ElementToClickable(locators.getAgree());
		base.button(locators.getSubmit());
		base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		 
	    
	}
	
	@Then("user takes screenshot of confirmation message")
	public void user_takes_screenshot_of_confirmation_message() {
	 base.ElementToPresent(locators.getConfirmmess());
	 base.scrolldown(locators.getConfirmmess());
	 base.ss("cofimation message");
	}


}
