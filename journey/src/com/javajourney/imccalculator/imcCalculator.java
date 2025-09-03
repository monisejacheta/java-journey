package com.javajourney.imccalculator;

import java.util.Scanner;

public class imcCalculator {

  public static void main(String[] args) {
    /*
       [en] BMI calculator with classification
       [pt] Calculadora de IMC com classificação
       */
    Scanner scannerData = new Scanner(System.in);

    System.out.println("Enter height (cm): ");
    double heightPerson;
    heightPerson = scannerData.nextDouble();

    double heightInMeters = heightPerson / 100.0;

    System.out.println(" Enter weight (kg): ");
    double weightPerson;
    weightPerson = scannerData.nextDouble();
    scannerData.close();

    double bmiResult;
    //Validation height and weight
    if (heightPerson <= 0 || weightPerson <= 0) {
      System.out.println("Error. Weight and height must be greater than 0!");
    } else {
      bmiResult = (weightPerson / (heightInMeters * heightInMeters));

      if (bmiResult < 18.5) {
        System.out.println(
            "Your BMI is " + String.format("%.2f", bmiResult)
                + " and your classification is: underweight.");
      } else if (bmiResult < 24.9) {
        System.out.println(
            "Your BMI is " + String.format("%.2f", bmiResult)
                + " and your classification is: normal. ");
      } else if (bmiResult < 29.9) {
        System.out.println("Your BMI is " + String.format("%.2f", bmiResult)
            + " and your classification is: overweight, grade 1.");
      } else if (bmiResult < 39.9) {
        System.out.println("Your BMI is " + String.format("%.2f", bmiResult)
            + " and your classification is: obesity, grade 2.");
      } else {
        System.out.println("Your BMI is " + String.format("%.2f", bmiResult)
            + " and your classification is: severe obesity, grade 3");
      }
    }

  }

}
