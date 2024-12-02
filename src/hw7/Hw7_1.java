package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Hw7_1 {
	public static void main(String[] args) {
		try {

			final String fileName = "Sample.txt";
			
			String line; 
			long characterCount = 0;
			long lineCount = 0;
			
			File file = new File(Hw7_1.class.getClassLoader().getResource("hw7/" + fileName).getPath());
	        FileInputStream fileInputStream = new FileInputStream(file); 
	        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); 
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 

	        while ((line = bufferedReader.readLine()) != null) {
	        	lineCount++;
                characterCount += line.length(); 
	        } 
			
			System.out.println(fileName + "檔案共有" + file.length() + "個位元組," + characterCount + "個字元," + lineCount + "列資料");
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
