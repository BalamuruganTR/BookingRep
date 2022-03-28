package stepDefinitions;

import java.util.List;

import org.baseUtils.BaseC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.FlightPage_pageObject;

public class HomePage_StepDefs {
	FlightPage_pageObject f = new FlightPage_pageObject();

	@Given("Select the Onway option")
	public void Select_the_Onway_option() {
		f.click_oneWays();
		f.classType();
		f.adult_inc(5);
		f.child_inc(2);
	}

	@When("Enter the Booking Details")
	public void Enter_the_Booking_Details() {
		f.whereFrom("chennai");
		f.whereTo("delhi");
		f.date();
		f.search();
		f.overLap();
		f.direct_flight();
	}

	@Then("Select the lowest flight")
	public void lowest_flight() {
		List<WebElement> list = BaseC.listData("//div[@data-test-id='flight_card_price_main_price']");
		double a = 0, b = 0, index = 0;
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			String s = text.replaceAll("[a-zA-Z\\p{Punct}&&[^.]]", "");
			double f = Double.parseDouble(s);
			a = f;
			if (b == 0 || b > a || b == a) {
				b = a;
				index = i;
			}
			System.out.println(index);
		}
		f.find(By.xpath("(//button[.='See flight'])[" + index + "]")).click();
		f.select_flight();
	}

}
