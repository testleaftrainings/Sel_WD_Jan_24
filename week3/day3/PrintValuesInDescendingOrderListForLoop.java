package week2.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintValuesInDescendingOrderListForLoop {
	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
		String[] companyName= {"HCL", "Wipro",  "Aspire Systems", "CTS"};

		//Initialize an empty list
		List<String> companyList=new ArrayList<String>();


		//Iterate the values from companyName
		for (int i = 0; i < companyName.length; i++) {

			//To add the values in List
			companyList.add(companyName[i]);
		}
		System.out.println(companyList);
		//To get the how many elements in the list
		int size = companyList.size();
		System.out.println(size);
		//To get the particular object from the list
		String string2 = companyList.get(2);
		System.out.println("using get method"+string2);
		//To iterate the values in list
		for(int i=0;i<size;i++) {
			String string = companyList.get(i);
			System.out.println(string);
		}
		
		
		







	}
}
