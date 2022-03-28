package org.baseUtils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\AiiTE\\Booking\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		WebElement table = driver.findElement(By.tagName("tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		Actions a= new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).perform();
		
			
		}
		
	}

}
