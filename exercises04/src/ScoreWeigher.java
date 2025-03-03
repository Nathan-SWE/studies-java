/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
*/

import java.util.Scanner;
import java.util.Locale;

public class ScoreWeigher {
  public static void main (String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe quantas notas serao calculadas: ");
    int n = sc.nextInt();

    double mediaPonderada;
    int peso1 = 2, peso2 = 3, peso3 = 5;

    for (int i = 0; i < n; i++){
      System.out.printf("Informe os 3 %d°'s valores a serem ponderados:\n", i+1);

      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();

      mediaPonderada = ((a * peso1) + (b * peso2) + (c * peso3)) / (peso1 + peso2 + peso3);

      System.out.printf("%.1f\n", mediaPonderada);
    }

    sc.close();
  }
}
