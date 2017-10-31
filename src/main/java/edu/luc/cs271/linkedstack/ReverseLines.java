package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {
  public static void main(String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    // TODO recursively read and print successive input lines until EOF, then print them out in
    // reverse order

    if (input.hasNextLine()) {
      String inpu = input.nextLine();
      System.out.println(inpu);
      printReverse(input);
      System.out.println(inpu);
    } else {
      return;
    }
  }
}
