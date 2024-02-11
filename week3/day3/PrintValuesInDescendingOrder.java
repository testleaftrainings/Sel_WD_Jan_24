package week2.day3;

import java.util.Arrays;

public class PrintValuesInDescendingOrder {
public static void main(String[] args) {
	// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
	String[] companyName= {"HCL", "Wipro",  "Aspire Systems", "CTS"};

		// get the length of the array		
	int len = companyName.length;

		// sort the array	
	Arrays.sort(companyName);

		// Iterate it in the reverse order
	for (int i = companyName.length-1;i>=0 ;i--) {
		// print the array
		System.out.println(companyName[i]);
	}

		
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems
}
}
