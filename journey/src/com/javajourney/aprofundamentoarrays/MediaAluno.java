package com.javajourney.aprofundamentoarrays;

import java.util.Locale;
import java.util.Scanner;

public class MediaAluno {

  public static void main(String[] args) {
    Scanner scannerNotas = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Quantas notas você gostaria de informar? ");
    int totalNotas = scannerNotas.nextInt();

    double[] notasAluno = new double[totalNotas];

    for (int i = 0; i < notasAluno.length; i++) {
      System.out.println("Informe a nota " + (i + 1) + ": ");
      notasAluno[i] = scannerNotas.nextDouble();

    }
    double totalNotasAluno = 0;
    for (double somaNotas : notasAluno) {
      totalNotasAluno += somaNotas;
    }

    double mediaFinalAluno = totalNotasAluno / notasAluno.length;
    System.out.println("a média final é: " + mediaFinalAluno);

    scannerNotas.close();
  }

}
