package com.javajourney.temperaturefahrenheit;

import java.util.Scanner;

public class TemperatureConverterFahrenheit {
  /*
       [en] Temperature converter from Fahrenheit to Celsius
       [pt] Conversor de temperatura de Fahrenheit para Celsius
       */

  public static void main(String[] args) {
    Scanner scannerSystem = new Scanner(System.in);

    double fahrenheitTemperature;
    System.out.println("Enter the Fahrenheit temperature here: ");
    fahrenheitTemperature = scannerSystem.nextDouble();

    double temperatureFinal;
    temperatureFinal = (fahrenheitTemperature - 32) / 1.8;
    System.out.println("The temperature is: " + String.format("%.2f", temperatureFinal) + "°C");

    scannerSystem.close();
  }


}
