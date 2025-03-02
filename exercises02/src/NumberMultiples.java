/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
*/

import java.util.Scanner;

public class NumberMultiples {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    int a, b;

    System.out.println("INFORME DOIS NUMEROS INTEIROS E DESCUBRA SE SAO MULTIPLOS:");

    a = sc.nextInt();
    b = sc.nextInt();

    boolean saoMultiplos = a % b == 0 || b % a == 0;

    if (saoMultiplos){
      System.out.println("SAO MULTIPLOS");
      sc.close();
      return;
    }

    System.out.println("NAO SAO MULTIPLOS");
    sc.close();
  }
}