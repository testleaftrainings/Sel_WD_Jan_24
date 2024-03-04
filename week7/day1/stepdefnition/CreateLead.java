package stepdefnition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	  @When("Click on crmsfa hyperlink")
		public void clickCRMSFALink() {
	    	driver.findElement(By.linkText("CRM/SFA")).click();
		}
	    @Then("MyHome page should be displayed")
		public void verifyMyHomePage() {
			String actualResult="My Home | opentaps CRM";
			String expectedResult = driver.getTitle();
			if(expectedResult.equals(actualResult)) {
				System.out.println("MyHomePage displayed successfully");
			}else {
				System.out.println("MyHomePage not displayed");
			}


		}
	    @When("Click on Leads tap")
		public void clickLeadsTap() {
	    	driver.findElement(By.linkText("Leads")).click();
		}
	    @Then("MyLeads page should be displayed")
		public void verifyMyLeadsPage() {
			String actualResult="My Leads | opentaps CRM";
			String expectedResult = driver.getTitle();
			if(expectedResult.equals(actualResult)) {
				System.out.println("MyLeads Page displayed successfully");
			}else {
				System.out.println("MyLeads Page not displayed");
			}

		}
	    @When("Click on CreateLead tap")
	   	public void clickCreateLeadTap() {
	    	driver.findElement(By.linkText("Create Lead")).click();

	   	}
	    @Then("CreateLead page should be displayed")
		public void verifyCreateLeadPage() {
			String actualResult="Create Lead | opentaps CRM";
			String expectedResult = driver.getTitle();
			if(expectedResult.equals(actualResult)) {
				System.out.println("CreateLead Page displayed successfully");
			}else {
				System.out.println("CreateLead Page not displayed");
			}

		}
	    @Given("Enter the company name as testleaf")
	   	public void enterCompanyName() {
	    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

	   	}
	    @And("Enter the first name as Aravind")
	   	public void enterFirstName() {
	    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravind");

	   	}
	    @And("Enter the last name R")
	   	public void enterLastName() {
	    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");

	   	}
	    @When("Click on Create Lead button")
	   	public void clickCreateLeadButton() {
	    	driver.findElement(By.name("submitButton")).click();	

	   	}
	    
	    @Then("ViewLead page should be displayed")
	  	public void verifyViewLeadsPage() {
	  		String actualResult="View Lead | opentaps CRM";
	  		String expectedResult = driver.getTitle();
	  		if(expectedResult.equals(actualResult)) {
	  			System.out.println("ViewLead Page displayed successfully");
	  		}else {
	  			System.out.println("ViewLead Page not displayed");
	  		}

	  	}
}
