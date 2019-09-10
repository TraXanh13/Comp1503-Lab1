package main;

import java.util.Scanner;
/*
import java.io.File;
import java.io.FileNotFoundException;
*/

public class Lab01 {
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		Lab01 lab01 = new Lab01();
		lab01.run();
	}

	public void run() {
		while(kb.hasNext()) {
			String word = kb.next().trim().replaceAll("[^a-zA-Z]", "");
			if(word.length() > 0) {
				System.out.println(word);				
			}
		}
	}
	
	/*
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		Lab01 lab01 = new Lab01();
		lab01.run();
	}

	public void run() {
		String fileName = "";
		System.out.println("Input file name:");
		fileName = kb.nextLine();
		readIn(new File(fileName));
		//writeOut(fileContent);
	}


	private static String readIn(File file) {
		String fileContent = "";
		try(Scanner fileScanner = new Scanner(file)){
			while (fileScanner.hasNext()) {
				System.out.println(fileScanner);
			}
			System.out.println(fileContent);
			return fileContent;
		} catch (FileNotFoundException fnfe) {
			System.err.println("File not found");
		}
		return fileContent;
	}

	private static void writeOut() {
		
	}
	 */
}
