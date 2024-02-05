package week2.day2;

import java.util.Arrays;

public class LearrnArrays {

	public static void main(String[] args) {
		//Arrays Literal
		int[] values= {90,94,97,87,67};//len start with 1
		//index start with 0
		String[] names = {"Avila","KARTHIK","Kannan","Ashwin","Ashwin"};
		//Arrays Instantiation
		String[] companys =new String[3];
		companys[0] ="Testleaf";
		companys[1]="Qeagle";
		companys[2]="CTS";
		
		//get size of the arrays
		int len = values.length;
		System.out.println(len);
		System.out.println(values.length);
		//print Array
		for (int i = 0; i <values.length; i++) {
			System.out.println(values[i]);
		}
		//specific value  based on index
		System.out.println(names[2]);
		//last value from array
		System.out.println(companys[companys.length-1]);
		//sort the arrays arrange the array in order
		Arrays.sort(values);//90,94,97,87,67
		//67 87 90 94 97
		//second largest number
		System.out.println(values[len-2]);
       // 3 5 2 1 ==>4  1 2 3 5
	}

}
