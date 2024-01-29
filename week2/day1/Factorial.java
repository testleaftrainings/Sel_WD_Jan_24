package week2.day1;

public class Factorial {

	public static void main(String[] args) {
		int input=5;
		int var=1;//2  6  24 120
		for (int i = 1; i <=input; i++) {
			//fact=fact*i;
			var*=i;//1*1=1   1*2=2   2*3=6   6*4=24  24*5=120 
			System.out.println(var);
		}
		
	}

}
