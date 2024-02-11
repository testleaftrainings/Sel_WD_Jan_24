package week3.day4;

public class LearnStatic {
    int num;
	static String name="Testleaf";
	
    public static void run() {
    	
    	System.out.println(name);
    	System.out.println("Running");
    }
    public  void print() {
    	System.out.println(name);
    	System.out.println(num);
    	System.out.println("printing");
    }
    public static void main(String[] args) {
    	
       int num = 10 ;
       
       System.out.println(num);
       System.out.println(name);
       run();
      // print();

	}

}
