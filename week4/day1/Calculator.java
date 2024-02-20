package week4.day1;

public class Calculator {
 static   String name="Testleaf";
   
	public void add(int a) {
      System.out.println(a);
	}

	public void add(int a, int b) {
      System.out.println(a+b);
	}

	public void add(int a, float b) {
      System.out.println(a+b);
	}

	public static void main(String[] args) {
		Calculator cal =new Calculator();
        cal.add(10);
        cal.add(30, 0.5f);
        cal.add(20, 34);
        
	}

}
