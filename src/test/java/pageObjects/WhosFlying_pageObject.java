package pageObjects;

import org.baseUtils.BaseC;
import org.openqa.selenium.By;

public class WhosFlying_pageObject extends BaseC {
	
	private By contact_mail=By.xpath("//input[@name='email']");
	private By contact_phone=By.id("phone");
	private By passenger1_firstName=By.name("passengers.0.firstName");
	private By passenger1_lastName=By.name("passengers.0.lastName");
	private By passenger1_gender=By.name("passengers.0.gender");

	private By passenger2_firstName=By.name("passengers.1.firstName");
	private By passenger2_lastName=By.name("passengers.1.lastName");
	private By passenger2_gender=By.name("passengers.1.gender");

	private By passenger3_firstName=By.name("passengers.2.firstName");
	private By passenger3_lastName=By.name("passengers.2.lastName");
	private By passenger3_gender=By.name("passengers.2.gender");

	private By passenger4_firstName=By.name("passengers.3.firstName");
	private By passenger4_lastName=By.name("passengers.3.lastName");
	private By passenger4_gender=By.name("passengers.3.gender");

	private By passenger5_firstName=By.name("passengers.4.firstName");
	private By passenger5_lastName=By.name("passengers.4.lastName");
	private By passenger5_gender=By.name("passengers.4.gender");

	private By passenger6_firstName=By.name("passengers.5.firstName");
	private By passenger6_lastName=By.name("passengers.5.lastName");
	private By passenger6_gender=By.name("passengers.5.gender");

	private By passenger7_firstName=By.name("passengers.6.firstName");
	private By passenger7_lastName=By.name("passengers.6.lastName");
	private By passenger7_gender=By.name("passengers.6.gender");

	private By month1=By.xpath("(//input[@name='month'])[1]");
	private By day1=By.xpath("(//input[@name='day'])[1]");
	private By year1=By.xpath("(//input[@name='year'])[1]");
	private By month2=By.xpath("(//input[@name='month'])[2]");
	private By day2=By.xpath("(//input[@name='day'])[2]");
	private By year2=By.xpath("(//input[@name='year'])[2]");
	
	private By next_button=By.xpath("(//button[.='Next'])");

	public void enterMailId(String id) {
		waitForElement(contact_mail).sendKeys(id);
	}

	public void enterMobileNmr(String nmr) {
		find(contact_phone).sendKeys(nmr);
	}

	public void passenger1_firstName(String name) {
		find(passenger1_firstName).sendKeys(name);
	}

	public void passenger1_lastName(String name) {
		find(passenger1_lastName).sendKeys(name);
	}

	public void passenger1_gender(String gender) {
		char c = gender.toUpperCase().charAt(0);
		selectByValue(find(passenger1_gender), "" + c);
	}

	public void passenger2_firstName(String name) {
		find(passenger2_firstName).sendKeys(name);
	}

	public void passenger2_lastName(String name) {
		find(passenger2_lastName).sendKeys(name);
	}

	public void passenger2_gender(String gender) {
		char c = gender.toUpperCase().charAt(0);
		selectByValue(find(passenger2_gender), "" + c);
	}

	public void passenger3_firstName(String name) {
		find(passenger3_firstName).sendKeys(name);
	}

	public void passenger3_lastName(String name) {
		find(passenger3_lastName).sendKeys(name);
	}

	public void passenger3_gender(String gender) {
		char c = gender.toUpperCase().charAt(0);
		selectByValue(find(passenger3_gender), "" + c);
	}

	public void passenger4_firstName(String name) {
		find(passenger4_firstName).sendKeys(name);
	}

	public void passenger4_lastName(String name) {
		find(passenger4_lastName).sendKeys(name);
	}

	public void passenger4_gender(String gender) {
		char c = gender.toUpperCase().charAt(0);
		selectByValue(find(passenger4_gender), "" + c);
	}

	public void passenger5_firstName(String name) {
		find(passenger5_firstName).sendKeys(name);
	}

	public void passenger5_lastName(String name) {
		find(passenger5_lastName).sendKeys(name);
	}

	public void passenger5_gender(String gender) {
		char c = gender.toUpperCase().charAt(0);
		selectByValue(find(passenger5_gender), "" + c);
	}

	public void passenger6_firstName(String name) {
		find(passenger6_firstName).sendKeys(name);
	}

	public void passenger6_lastName(String name) {
		find(passenger6_lastName).sendKeys(name);
	}

	public void passenger6_gender(String gender) {
		char c = gender.toUpperCase().charAt(0);
		selectByValue(find(passenger6_gender), "" + c);
	}

	public void passenger7_firstName(String name) {
		find(passenger7_firstName).sendKeys(name);
	}

	public void passenger7_lastName(String name) {
		find(passenger7_lastName).sendKeys(name);
	}

	public void passenger7_gender(String gender) {
		char c = gender.toUpperCase().charAt(0);
		selectByValue(find(passenger7_gender), "" + c);
	}

	
	public void next_button() {
		waitForElement(next_button).click();
	}
	public void  child1(String a,String b,String c) {
		find(month1).sendKeys(a);
		find(day1).sendKeys(b);
		find(year1).sendKeys(c);
	}
	public void  child2(String a,String b,String c) {
		find(month2).sendKeys(a);
		find(day2).sendKeys(b);
		find(year2).sendKeys(c);
	}


}
