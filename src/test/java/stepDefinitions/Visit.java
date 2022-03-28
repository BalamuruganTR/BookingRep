package stepDefinitions;

import org.baseUtils.BaseC;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage_pageObject;

public class Visit {
	
	@Given("goto main url")
	public void goto_main_url() {
		BaseC.start();
		BaseC.navigate("https://www.booking.com/");
	}
	@When("go to Flights")
	public void go_to_flights() {
		HomePage_pageObject h=new HomePage_pageObject(BaseC.driver);
		h.click_Flights();
	}
	@Then("Close the browser")
	public void end() throws InterruptedException {
		Thread.sleep(6000);
		BaseC.quit();
	}
}
