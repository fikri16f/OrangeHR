package com.juaracoding.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class RecruitmentPage {
	 private WebDriver driver;

	    public RecruitmentPage() {
	        this.driver = DriverSingleton.getDriver();
	        PageFactory.initElements(driver, this);
	    }
	
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
	    WebElement btnRecruitment;
	    
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	    WebElement btnAdd;
	    
	    @FindBy(name = "firstName")
	    WebElement firstName;

	    @FindBy(name = "middleName")
	    WebElement middleName;
	    
	    @FindBy(name = "lastName")
	    WebElement lastName;
	    
	    @FindBy(xpath = "//*[@tabindex=\"0\"]")
	    WebElement selectVacancy;
	    
	    @FindBy(xpath  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
	    WebElement email;
	    
	    @FindBy(xpath  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
	    WebElement contactNumber;
	    
	    @FindBy(xpath  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input")
	    WebElement keywords;
	    
	    @FindBy(xpath  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/div/div/input")
	    WebElement date;
	    
	    @FindBy(xpath  = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea")
	    WebElement notes;
	  	  	    
	    @FindBy(xpath  = "//i[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"]")
	    WebElement checkbox;
	    
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/input")
	    WebElement btnUpload;
	    
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6")
	    WebElement txtAddCandidate;
	    
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]")
	    WebElement btnSave;
	    
	    public void clickBtnRecruitment() {
			btnRecruitment.click();
		}
	    
	    public void clickBtnAdd(){
	        btnAdd.click();
	    }
	    
	    public String getTxtaddCandidate() {
			return txtAddCandidate.getText();
		}
	    
	    public void inputCandidate1(String firstName, String middleName, String lastName){
	        this.firstName.sendKeys(firstName);
	        this.middleName.sendKeys(middleName);
	        this.lastName.sendKeys(lastName);
	    
	    }
	    
		public void selectVacan(String index) throws InterruptedException {
			// TODO Auto-generated method stub
			Thread.sleep(1000);
			this.selectVacancy.sendKeys(index);

		}
	    
	    public void inputCandidate2( String email, String phone){
	        this.email.sendKeys(email);
	        this.contactNumber.sendKeys(phone);
	       
	    }

			
		public void selectFile(String file) throws InterruptedException {
			Thread.sleep(1000);
	        btnUpload.sendKeys(file);
		}
		
		 public void inputCandidate3( String keywords, String date, String notes){
		        this.keywords.sendKeys(keywords);
		        this.date.sendKeys(date);
		        this.notes.sendKeys(notes);
		    }
		 
		 public void clickCheckBox() throws InterruptedException{
		        checkbox.click();
		        Thread.sleep(2000);
		    }
		 
		 public void btnSave() throws InterruptedException{
		        btnSave.click();
		        Thread.sleep(4000);
		    }
		 
}
