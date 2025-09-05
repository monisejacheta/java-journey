package com.javajourney.controlstructs;

import java.util.Scanner;

public class ChallengeDayOfTheWeek {

  public static void main(String[] args) {
    /*
      [en] Basic program to return a number according to the written day of the week.
      [pt] Programa basico para retornar um numero de acordo com o dia da semana escrito.
     */

    Scanner inputDay = new Scanner(System.in);

    System.out.println("Enter with a day: ");
    String  dayOfWeek = inputDay.next().toLowerCase();

    switch (dayOfWeek){
      case "sunday":
        System.out.println("1");
        break;
      case "monday":
        System.out.println("2");
        break;
      case "tuesday":
        System.out.println("3");
        break;
      case "wednesday":
        System.out.println("4");
        break;
      case "thursday":
        System.out.println("5");
        break;
      case "friday":
        System.out.println("6");
        break;
      case "saturday":
        System.out.println("7");
        break;
    }

    System.out.println("This program was closed.");
    inputDay.close();

  }

}
