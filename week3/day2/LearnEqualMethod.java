package week2.day2;

public class LearnEqualMethod {
public static void main(String[] args) {
	
	String text1="testleaf";
	String text2="testleaf";
	
	if(text1==text2) {
		System.out.println("Both are equal");
	}else {
		System.out.println("not equal");
	}
	
	
	String str1=new String("TestLeaf");
	String str2=new String("lestLeaf");
	
	if(str1.equals(str2)) {
		System.out.println("by using new keyword "+"Both are equal");
	}else {
		System.out.println("by using new keyword "+"not equal");
	}
	
	
	
	
	
	if(str1==str2) {
		System.out.println("by using new keyword "+"Both are equal");
	}else {
		System.out.println("by using new keyword "+"not equal");
	}
}
}
