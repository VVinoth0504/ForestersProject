package BaseClass;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IBaseClass implements IUtility {

	public static WebDriver driver;
	public static Actions action;
	public static JavascriptExecutor js;
	public static Select s;
	public static WebDriverWait wait;

	@Override
	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notification");
		options.addArguments("--disable-popups");
		driver = new EdgeDriver(options);
		action = new Actions(driver);
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Override
	public void browserQuit() {
		driver.close();

	}

	@Override
	public void launchApplication(String url) {
		driver.get(url);

	}

	@Override
	public void forward() {

	}

	@Override
	public void backward() {

	}

	@Override
	public void refresh() {
		driver.navigate().refresh();

	}

	@Override
	public String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	@Override
	public String title() {
		return null;

	}

	@Override
	public boolean displayed(WebElement ele) {
		return false;

	}

	@Override
	public void parentWindow(String ParentWindow) {
		driver.switchTo().window(ParentWindow);

	}

	@Override
	public void childWindow() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if (!x.equals(parent)) {
				driver.switchTo().window(x);
			}

		}

	}

	@Override
	public void button(WebElement ele) {
		ele.click();

	}

	@Override
	public void sendText(WebElement ele, String inputValue) {
		ele.sendKeys(inputValue);

	}

	@Override
	public void mouseOver(WebElement ele) {

	}

	@Override
	public void switchFrameusingId(String id) {

	}

	@Override
	public void switchFrameusingName(String name) {

	}

	@Override
	public void switchFrameusingWebElement(WebElement ele) {

	}

	@Override
	public void alertSendText(Alert a, String inputText) {

	}

	@Override
	public void ss(String imgName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\src\\test\\resources\\" + imgName + ".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

	@Override
	public void SelectVisibleText(WebElement ele, String visibleText) {
		s.selectByVisibleText(visibleText);

	}

	@Override
	public List<WebElement> options(WebElement ele) {
		s = new Select(ele);
		List<WebElement> options = s.getOptions();
		return options;

	}

	@Override
	public void button(WebElement ele, int x) {

	}

	@Override
	public void button(int x, WebElement ele) {

		action.click().build().perform();

	}

	@Override
	public void sendText(String inputValue, WebElement ele) {

	}

	@Override
	public void sendText(String inputValue, WebElement ele, int x) {

	}

	@Override
	public void scrolldown(WebElement ele) {
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

	}

	@Override
	public void SelectByIndex(WebElement ele, int index) {
		s = new Select(ele);
		s.selectByIndex(index);

	}

	

	@Override
	public void ElementToClickable(WebElement ele) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}

	@Override
	public List<WebElement> getAllSelectedoption(String x, WebElement ele) {
		s = new Select(ele);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement x2 : allSelectedOptions) {
			String text = x2.getText();
			System.out.println(text);
		}
		
		return null;
	}

	@Override
	public void ElementToPresent(WebElement ele) {
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

	

	

	

}
