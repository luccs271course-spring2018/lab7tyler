package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {
	public static void main(String[] args) {
		// TODO read successive input lines until EOF, then print out in reverse order

		LinkedStack<Character> s = new LinkedStack<Character>();

		System.out.println("Please hit the Enter key to start the program...");
		final Scanner input = new Scanner(System.in);
		String line;
		while ((line = input.nextLine()) != null) {
			line = input.next();
			System.out.println(line);
			for(int i = 0; i < line.length(); i++){
				s.push(line.charAt(i));
			}

			String print = "";
			for(int i = 0; i < line.length(); i++){
				print += s.pop();
			}

			System.out.println(print);
		}


	}
}
