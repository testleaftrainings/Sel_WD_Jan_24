package week2.day1;

public class LearnSwitchCase {

	public static void main(String[] args) {
		int browser=1;
		//String day ="Friday";
		switch (browser) {
		case 1 :
			System.out.println("Mon");
			break;
		case 2 :
			System.out.println("Tus");
			break;
		case 3 :
			System.out.println("Wed");
			break;
		case 4 :
			System.out.println("Thus");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}
		

	}

}
