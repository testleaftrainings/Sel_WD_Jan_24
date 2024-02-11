package week3.day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<Integer> nums = new TreeSet<Integer>();
		nums.add(97);
		nums.add(45);
		nums.add(34);
		nums.add(75);
		nums.add(34);
		nums.add(75);
		nums.add(98);
		nums.add(75);
		nums.add(98);
		// print my set
		System.out.println(nums);
		// [97, 34, 98, 75, 45] HashSet
		// [34, 45, 75, 97, 98] TreeSet
		// [97, 45, 34, 75, 98] LinkedHashSet
		// print length of size of set
		System.out.println(nums.size());
		// remove
		System.out.println(nums.remove(56));
		System.out.println(nums.add(56));
		// print my set
		System.out.println(nums);
		// contains
		System.out.println(nums.contains(34));
		// clear
		//nums.clear();
		// print my set
		System.out.println(nums);
		// contains
		System.out.println(nums.contains(34));
		//isEmpty
		System.out.println(nums.isEmpty());
		Set<Integer> newSet = new TreeSet<Integer>();
		newSet.addAll(nums);
		newSet.add(10);
		newSet.add(20);
		System.out.println(newSet);
		//remove all
		boolean removeAll = newSet.removeAll(nums);
		System.out.println(removeAll);
		System.out.println(newSet);
		System.out.println(nums);
		
		for (Integer output : nums) {
			System.out.println(output);
		}
		
		
		//convert Set into List
		List<Integer> lstName =new ArrayList<Integer>(nums);
		//lstName.addAll(nums);
		System.out.println(lstName);
		
		for (int i = 0; i < lstName.size(); i++) {
			System.out.println(lstName.get(i));
		}
		
		
		
	}

}
