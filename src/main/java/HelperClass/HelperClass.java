package HelperClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {

	public void launchbrowser(String url) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ecs\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

	}

	public void clickElement(WebElement element) {

		element.click();
	}

	public void sendInput (WebElement element,String value) {
		
		element.sendKeys(value);
	}
}