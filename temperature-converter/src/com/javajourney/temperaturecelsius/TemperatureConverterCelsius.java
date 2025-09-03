package com.javajourney.temperaturecelsius;

import java.util.Scanner;

public class TemperatureConverterCelsius {

  public static void main(String[] args) {
    Scanner scannerSystem = new Scanner(System.in);

    double celciusTemperature;
    System.out.println("Enter the Celsius temperature here: ");
    celciusTemperature = scannerSystem.nextDouble();

    double temperatureFinal;
    temperatureFinal = (celciusTemperature * 1.8) + 32;
    System.out.println("The temperature is: " + String.format("%.2f", temperatureFinal) + "°F");


    scannerSystem.close();
  }

}
