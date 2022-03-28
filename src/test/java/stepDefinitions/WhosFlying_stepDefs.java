package stepDefinitions;

import java.io.IOException;
import org.baseUtils.ExcelRead;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.WhosFlying_pageObject;

public class WhosFlying_stepDefs extends WhosFlying_pageObject {
	ExcelRead d= new ExcelRead();
	@Given("Entering contact details")
	public void entering_contact_details()  {	
		enterMailId("bala@gmail.com");
		enterMobileNmr("9876554321");
	}
	@When("Entering the passanger details")
	public void entering_the_passanger_details() throws IOException {
		passenger1_firstName(d.cellId("A2"));
		passenger1_lastName(d.cellId("B2"));
		passenger1_gender(d.cellId("C2"));
		
		passenger2_firstName(d.cellId("A3"));
		passenger2_lastName(d.cellId("B3"));
		passenger2_gender(d.cellId("C3"));
		
		passenger3_firstName(d.cellId("A4"));
		passenger3_lastName(d.cellId("B4"));
		passenger3_gender(d.cellId("C4"));
		
		passenger4_firstName(d.cellId("A5"));
		passenger4_lastName(d.cellId("B5"));
		passenger4_gender(d.cellId("C5"));
		
		passenger5_firstName(d.cellId("A6"));
		passenger5_lastName(d.cellId("B6"));
		passenger5_gender(d.cellId("C6"));
		
		passenger6_firstName(d.cellId("A7"));
		passenger6_lastName(d.cellId("B7"));
		passenger6_gender(d.cellId("C7"));
		child1("10", "3", "2006");
		
		passenger7_firstName(d.cellId("A8"));
		passenger7_lastName(d.cellId("B8"));
		passenger7_gender(d.cellId("C8"));
		child2("10", "3", "2011");
//		
		next_button();
	}
}
