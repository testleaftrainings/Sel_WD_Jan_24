package week2.day2;

public class Calculator {

	float sum; //Global variable
	String a;
	
	public void addition() {
		int a = 10;
		int b = 20;
		int sum =a+b;
		System.out.println(sum);
		
	}
	
	private void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	protected float mul(float a, float b)  {
			float  result=a*b;
			return result;
	} 
	void div(double a,int b) {
		System.out.println(a/b);
		
	}
	
	public static void main(String[] args) {	
		//Create object
		Calculator cal =new Calculator();
		cal.addition();
		cal.div(23.5, 2);
		cal.sub(10, 34);
		float output = cal.mul(2.3f, 3.2f);//ctrl+2+l	
		System.out.println();
		System.out.println(cal.sum);
		System.out.println(cal.a);
		
	}

}
