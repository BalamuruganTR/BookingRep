package pageObjects;

import java.time.Duration;

import org.baseUtils.BaseC;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckAndPay_pageObject extends BaseC {
	BaseC b = new BaseC();
	private By cardHolder_name = By.xpath("//div/input[@name='name']");
	private By card_number = By.xpath("//input[@name='number']");
	private By card_type = By.cssSelector("button[data-testid=\"cardtypeselector\"]");
	private By card_expiryDate = By.name("expirationDate");
	private By cvc = By.name("cvc");
	private By pay_now=By.xpath("//button/span[.='Pay now']");

	public void cardHolder_name(String name)  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[title='Payment']")));
		b.waitForElement(cardHolder_name).sendKeys(name);
	}

	public void card_number(String nmr) {
		waitForElement(card_number).sendKeys(nmr);
	}

	public void card_type() {
		waitForElement(card_type).click();
		find(By.xpath("//li/button/div[.='Visa']")).click();
	}
	public void card_expirationDate() {
		waitForElement(card_expiryDate).sendKeys("05/27");
	}
	public void cvc(String nmr) {
		find(cvc).sendKeys(nmr);
	}
	public void click_pay_now() {
		driver.switchTo().defaultContent();
		waitForElement(pay_now).click();
	}

}
