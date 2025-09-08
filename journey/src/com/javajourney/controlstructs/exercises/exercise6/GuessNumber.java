package com.javajourney.controlstructs.exercises.exercise6;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
  /*
    [en] Guessing game. The player must try to guess a number between 0-100, in 10 attempts.
    [pt] Jogo da adivinhação. O jogador deve tentar adivinhar um número entre 0-100, em 10 tentativas.
   */

  public static void main(String[] args) {

    Scanner scannerInput = new Scanner(System.in);
    int continuePlay;
    int drawnNumber;
    int attempts;
    int guessNumber;

    do {
      System.out.println("Drawing a number between 0 and 100...\n");
      Random randomNumber = new Random();
      drawnNumber = randomNumber.nextInt(101);

      System.out.println("The game has started! Try to beat me.");
      attempts = 0;

      do {
        attempts++;
        System.out.printf("Attempts %d: ", attempts);
        guessNumber = scannerInput.nextInt();

        if (guessNumber > drawnNumber) {

          System.out.printf("\nthe drawn number is < than %d\n\n", guessNumber);

        } else if (guessNumber < drawnNumber) {

          System.out.printf("\nthe drawn number is > than  %d\n\n", guessNumber);

        } else {

          System.out.printf("\nCongrats! You guessed the number in %d attempts!\n\n", attempts);
          break;
        }

      } while (attempts != 10);

      System.out.println("Enter 0 to exit, or any other number to continue: ");
      continuePlay = scannerInput.nextInt();

    } while (continuePlay != 0);

    scannerInput.close();
  }
}



