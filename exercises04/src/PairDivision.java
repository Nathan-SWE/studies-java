/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

import java.util.Locale;
import java.util.Scanner;

public class PairDivision {
  public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe quantos pares serao calculados:");
    int pares = sc.nextInt();
    double division;

    for(int i = 0; i < pares; i++){
      System.out.println("\nInforme as duas notas:");
      double x = sc.nextDouble();
      double y = sc.nextDouble();

      if (y == 0){
        System.out.println("divisao impossivel");
      } else {
        division = x / y;
        System.out.printf("%.1f\n", division);
      }
    }
    sc.close();
  }
}
