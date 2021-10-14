package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.LoginPage;
import pages.DashboardPage;
import ReadData.ReadData;
import pages.ReportTab;
public class ResetDef {

@Given("I Logged into OrangeHrm and have opened Reports Pannel")
public void i_logged_into_orange_hrm_and_have_opened_reports_pannel() {
  try{//Login
	LoginPage.lpage(ReadData.config("url"));
  //Dashboard then PIM
	DashboardPage.pimTab();
  //ReportTab
	ReportTab.Report();
	//System.out.println("step1.1 is passed");
}catch (Exception e) {
	System.out.println("Error in ResetDeff given");
}}

@Given("I Have searched a report")
public void i_have_searched_a_report() {
    try {
    	ReportTab.inputReportName("PIM");
    
    ReportTab.searchreport();
//System.out.println("Step 1.2 is passed");
}
catch (Exception e) {
	System.out.println("Error in ResetDeff given2");
}}
@When("I click on Reset Button")
public void i_click_on_reset_button() {
   try {ReportTab.resetreport();
  // System.out.println("Step 2 is passed");
}catch (Exception e) {
	System.out.println("Error in ResetDeff When");
}
}
@Then("The searched result should be reset to default view")
public void the_searched_result_should_be_reset_to_default_view() {
  // System.out.println("Step 3 passed");
   Locators.close();
}

}
