package stepDefinitions;

import cucumber.api.java.en.When;
import pageObjects.BaggageAndExtra_pageObject;

public class BaggageAndExtra_stepDefs extends BaggageAndExtra_pageObject {
	@When("leave default")
	public void leave_default() {
		next_button();
	}
}
