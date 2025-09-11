package com.javajourney.classeproductxemple;
  /*
  Definindo os atributos da classe
   */
public class Product {
  String nome;
  double preco;
  double desconto;

  double discountedPrice (){
    return preco * (1-desconto);
  }
}


