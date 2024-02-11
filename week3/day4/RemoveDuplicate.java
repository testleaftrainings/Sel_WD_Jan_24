package week3.day4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String[] input={"Testleaf","Testleaf","Princila","Akila"};
		//output==>Testlaf
		Character[] val = {'a','s','d','r'};
		//char[] charArray = input.toCharArray();//'T''e''s''t''l''e'a'f'
		//Set<Character> set =new LinkedHashSet<Character>(Arrays.asList(val));
		Set<String> setName =new LinkedHashSet<String>(Arrays.asList(input));
		//for (int i = 0; i < charArray.length; i++) {
		//	setName.add(charArray[i]);
			System.out.println(setName);
		//}
		
		
	
		

	}

}
