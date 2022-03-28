package pageObjects;

import java.time.Duration;

import org.baseUtils.BaseC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightPage_pageObject extends BaseC {
	private  By oneWays = By.xpath("//ul[@class='css-17g2hv0-radio-group']/li[2]");
	private  By whereFrom = By
			.xpath("//div[@class='css-195ievx-inputContainer']/div/div/div");
	private By enter_whereFrom = By.xpath("(//input[@data-testid='searchbox_origin_input' and @type='text'])[1]");
	private By select = By.xpath("//ul[@class='css-1t69qnr']/li");
	private By whereTo = By.xpath("(//input[@data-testid='searchbox_destination_input' and @type='text'])[1]");
	private By date = By.xpath("(//div[@role='button'])[3]");
	private By search = By.xpath("//button[.='Search']");
	private By overlap = By.xpath("//div[@data-testid='search_loading_overlay']");
	private By classType = By.xpath("//select[@class='css-1k0jlfl']");
	private By adult = By.xpath("//select[@class='css-1k0jlfl']/following :: div[3]");
	private By done_traveler = By.xpath("//button[.='Done']");
	private By select_flight = By.xpath("//button[.='Select']");
	private By direct_flight = By.xpath("//div[3][.='Direct flights only']");

	public void select_flight() {
		find(select_flight).click();
	}

	public void whereFrom(String from) {
		waitForElement(whereFrom).click();
		waitForElement(enter_whereFrom);
		find(enter_whereFrom).sendKeys(Keys.BACK_SPACE+from);
		find(select).click();
	}

	public void whereTo(String to) {
		waitForElement(By.cssSelector("input[placeholder='Where to?']"));
		WebElement where = driver.findElement(By.cssSelector("input[placeholder='Where to?']"));
		mouseClick(where);
		find(whereTo).sendKeys(to);
		find(select).click();
	}

	public void classType() {
		BaseC.selectByValue(find(classType), "PREMIUM_ECONOMY");
	}

	public void adult_inc(int a) {
		find(adult).click();
		for (int i = 1; i < a; i++)
			find(adult).findElement(By.xpath("(//button[@class='css-153jucu'])")).click();
		find(done_traveler).click();
	}

	public void child_inc(int a) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(find(adult)));
		waitForElement(adult).click();
		for (int i = 0; i < a; i++) {
			find(adult).findElement(By.xpath("(//button[@class='css-153jucu'])[2]")).click();
		}
		BaseC.selectByValue(find(By.cssSelector("select[name='children'][id='__bui-6']")), "10");
		BaseC.selectByValue(find(By.cssSelector("select[name='children'][id='__bui-7']")), "15");
		waitForElement(done_traveler).click();
	}

	public void click_oneWays() {
		find(oneWays).click();
	}

	public void search() {
		find(search).click();
	}

	public void overLap() {
		try {
			find(overlap);
			hold(find(overlap));
		} catch (NoSuchElementException e) {
			System.out.println("no overlap");
		}
	}

	public void direct_flight() {
		find(direct_flight).click();
	}

	public void date() {
		find(date).click();
		driver.findElement(By.xpath("//div[2]/table/tbody/tr/td[.='1']")).click();
	}
	public void method() {
		date();
		direct_flight();
	}

}
