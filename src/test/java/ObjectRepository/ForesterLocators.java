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
