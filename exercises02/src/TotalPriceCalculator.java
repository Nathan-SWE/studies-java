/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

1  Cachorro quente R$ 4.00
2  X-Salada        R$ 4.50
3  X-Bacon         R$ 5.00
4  Torrada simples R$ 2.00
5  Refrigerante    R$ 1.50
*/

import java.util.Scanner;
import java.util.Locale;
import java.util.Map;

public class TotalPriceCalculator {
  public static void main (String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe o id do seu pedido e a quantidade:");
    
    double total;
    int id = sc.nextInt();
    int qntd = sc.nextInt();
    sc.close();
    
    Map<Integer, Double> dicionario = Map.of(
      1, 4.00,
      2, 4.50,
      3, 5.00,
      4, 2.00,
      5, 1.50
    );
    
    if (dicionario.containsKey(id)){
      total = qntd * dicionario.get(id);
      System.out.printf("Total: R$ %.2f", total);
      return;
    }
    
    System.out.println("ID inválido! Por favor, informe um Id entre 1 e 5.");
  }
}
