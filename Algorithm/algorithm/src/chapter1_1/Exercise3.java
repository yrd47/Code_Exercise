package chapter1_1;

import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 int");
		String iString = scanner.nextLine();
		String[] liStrings = iString.split(";");
		int x = Integer.parseInt(liStrings[0]);
		int y = Integer.parseInt(liStrings[1]);
		int z = Integer.parseInt(liStrings[2]);
		if (x == y && y == z) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
	}

}
