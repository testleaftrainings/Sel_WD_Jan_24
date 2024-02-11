package week2.day2;

public class LearnEqualIgnoreCase {
public static void main(String[] args) {
	
	
	
	String str1=new String("TestLeaf");
	String str2=new String("testLeaf");
	
	if(str1.equalsIgnoreCase(str2)) {
		System.out.println("by using new keyword "+"Both are equal");
	}else {
		System.out.println("by using new keyword "+"not equal");
	}
	
	
}
}
