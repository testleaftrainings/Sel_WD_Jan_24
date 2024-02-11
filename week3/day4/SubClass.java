package week3.day4;

import week3.day1.LearnImplicitWait;

public class SubClass  {

	
	static {
		System.out.println("I am static block");
	}
	
	
	public static void main(String[] args) {
		String name = LearnStatic.name;
		System.out.println(name="Qeagle");
		LearnStatic.run();
		

	}

}
