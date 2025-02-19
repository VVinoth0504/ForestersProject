package Stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseClass.IBaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass {
	IBaseClass base = new IBaseClass();
	
	@Before
	public void startBrowser(Scenario scenario) {
		base.browserLaunch();
	
	}
	
	@After
	public void endBrowser(Scenario scenario) {
	  final byte[] by = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
	   scenario.embed(by, "image/png");
	  
		
	}
}
