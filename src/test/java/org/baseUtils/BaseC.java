package org.baseUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class BaseC  {
	public static WebDriver driver;

//NAVIGATIONS <- X -> 
	public static void refresh() {

		driver.navigate().refresh();
	}

	public static String window() {
		String window = driver.getWindowHandle();
		return window;
	}

	public static void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static Set<String> windows() {
		Set<String> windows = driver.getWindowHandles();
		return windows;
	}

	public static void forward() {

		driver.navigate().forward();
	}

	public static void back() {

		driver.navigate().back();
	}

//close & Quit	
	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static void to(String url) {

		driver.navigate().to(url);
	}

	public static WebDriver start() {
		System.setProperty("webdriver.chrome.driver", "F:\\AiiTE\\Booking\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().deleteAllCookies();
		return driver;
	}

	public WebElement waitForElement(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
		return element;
	}

	public void go(String url) {
		driver.get(url);
	}
	public static void navigate(String url) {
		driver.navigate().to(url);
	}

//FIND ELEMENT
	public WebElement find(By by) {
		waitForElement(by);
		return driver.findElement(by);
	}
	

//ALERT!!!
	public static String preMessage() {
		String text = driver.switchTo().alert().getText();
		return text;

	}

	public static String alerts(String msg) {
		driver.switchTo().alert().sendKeys(msg);
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return text;
	}

	public static String alerts() {
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return text;

	}

//Screenshot
	public static void screenshot(String name) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("./Externals/" + name + ".jpeg");
		Files.copy(source, destination);

	}

//FRAMES
	public static void frame() {
		driver.switchTo().frame(0);
	}

	public static String present_window() {
		String window = driver.getWindowHandle();
		return window;
	}

	static Set<String> tabs;

	public static Set<String> total_windows() {
		tabs = driver.getWindowHandles();
		return tabs;
	}

	public static void change_window() {
		total_windows();
		ArrayList<Object> list = new ArrayList<Object>(tabs);
		driver.switchTo().window((String) list.get(list.size() - 1));
	}

	public static void main(String[] args) {
		if (tabs == null)
			System.out.println("k");
	}

	// Actions
	public void mouseClick(WebElement element) {
		Actions a = new Actions(BaseC.driver);
		a.click(element).perform();
	}

	public static List<WebElement> listData(String path) {
		List<WebElement> list = driver.findElements(By.xpath(path));
		return list;

	}

	public void hold(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void visibleHold(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
