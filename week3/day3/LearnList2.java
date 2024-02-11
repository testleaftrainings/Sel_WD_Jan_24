package week2.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList2 {

	public static void main(String[] args) {
		List<Integer> obj=new ArrayList<Integer>();
		//List<String> obj2=new LinkedList<String>();
		obj.add(29);
		obj.add(10);
		obj.add(55);
		obj.add(1);
		
		System.out.println(obj);
		
		Collections.sort(obj);
		
		System.out.println(obj);
		
		Collections.reverse(obj);
		System.out.println(obj);
		
	}
}
