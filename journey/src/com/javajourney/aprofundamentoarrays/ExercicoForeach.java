package com.javajourney.aprofundamentoarrays;

import java.util.Arrays;

public class ExercicoForeach {

  public static void main(String[] args) {
    double [] notasAlunoA = new double[3];
    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 8;
    notasAlunoA[2] = 6.7;

    double mediaAlunoA =0;
    for(double nota:notasAlunoA){
      System.out.println(nota + " passou no loop");
      mediaAlunoA+= nota;

    }
    System.out.println("Elementos do array: " + Arrays.toString(notasAlunoA));
    System.out.println(mediaAlunoA/3);


    final double NOTA_AMARZENADA = 5.9;
    double [] notasAlunoB = { 6.9, 8.9, NOTA_AMARZENADA, 10 };

    double mediaAlunoB = 0;
    for(double nota: notasAlunoB){
      System.out.println(nota + " nota passando no loop");
      mediaAlunoB +=nota;
    }
    System.out.println(mediaAlunoB/4);
  }

}
