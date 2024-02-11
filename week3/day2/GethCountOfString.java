package week2.day2;

public class GethCountOfString {
public static void main(String[] args) {
	
	String text="Amazon has 20,000 employess in chennai";
	
	//To segrerate the given string
	String[] split = text.split(" ");
	
	int length = split.length;
	System.out.println(length);
	
	int count=0;
	
	for (int i = 0; i < split.length; i++) {
		//0 =0+1
	//	1 when i=1-->1=1+1
		count=count+1;
	}
	System.out.println(count);
	
	String replaceAll = text.replaceAll("[^0-9]", "");
	System.out.println(replaceAll);
	
	
	String text2="testleaf";
	
	char charAt = text2.charAt(5);
	System.out.println("char "+charAt);
	
	
	
}
}
