package week1.day2;

public class LearnSelection {

	public static void main(String[] args) {
		int mark=50;
		
		if(mark<34) {
			System.out.println("Fail");
		}
		else if((mark==35) | (mark==50)) {
			System.out.println("c");
		}
		
		else {
			System.out.println("Enter valid number");
		}
		
		int age=17;
		if(age>=18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not Eligible");
		}
		
	}
}

