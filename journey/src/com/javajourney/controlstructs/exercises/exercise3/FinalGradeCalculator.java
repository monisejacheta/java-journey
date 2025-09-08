package com.javajourney.controlstructs.exercises.exercise3;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class FinalGradeCalculator {



  public static void main(String[] args) {

    Scanner partialGrade = new Scanner(System.in);
    System.out.print("Enter with grade 1: ");
    int gradeOneScanner = partialGrade.nextInt();

    System.out.print("Enter with grade 2: ");
    int gradeTwoScanner = partialGrade.nextInt();

    double finalGrade = (double) (gradeOneScanner + gradeTwoScanner) /2;

    if(finalGrade >= 7.0){
      System.out.println("Student aproved! Grade: " + finalGrade);
    }else if (finalGrade <7 && finalGrade>=4){
      System.out.println("Recovery. Grade: " + finalGrade);
    }else {
      System.out.println("Reproved. Grade: " + finalGrade);
    }
    partialGrade.close();

  }
}
