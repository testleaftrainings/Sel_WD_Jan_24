package week4.day2;

import week4.day1.Car;

public class LearnConstructor {
	int num;
	String name="CTS";
	boolean isWorking;
	
	public void keyword(String name) {
		System.out.println(this.isWorking+"This keyword");
		return;
	}
	public LearnConstructor run() {
		this.keyword("HP");
		System.out.println("This keyword");
		return this;
	}
	public LearnConstructor() {
		this("Testleaf");
		System.out.println("I am Default constructor");
	}
	public LearnConstructor(String name) {
		this("Qeagle",15);
		System.out.println("parameterized constructor ");
	}
	public LearnConstructor(String name,int num) {
		this.name=name;
		
		System.out.println("Two parameterized constructor ");
	}
	public static void main(String[] args) {
		LearnConstructor lc =new LearnConstructor("Testleaf",15);
		System.out.println(lc.num);
		System.out.println(lc.name);
		System.out.println(lc.isWorking);
		
	}

}
