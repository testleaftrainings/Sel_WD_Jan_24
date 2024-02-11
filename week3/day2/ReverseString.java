package week2.day2;

public class ReverseString {
public static void main(String[] args) {
	
	//Initialize a String
	String name="testleaf";
	//f,a,e,l,t,s,e,t
	char[] charArray = name.toCharArray();
	
	//Iterate the values from charArray
	            //8 -1
	for (int i =  charArray.length-1;i>=0; i--) {
		System.out.print(charArray[i]);
	}
	
	
}
}
