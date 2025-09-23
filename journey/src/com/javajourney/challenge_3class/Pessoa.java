package com.javajourney.classes.challenge_3class;

public class Pessoa {
  String nomePessoa;
  double pesoPessoa;


  Pessoa(String nomePessoa, double pesoPessoa){
    this.nomePessoa = nomePessoa;
    this.pesoPessoa = pesoPessoa;
  }

  void comerComida (Comida comida){
    if (comida != null){
      this.pesoPessoa += comida.pesoComida;
    }
  }

  String apresentar(){
    return "Eu sou o " + nomePessoa + "e tenho " + pesoPessoa + "Kg";
  }

}
