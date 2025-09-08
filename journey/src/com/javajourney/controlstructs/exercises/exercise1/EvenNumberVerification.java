package com.javajourney.controlstructs.exercises.exercise1;

import java.util.Scanner;

/**
 * [en] This program verifies if a number entered by the user is even and within the range 0-10.
 * [pt] Este programa verifica se um número inserido pelo usuario é par e está dentro do intervalo
 * 0-10.
 */

public class EvenNumberVerification {

  public static void main(String[] args) {
    Scanner inputNumber = new Scanner(System.in);
    System.out.print("Enter number: ");
    int numberByUser = inputNumber.nextInt();

    // [en] Check if the number is within the valid range
    // [pt] Verifique se o número está dentro do intervalo valido
    boolean isValidRange = (numberByUser >= 0 && numberByUser <= 10);

    if (isValidRange) {
      if (numberByUser % 2 == 0) {
        System.out.println("The number is valid and even.");
      } else {
        System.out.println("The number is valid but odd.");
      }
    } else {
      System.out.println("Invalid number. The number is not in the range 0-10.");
    }

    inputNumber.close();
  }

}
