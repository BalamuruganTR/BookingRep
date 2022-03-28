package pageObjects;

import org.baseUtils.BaseC;
import org.openqa.selenium.By;

public class TicketTypePage_pageObject extends BaseC {
	
	private By next_button=By.xpath("(//button[.='Next'])");

	public void next_button() {
		waitForElement(next_button).click();
	}
}
