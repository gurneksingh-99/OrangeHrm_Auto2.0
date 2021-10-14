package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.*;
import ReadData.ReadData;

public class DeleteDef {
	@Given("I have Already Logged in OrangeHrm and opened Report pannel")
	public void i_have_already_logged_in_orange_hrm_and_opened_report_pannel() {
	  try { LoginPage.lpage(ReadData.config("url"));
	   DashboardPage.pimTab();
	   ReportTab.Report();
System.out.println("Delete given1");
	}catch (Exception e) {
		System.out.println("Error Delete given1");
	}}

	@Given("I have selected reports to delete")
	public void i_have_selected_reports_to_delete() {
	  try {
	    ReportTab.selectreport();
		System.out.println("Delete given2");
		}catch (Exception e) {
			System.out.println("Error Delete given2");
		}}

	@When("I click on Delete button and Click on Ok button")
	public void i_click_on_delete_button_and_click_on_ok_button() {
		  try {
			  ReportTab.deletereport();
		  
		  ReportTab.Okbtn();
		  System.out.println("Delete When");
		  }
		  catch (Exception e) {
			System.out.println("Error Delete when");
		}
		}

	@Then("The selected report should be deleted succesfully")
	public void the_selected_report_should_be_deleted_succesfully() {
	   
		System.out.println("Delete Then");
		Locators.close();}

}
