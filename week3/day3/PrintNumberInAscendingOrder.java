package week2.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrintNumberInAscendingOrder {

	public static void main(String[] args) {
		int[] num={40,50,70,30,10,};

		List<Integer> number=new ArrayList<Integer>();
	//Itearate the values from num Array
		for (int i = 0; i < num.length; i++) {
			number.add(num[i]);
		}
		
		System.out.println(number);
		
	}
}
