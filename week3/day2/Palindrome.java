package week2.day2;

public class Palindrome {
public static void main(String[] args) {
	
	String text="Madam";
	
	//initialize an empty String as reverse
	String reverse="";
	//Converted the String into character
	char[] charArray=text.toCharArray();
	//Iterate the values from charArray by using reverse 
	// for loop
	for(int i =charArray.length-1;i>=0;i--){
	//System.out.println(charArray[i]);
	reverse=reverse+charArray[i];
	System.out.println(reverse);
	}
	System.out.println(reverse);
	//Whether we have to check the given String is palindrome or not
	if(text.equalsIgnoreCase(reverse)) {
		System.out.println("The given String is a palindrome");
	}else {
		System.out.println("not a palindrome");
	}
}
}
