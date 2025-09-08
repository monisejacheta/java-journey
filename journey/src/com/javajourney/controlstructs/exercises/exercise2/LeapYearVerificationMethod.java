package com.javajourney.controlstructs.exercises.exercise2;

import java.time.Year;
import java.util.Scanner;

  /**
   * [en] This program verifies if the year entered by the user is a leap year with specific method.
   * [pt]  Esse programa verifica se o ano inserido pelo usuário é bissexto com um metodo especifico.
   */

public class LeapYearVerificationMethod {

  public static void main(String[] args) {

    Scanner yearScanner = new Scanner(System.in);
    System.out.println("Enter year: ");
    int year = yearScanner.nextInt();

    //Checks if the year is a leap year with specific method
    boolean leapYear = Year.isLeap(year);
    if (leapYear) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }

    yearScanner.close();


  }
}
