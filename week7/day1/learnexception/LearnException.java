package learnexception;

public class LearnException {
public static void main(String[] args) {
	
	int a=10;
	System.out.println(a);
	          //0,1,2,3,..5
	int[] num= {1,2,3,4,5,6};
	
	try {
		System.out.println(a/0);
		try {
			System.out.println(num[7]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (ArrayIndexOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Program execute successfully");
}
}
