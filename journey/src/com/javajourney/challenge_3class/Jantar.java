package com.javajourney.classes.challenge_3class;

public class Jantar {

  public static void main(String[] args) {
    Comida comida1 = new Comida("lasanha", 0.952);

    Comida comida2 = new Comida("prato feito", 0.786);

    Pessoa pessoaQueVaiComer = new Pessoa("Roberto", 95.0);

    System.out.println(pessoaQueVaiComer.apresentar());
    pessoaQueVaiComer.comerComida(comida1);

    System.out.println(pessoaQueVaiComer.apresentar());
    pessoaQueVaiComer.comerComida(comida2);

    System.out.println(pessoaQueVaiComer.apresentar());
  }

}
