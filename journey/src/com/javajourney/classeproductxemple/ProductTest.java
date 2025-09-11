package com.javajourney.classeproductxemple;

public class ProductTest {
  /*
    Instanciando um produto - classe define tipo (o tipo e Product)
    Acessando os atributos dessa instancia
   */
  public static void main(String[] args) {

    Product product1 = new Product();

    product1.nome = "Notebook";
    product1.preco = 4500.00;
    product1.desconto = 0.25;

    Product product2 = new Product();
    product2.nome = "Mouse";
    product2.preco = 100.00;
    product2.desconto = 0.30;

    System.out.println(product2.nome);
    System.out.println(product1.nome);

    double finalPriceProduct1 = product1.discountedPrice();
    double finalPriceProduct2 = product2.preco * (1- product2.desconto);
    double mediaPrice = (finalPriceProduct1 + finalPriceProduct2) / 2;
    System.out.printf("Média do carrinho = R$%.2f.", mediaPrice);
  }
}
