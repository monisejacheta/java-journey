package com.javajourney.aprofundamentoarrays;

import java.util.Arrays;

public class Exercicio {

  public static void main(String[] args) {
    double[] notasAlunoA = new double[3];
    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 8;
    notasAlunoA[2] = 6.7;

    System.out.println("Elementos do array: " + Arrays.toString(notasAlunoA));

    double totalAlunoA = 0;
    for (int i = 0; i < notasAlunoA.length; i++) {
      totalAlunoA += notasAlunoA[i];
    }
    System.out.println("A média do aluno é: " + totalAlunoA / notasAlunoA.length);
    System.out.println("Primeira nota do aluno A é: " + notasAlunoA[0]);
    System.out.println("Ultima nota do aluno A é: " + notasAlunoA[notasAlunoA.length-1]);


    final double NOTA_AMARZENADA = 5.9;
    double[] notasAlunoB = {6.9, 8.9, NOTA_AMARZENADA, 10};

    double totalAlunoB = 0;
    for (int i = 0; i < notasAlunoB.length; i++) {
      totalAlunoB += notasAlunoB[i];
    }
    System.out.println("Media do aluno B é: " + totalAlunoB / notasAlunoB.length);

  }
}
