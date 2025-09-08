package com.javajourney.controlstructs.exercises.exercise5;

import java.util.Scanner;

public class PrimeNumberValidation {
  /*
    [en] Checks if the number entered by the user is a prime number.
    [pt] Verifica se o número inserido pelo usuário é um número primo.
   */

  public static void main(String[] args) {
    int divisorCounter = 0;
    Scanner inputNumero = new Scanner(System.in);

    System.out.println("\nEnter a number to check if it's prime:");
    int testNumber = inputNumero.nextInt();

    for (int i = 2; i < testNumber; i++) {
      if (testNumber % i == 0) {
        divisorCounter++;
      }
    }

    if (divisorCounter == 0) {

      System.out.println("\nThe number " + testNumber + " is prime number.");
    } else {
      System.out.println("\nThe number  " + testNumber + " is not prime number.");
    }

    inputNumero.close();
  }

}
