package com.javajourney.controlstructs;

import java.util.Scanner;

public class IfElseIfExemple {

  public static void main(String[] args) {
    /*
    [en] Basic example of control structure with Else If
    [pt] Exemplo básico de estrutura de controle com Else If
     */
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the final grade: ");

    double noteStudent = input.nextDouble();
    if (noteStudent > 10 || noteStudent < 0) {
      System.out.println("Invalid final grade.");
    } else if (noteStudent >= 8.1) {
      System.out.println("The final grade is A");
    } else if (noteStudent >= 6.1) {
      System.out.println("The final grade is B");
    } else if (noteStudent >= 4.1) {
      System.out.println("The final grade is C");
    } else if (noteStudent >= 2.1) {
      System.out.println("The final grade is D");
    } else {
      System.out.println("The final grade is E");
    }
    System.out.println("Finished.");
    input.close();
  }
}
