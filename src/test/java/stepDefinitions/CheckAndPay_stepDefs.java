package stepDefinitions;

import cucumber.api.java.en.Then;
import pageObjects.CheckAndPay_pageObject;

public class CheckAndPay_stepDefs extends CheckAndPay_pageObject {
	@Then("Enter payment details")
	public void payment() {
		cardHolder_name("XXX");
		card_number("12345678901211");
		card_type();
		card_expirationDate();
		cvc("777");
		click_pay_now();
	}
}
