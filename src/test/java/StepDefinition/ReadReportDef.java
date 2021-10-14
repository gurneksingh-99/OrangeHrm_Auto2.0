package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.*;
import ReadData.ReadData;
public class ReadReportDef {
	@Given("I have Already Logged in OrangeHrm And opened Report pannel")
	public void i_have_already_logged_in_orange_hrm_and_opened_report_pannel() {
	  try {  LoginPage.lpage(ReadData.config("url"));
	    DashboardPage.pimTab();
	    ReportTab.Report();
	    ReportTab.addreport();
	    ReportTab.newreportname("test");
	    ReportTab.adddisplayfield();
	    ReportTab.Savereport();
		//System.out.println("REad");
	}catch (Exception e) {
		System.out.println("Error in ReadReport Deff given");
	}
	}
	@When("I click on Run button")
	public void i_click_on_run_button() {
	 try {   ReportTab.runreport();
		//System.out.println("REad");
	}
catch (Exception e) {
System.out.println("Error in ReadReport Deff When");
}}
	@Then("Then The respective Report should open")
	public void then_the_respective_report_should_open() {
	 try {  
		System.out.println("REad");
		Locators.close();
	}catch (Exception e) {
		System.out.println("Error in ReadReport Deff Then");
	}
}
}
