package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_pageObject {
	WebDriver driver;

	public HomePage_pageObject(WebDriver driver) {
		this.driver = driver;
	}

	private final By flights = By.xpath("(//ul[@class='bui-tab__nav'])[1]/li[2]");

	public void click_Flights() {
		driver.findElement(flights).click();
	}

}
