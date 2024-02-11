package week2.day3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnRemoveMethod {

	public static void main(String[] args) {
		List<String> obj=new ArrayList<String>();
		//List<String> obj2=new LinkedList<String>();
		obj.add("yogi");
		obj.add("Anil");
		obj.add("1");
		obj.add("Dilip");
		obj.add("Vinoth");
		obj.add("yogi");
		System.out.println(obj);
		
		//To remove particular object from the list, by using index
		//obj.remove(0);
		
		System.out.println(obj);
		
		obj.remove("yogi");
		System.out.println(obj);
		//To check if the exisiting object in the list
		boolean contains = obj.contains("anil");
		System.out.println(contains);
		
		
		obj.clear();
		System.out.println(obj);
		boolean empty = obj.isEmpty();
		System.out.println(empty);
		
		
		
	}
}
