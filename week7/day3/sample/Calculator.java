package sample;

public final  class Calculator {

	final static int a=10;
	
	public final void addition() {
		System.out.println("Addition");
	}
	public  void addition(int a) {
		System.out.println("Addition");
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		
		//a= 50;
		System.out.println(a);
	}
}
