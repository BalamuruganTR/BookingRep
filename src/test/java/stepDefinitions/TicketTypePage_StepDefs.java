package stepDefinitions;

import cucumber.api.java.en.When;
import pageObjects.TicketTypePage_pageObject;

public class TicketTypePage_StepDefs extends TicketTypePage_pageObject{
	@When("Click Standard ticket type")
	public void click_Standard_ticket_type() {
		next_button();
	}
}
