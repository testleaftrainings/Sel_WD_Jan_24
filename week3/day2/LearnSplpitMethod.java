package week2.day2;

public class LearnSplpitMethod {
public static void main(String[] args) {
	
	//Initialize a String
	String name="I  like  chicken   briyani  ";
	//f,a,e,l,t,s,e,t
	String[] split = name.split("\\s+");
	
	//Iterate the values from charArray
	            //8 -1
	for (int i =  0;i<split.length; i++) {
		System.out.println(split[i]);
	}
	
	String text="test";
	char charAt = text.charAt(1);
	System.out.println(charAt);
	
}
}
