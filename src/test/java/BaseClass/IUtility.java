package BaseClass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public interface IUtility {
	public void browserLaunch();
	public void browserQuit();
	public void launchApplication(String url);
	public void forward();
	public void backward();
	public void refresh();
	public String currentUrl();
	public String title();
	public boolean displayed(WebElement ele);
	public void parentWindow(String ParentWindow);
	public void childWindow();
	public void button(WebElement ele);
	public void sendText(WebElement ele, String inputValue);
	public void mouseOver(WebElement ele);
	public void switchFrameusingId(String id);
	public void switchFrameusingName(String name);
	public void switchFrameusingWebElement(WebElement ele);
	public void alertSendText(Alert a, String inputText);
	public void ss(String imgName);
	public void SelectVisibleText(WebElement ele, String visibleText);
	public void SelectByIndex(WebElement ele, int index);
	public  List<WebElement> options(WebElement ele);
	public void button(WebElement ele, int x);
	public void button(int x, WebElement ele);
	public void sendText(String inputValue, WebElement ele);
	public void sendText(String inputValue, WebElement ele, int x);
	public void scrolldown(WebElement ele);
	public List<WebElement> getAllSelectedoption(String x ,WebElement ele);
	public void ElementToClickable(WebElement ele);
	public void ElementToPresent(WebElement ele);
	public  String getText(WebElement ele);
	
	
	
	

}
