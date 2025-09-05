package com.javajourney.controlstructs;

import java.util.Scanner;

public class ChallangeDayOfWeekIf {

  public static void main(String[] args) {
    Scanner inputDay = new Scanner(System.in);
    System.out.print("Enter day: ");
    String weekDay = inputDay.next();

    if("domingo".equalsIgnoreCase(weekDay)){
      System.out.println(1);
    }
    else if("segunda".equalsIgnoreCase(weekDay)){
      System.out.println(2);
    }
    else if("terça".equalsIgnoreCase(weekDay) || "terca".equalsIgnoreCase(weekDay)){
      System.out.println(3);
    }
    else if("quarta".equalsIgnoreCase(weekDay)){
      System.out.println(4);
    }
    else if("quinta".equalsIgnoreCase(weekDay)){
      System.out.println(5);
    }
    else if("sexta".equalsIgnoreCase(weekDay)){
      System.out.println(6);
    }
    else if("sabado".equalsIgnoreCase(weekDay)){
      System.out.println(7);
    }
    else{
      System.out.println("Dia inválido.");
    }

    inputDay.close();
  }

}
