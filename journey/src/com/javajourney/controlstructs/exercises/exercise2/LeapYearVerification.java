package com.javajourney.controlstructs.exercises.exercise2;

import java.util.Scanner;

/**
 * [en] This program verifies if the year entered by the user is a leap year. A leap year is a year
 * divisible by 4 but not by 100, unless it's also divisible by 400.
 * [pt]  Esse programa verifica se o ano inserido pelo usuário é bissexto. Um ano bissexto é um ano divisível por 4 mas não por 100,
 * a menos que também seja divisível por 400.
 */

public class LeapYearVerification {

  public static void main(String[] args) {
    Scanner inputYear = new Scanner(System.in);
    System.out.print("Enter year: ");
    int yearByUser = inputYear.nextInt();

    boolean isLeapYear = ((yearByUser % 4 == 0 && yearByUser % 100 != 0) || yearByUser % 400 == 0);

    if (isLeapYear) {
      System.out.println(yearByUser + " is a leap year.");
    } else {
      System.out.println(yearByUser + " is not a leap year.");
    }
  }

}
