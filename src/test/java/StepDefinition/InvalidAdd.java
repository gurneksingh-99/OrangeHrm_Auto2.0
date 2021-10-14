package StepDefinition;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import ReadData.ReadData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.DashboardPage;
import pages.LoginPage;
import pages.ReportTab;
//import locators.*;

public class InvalidAdd {
	String exldata = ReadData.readExcel(0, 2);
	@Given("I am already logged in OrangeHrm and in Reports tab")
	public void i_am_already_logged_in_orange_hrm_and_in_reports_tab() {
	 try {   LoginPage.lpage(ReadData.config("url"));
	    DashboardPage.pimTab();
	    ReportTab.Report();
	   assertEquals(ReadData.config("RepUrl"),Locators.geturl());
	}
	 catch (Exception e) {
		System.out.println("Error in InvalidAdd_Deff Given");
	}
	 }

	@When("I clicked on Add Button")
	public void i_clicked_on_add_button() {
	    try {
	    	ReportTab.addreport();
	    } catch (Exception e) {
			System.out.println("Error in InvalidAdd Deff When");
		}
	    }
	  
	
	@Then("I have been redirected to Add report page")
	public void i_have_been_redirected_to_add_report_page() {
	try {    assertEquals(ReadData.config("Addrepurl"), Locators.geturl());
	}
catch (Exception e) {
	System.out.println("Error in InvalidAdd Deff Then");
}}
	@When("I enter invalid Report Name and Display Field")
	public void i_enter_invalid_report_name_and_display_field() {
		  
		try {ReportTab.newreportname(exldata);
		  ReportTab.adddisplayfield();
		  ReportTab.Savereport();
	}
catch (Exception e) {
	System.out.println("Error in InvalidAdd Deff When2");
}}
	@Then("New Employee report should not be created")
	public void new_employee_report_should_not_be_created() {
try {
		assertNotEquals(Locators.gettext("//*[@id='resultTable']/tbody/tr[1]/td[2]"),exldata,"Invalid report shopuld not be saved");
	Locators.close();
	}catch (Exception e) {
	System.out.println("Error in InvalidAdd Deff Then2");
	}
}
}