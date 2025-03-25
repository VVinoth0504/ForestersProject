package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.IBaseClass;

public class ForesterLocators {
	
	IBaseClass base = new IBaseClass();
	
	public ForesterLocators() {
		PageFactory.initElements(base.driver, this);
	}
	
	@FindBy(xpath ="//button[@class='btn dropdown-toggle regions']")
	private WebElement login;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right dropdown-login show']//descendant::li/a[text()='MyForesters']")
	private WebElement myfor;
	
	@FindBy(id="username")
	private WebElement name;
	
	@FindBy(id ="password")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@class='button-primary']")
	private WebElement forlogin;
	
	@FindBy(xpath="//div[@class='error-message']")
	private WebElement loginmess;
	

	@FindBy(xpath="//a[@class='btn connect-btn']")
	private WebElement contactus;

	@FindBy(xpath ="//main[@id='mainContent']//a[text()='service@foresters.com']")
	private WebElement emailid;
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[10]/p[2]/text()[2]")
	private WebElement tollfree;
	
	@FindBy(xpath = "//div[@class='universalcascadingselectlist']/select")
	private WebElement howWe;
	
	@FindBy(xpath = "//div[@class='child-ddl']/select")
	private WebElement subject;
	
	@FindBy(xpath="//textarea[@placeholder='Max 500 characters']")
	private WebElement MyAddInfo;
	
	
	@FindBy(xpath="//input[@data-sc-field-name='FirstName']")
	private WebElement firstName;

	
	@FindBy(xpath="//input[@data-sc-field-name='LastName']")
	private WebElement lasttName;
	
	
	@FindBy(xpath="//input[@data-sc-field-name='Telephone']")
	private WebElement phNum;
	
	@FindBy(xpath="//input[@data-sc-field-name='Single-Line Text']")
	private WebElement ext;
	
    @FindBy(xpath="//input[@data-sc-field-name='ToEmail']")
	private WebElement mailId;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement conPre;
	
	@FindBy(xpath="//input[@data-sc-field-name='ZipCode']")
	private WebElement zipcode;
	
	@FindBy(xpath="//input[@data-sc-field-name='PolicyNumber']")
	private WebElement extPolNum;
	
	@FindBy(xpath="//label[@class='label-1 terms-label required']")
	private WebElement agree;
	
	@FindBy(xpath="//input[@type=\"hidden\" and@style=\"display: none;\"]/following-sibling::input[@type=\"submit\" and @value=\"Submit\"]")
	private WebElement submit;
	
	@FindBy(xpath="//p[contains(text(),'Thank you for your submission. Please ')]")
	private WebElement confirmmess;
	
	@FindBy(xpath="//li/a[@class='country-option ']/span[text()='Canada: English']")
	private WebElement caneng;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement contin;
	
	@FindBy(xpath="//li/a[@class='country-option ' and @data-value='fr-ca']")
	private WebElement canfran;
	
	@FindBy(xpath="//li/a[@class='country-option ']/span[text()='Royaume-Uni']")
	private WebElement uk;
	
	@FindBy(xpath="//li/a[@class='country-option ']/span[text()='United States']")
	private WebElement us;
	
	@FindBy(xpath="//div[@class='country-select__trigger']/div[@aria-controls='countrySelector']")
	private WebElement countryop;
	
	@FindBy(id="#menuItemFullContent3desktop")
	private WebElement memberBenefit;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']//ul[@class='dropdown-header list-group']/li/a[text()='MyForesters App']")
	private WebElement MyForestersApp;
	
	@FindBy(xpath="//a[text()='For agents']")
	private WebElement forAgents;
	
	@FindBy(xpath="//input[@data-sc-field-name='firstName']")
	private WebElement forAgentfirstName;
	
	@FindBy(xpath="//input[@data-sc-field-name='lastName']")
	private WebElement forAgentLasttName;
	
	@FindBy(xpath="//input[@data-sc-field-name='phone']")
	private WebElement forAgentPhone;
	
	@FindBy(xpath="//input[@data-sc-field-name='Poste']")
	private WebElement forAgentExt;
	
	@FindBy(xpath="//input[@data-sc-field-name='email']")
	private WebElement forAgentEmailId;
	
	@FindBy(xpath="//input[@data-sc-field-name='companyName']")
	private WebElement forAgentcompany;
	
	@FindBy(xpath="//input[@data-sc-field-name='Single-Line Text']")
	private WebElement forAgentcity;
	
	@FindBy(xpath="//select[@data-sc-field-name='stateDropdownList']")
	private WebElement forAgentstate;
	
	@FindBy(xpath="//select[@data-sc-field-name='productsDropdownList']")
	private WebElement forAgentproduct;
	
	@FindBy(xpath="//textarea[@data-sc-field-name='other']")
	private WebElement forAgentothers;
	
	@FindBy(xpath="//input[@value='Contact me']")
	private WebElement forAgentContactMe;
	
	@FindBy(xpath="//p[text()='Thank you for the submission']")
	private WebElement forAgentconMsg;
	
	
	
	
	
	
	
	public WebElement getForAgentconMsg() {
		return forAgentconMsg;
	}




	public WebElement getCountryop() {
		return countryop;
	}




	public WebElement getMemberBenefit() {
		return memberBenefit;
	}




	
	public WebElement getMyForestersApp() {
		return MyForestersApp;
	}




	
	public WebElement getForAgents() {
		return forAgents;
	}




	
	public WebElement getForAgentfirstName() {
		return forAgentfirstName;
	}




	
	public WebElement getForAgentLasttName() {
		return forAgentLasttName;
	}




	
	public WebElement getForAgentPhone() {
		return forAgentPhone;
	}




	
	public WebElement getForAgentExt() {
		return forAgentExt;
	}




	
	public WebElement getForAgentEmailId() {
		return forAgentEmailId;
	}




	
	public WebElement getForAgentcompany() {
		return forAgentcompany;
	}




	
	public WebElement getForAgentcity() {
		return forAgentcity;
	}




	
	public WebElement getForAgentstate() {
		return forAgentstate;
	}




	
	public WebElement getForAgentproduct() {
		return forAgentproduct;
	}




	public WebElement getForAgentothers() {
		return forAgentothers;
	}



	public WebElement getForAgentContactMe() {
		return forAgentContactMe;
	}




	public WebElement getCaneng() {
		return caneng;
	}



	
	public WebElement getContin() {
		return contin;
	}



	
	public WebElement getCanfran() {
		return canfran;
	}



	
	public WebElement getUk() {
		return uk;
	}



	
	public WebElement getUs() {
		return us;
	}



	public WebElement getLoginmess() {
		return loginmess;
	}
	
	
	
	public WebElement getConfirmmess() {
		return confirmmess;
	}






	public WebElement getZipcode() {
		return zipcode;
	}





	
	public WebElement getExtPolNum() {
		return extPolNum;
	}





		public WebElement getAgree() {
		return agree;
	}





	
	public WebElement getSubmit() {
		return submit;
	}





	public WebElement getFirstName() {
		return firstName;
	}




	
	public WebElement getLasttName() {
		return lasttName;
	}




	
	public WebElement getPhNum() {
		return phNum;
	}




	
	public WebElement getExt() {
		return ext;
	}




	
	public WebElement getMailId() {
		return mailId;
	}




	
	public WebElement getConPre() {
		return conPre;
	}




	public WebElement getMyAddInfo() {
		return MyAddInfo;
	}




	public WebElement getSubject() {
		return subject;
	}

	
	

	public WebElement getHowWe() {
		return howWe;
	}

	public WebElement getContactus() {
		return contactus;
	}


	
	public WebElement getEmailid() {
		return emailid;
	}


	
	public WebElement getTollfree() {
		return tollfree;
	}


	public IBaseClass getBase() {
		return base;
	}

	
	public WebElement getLogin() {
		return login;
	}

	
	public WebElement getMyfor() {
		return myfor;
	}

	
	public WebElement getName() {
		return name;
	}

	
	public WebElement getPwd() {
		return pwd;
	}

	
	public WebElement getForlogin() {
		return forlogin;
	}
	

}
