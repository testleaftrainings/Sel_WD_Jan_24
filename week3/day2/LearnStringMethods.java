package week2.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnStringMethods {
public static void main(String[] args) {
	
	//Initialize the String
	String text="TEST";
	//I want to print all the letter should be lowercase
	String lowerCase = text.toLowerCase();
	
	System.out.println("lowerCase "+lowerCase);
	
	//Initialize the String
	String str1="leaf";
	//I want to print all the letter should be Capital

String upperCase = str1.toUpperCase();
	System.out.println("upperCase "+upperCase);
	
	//print length of the String
	int len = text.length();
	System.out.println(len);
	
	
	//Initialize the String
	String str2="testleaf";
	//t,e,s,t,l,e,a,f
	char firstLetter='a';
	//converted string into character
	char[] charArray = str2.toCharArray();
	//Iterate the values from charArray
	                     //8
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
	
	
	
	String text1="I,like,chicken,briyani";
	String[] split = text1.split(",");
	
	//System.out.println(Arrays.toString(split));
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	
	String email="testleaf12345@gmail.com";
	String replaceAll = email.replaceAll("[0-9]", "");
	
	System.out.print(replaceAll);

	String name="aravind";
	String replaceCharacter = name.replace('a', '@');
	System.out.println(replaceCharacter);
	
	
	
	
	
	
	
	
}
}
