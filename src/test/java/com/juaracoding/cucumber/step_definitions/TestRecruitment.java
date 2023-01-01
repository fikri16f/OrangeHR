package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.juaracoding.cucumber.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRecruitment {
	
	 private static WebDriver driver;
	    private static ExtentTest extentTest;
	    private RecruitmentPage recruitmentPage = new RecruitmentPage();

	    public TestRecruitment() {
	        driver = Hooks.driver;
	        extentTest = Hooks.extentTest;
	    }
	
	 // Test Case One}
	    @When("User go to recruitment page")
		public void user_go_to_recruitment_page() {
	    	recruitmentPage.clickBtnRecruitment();
	        extentTest.log(LogStatus.PASS, "User click button login valid");
		}
		@And("User click button add")
		public void user_click_button_add() {
			recruitmentPage.clickBtnAdd();
	        extentTest.log(LogStatus.PASS, "User click button login valid");
		}
		@Then("User go to add candidate page")
		public void user_go_to_add_candidate_page() {
			AssertJUnit.assertEquals(recruitmentPage.getTxtaddCandidate(), "Add Candidate");
	    	Assert.assertTrue(recruitmentPage.getTxtaddCandidate().contains("Add Candidate"));
	    	extentTest.log(LogStatus.PASS, "User berada pada halaman Add Candidate");
		}
		
				   
		@When("user Input field dengan benar")
		public void user_input_all_field() throws InterruptedException {
			recruitmentPage.inputCandidate1("Jhon", "F","Kennedy");
			recruitmentPage.selectVacan("Associate IT Manager");
			recruitmentPage.inputCandidate2("aneh@gmail.com", "12345678901");
			recruitmentPage.selectFile("C:/Users/Tiara/Downloads/data.txt");
			recruitmentPage.inputCandidate3("-","","lanjutkan");
			recruitmentPage.clickCheckBox();
			recruitmentPage.btnSave();
			  extentTest.log(LogStatus.PASS, "User input all field true"); 	
		}
		 
		@And("user klik button save")
		public void user_click_button_save() {
						
		}
					
		@Then("User success input")
		public void user_berhasil_input() {
						
		}
}
