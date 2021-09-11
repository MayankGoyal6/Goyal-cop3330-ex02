/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 2
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("What is the input string? ");
    
    String input = scanner.nextLine();

    if (input.isEmpty())
    {
      System.out.println("Please enter the input string.");
    }
    else
    {
      int inputLength = input.length();

      System.out.println(input + " has " + inputLength + " characters." );
    }
  }
}