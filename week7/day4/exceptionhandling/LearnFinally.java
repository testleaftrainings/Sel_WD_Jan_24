package exceptionhandling;

public class LearnFinally {
public static void main(String[] args) {
	int a=10;
	try {
		System.out.println(a / 0);
	} finally {
		System.out.println("Program excute successfully");
	}
	
}
}
