package com.javajourney.controlstructs;

import javax.swing.JOptionPane;

public class IfElseControlExemple {

  public static void main(String[] args) {
    /*
    [en] Basic example of control structure
    [pt] Exemplo básico de estrutura de controle
     */

    //[en]Rarely used method to open a dialog box and receive input value | [pt] Metodo pouco utilizado para abrir caixa de diálogo e receber valor de entrada
    String value = JOptionPane.showInputDialog("Enter a number: ");
    int number = Integer.parseInt(value);

    if (number % 2 == 0) {
      System.out.println("This number is even!");
    } else {
      System.out.println("This number is even odd!");
    }
  }
}
