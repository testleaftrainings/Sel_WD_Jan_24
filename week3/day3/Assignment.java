package week2.day3;

public class Assignment {
public static void main(String[] args) {
	String text="i love india food";
	//output i LOVE india FOOD
	
	//Segreate the String into words
	String[] split = text.split(" ");
	
	//Itearte the values from split
	for (int i = 0; i < split.length; i++) {
		//If it is match will split odd index value
		if(i%2!=0) {
			//System.out.println(split[i]);
			//Converted String into character
			char[] charArray = split[i].toCharArray();
			//Iterate the values from charArray
			for (int j = 0; j < charArray.length; j++) {
				//System.out.println();
				char upperCase = Character.toUpperCase(charArray[j]);
				System.out.print(upperCase);
			}
		}
		else {
			System.out.print(" ");
			System.out.print(split[i]+" ");
		}
	}
	
	
	
}
}
