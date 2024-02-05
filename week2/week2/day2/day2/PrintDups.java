package week2.day2;

import java.util.Arrays;

public class PrintDups {

	public static void main(String[] args) {
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		
		Arrays.sort(num);//2 2  3 5 5 7 7 9
		for (int i = 0; i < num.length-1; i++) {
			
			//for (int j = i+1; j < num.length; j++) {
			
			if(num[i]==num[i+1]) {//0 1   1 2  2 3  3 4  4 5 5 6 6 7 7 8
				System.out.println(num[i]);//2 5 7
			}
		}
		}
	}


