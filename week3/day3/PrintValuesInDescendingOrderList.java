package week2.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintValuesInDescendingOrderList {
public static void main(String[] args) {
	// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
	String[] companyName= {"HCL", "Wipro",  "Aspire Systems", "CTS"};

	//Initialize an empty list
	List<String> companyList=new ArrayList<String>();
	//To check If the list is empty or not
	boolean empty = companyList.isEmpty();
	System.out.println(empty);
	
	//Iterate the values from companyName
	for (int i = 0; i < companyName.length; i++) {
		
		//To add the values in List
		companyList.add(companyName[i]);
	}
	System.out.println(companyList);
	
	Collections.sort(companyList);
	System.out.println("Ascending order  "+companyList);
	Collections.reverse(companyList);
	System.out.println("Decending order  "+companyList);
		// Required Output: Wipro, HCL , CTS, Aspire Systems
}
}
