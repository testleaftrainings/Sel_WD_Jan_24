package week5.day3;

import org.testng.annotations.Test;

public class Lead {

	@Test(priority = -3)
	public void createLead() {
		System.out.println("Create Lead");
	}
	@Test(priority = 2,enabled = false)
	public void editLead() {
		System.out.println("Edit Lead");
	}
	@Test(priority = 2)
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	@Test(priority = 1)
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
}
