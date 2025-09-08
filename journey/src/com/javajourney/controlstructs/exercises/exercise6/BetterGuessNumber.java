package com.javajourney.controlstructs.exercises.exercise6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BetterGuessNumber {
   /*
    [en] Guessing game. The player must try to guess a number between 0-100, in 10 attempts.
    Second solution, with code updates including programming improvements and modernization.
    [pt] Jogo da adivinhação. O jogador deve tentar adivinhar um número entre 0-100, em 10 tentativas. 
    Segunda resolução, com atualizações de código com melhorias de programação e modernização.
   */

  // [en] Creating constants to set the number of attempts and the maximum limit of the range
  // [pt] Criando constantes para fixar o numero de tentativas e do limite maximo do intervalo
  private static final int MAX_ATTEMPTS = 10;
  private static final int MAX_NUMBER = 100;

  public static void main(String[] args) {

    Scanner scannerInput = new Scanner(System.in);
    int continuePlay, drawnNumber, attempts, guessNumber;

    do {
      System.out.println("Drawing a number between 0 and " + MAX_NUMBER + "...\n");
      // [en] Using ThreadLocalRandom instead of Random
      // [pt] Usando ThreadLocalRandom em vez de Random
      drawnNumber = ThreadLocalRandom.current().nextInt(MAX_NUMBER + 1);

      System.out.println("The game has started! Try to beat me.");
      attempts = 0;
      boolean hasGuessedCorrectly = false;

      while (attempts < MAX_ATTEMPTS) {
        attempts++;
        System.out.printf("Attempt %d/%d: ", attempts, MAX_ATTEMPTS);

        try {
          guessNumber = scannerInput.nextInt();

          if (guessNumber > drawnNumber) {
            System.out.printf("\nThe drawn number is LESS than %d\n\n", guessNumber);
          } else if (guessNumber < drawnNumber) {
            System.out.printf("\nThe drawn number is GREATER than %d\n\n", guessNumber);
          } else {
            System.out.printf("\nCongratulations! You guessed the number %d in %d attempts!\n\n",
                drawnNumber, attempts);
            hasGuessedCorrectly = true;
            break;
          }
        } catch (InputMismatchException e) {
          System.out.println("\nPlease enter a valid number!\n");

          // [en] Clears the scanner buffer
          // [pt] Limpa o buffer do scanner
          scannerInput.nextLine();

          // [en] Does not count as an attempt if input is invalid
          // [pt] Não conta como tentativa se entrada for invalida
          attempts--;
        }
      }

      if (!hasGuessedCorrectly) {
        System.out.printf("Game over! You've used all %d attempts. The number was: %d\n\n",
            MAX_ATTEMPTS, drawnNumber);
      }

      System.out.println("Enter 0 to exit, or any other number to continue: ");
      try {
        continuePlay = scannerInput.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Exiting the game.");

        // [en] Clears the scanner buffer
        // [pt] Limpa o buffer do scanner
        scannerInput.nextLine();
        continuePlay = 0;
      }

    } while (continuePlay != 0);

    scannerInput.close();
    System.out.println("Thanks for playing!");
  }
}

