package main;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab01 {
	private static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}

	private static void run() {
		// TODO Auto-generated method stub
		readIn();
	}

	private static String readIn() {
		// TODO Auto-generated method stub
		String fileContent = "";
		System.out.println("Input file name:");
		String fileName = kb.nextLine();
		File file = new File(fileName);
		try(Scanner fileScanner = new Scanner(file)){
			while (fileScanner.hasNextLine()) {
				fileContent += fileScanner.nextLine();
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("File not found");
		}
		return fileContent;
	}
	

}
