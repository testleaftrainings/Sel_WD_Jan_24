package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnCatch {
	static FileInputStream fis;
public static void main(String[] args) throws IOException {
	
	try {
		fis = new FileInputStream("src/main/resources/config_english.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Program excute succefully");
	Properties prop=new Properties();
	prop.load(fis);
}
}
