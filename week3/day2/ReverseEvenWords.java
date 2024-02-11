package week2.day2;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReverseEvenWords {
public static void main(String[] args) {
	
	String text="i love chicken briyani";
	// 0 1    2        3
	//i love chicken briyani
	   // i evol chicken inayirb
	
	//to split the sentences by using spliut method
	String[] split = text.split(" ");
	//Iterate the va;lues from split
	for (int i = 0; i < split.length; i++) {
		//check if the condition has match
		if(i%2!=0) {
			//converted string into character
			char[] charArray = split[i].toCharArray();
			//rever the words by using reverse for loop
		for(int j=charArray.length-1;j>=0;j--) {
			//print the string
			System.out.print(charArray[j]);
	}
	}else {
		//print values
		System.out.print(" ");
		System.out.print(split[i]+" ");
	}
	
	
	
}
}
}
