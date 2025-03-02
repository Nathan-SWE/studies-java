/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
*/

import java.util.Scanner;
import java.util.Locale;

public class RangeInterval {
  public static void main (String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double number = sc.nextDouble();
    sc.close();

    if (number >= 0 && number <= 25){
      System.out.printf("Intervalo [0, 25]");
      return;
    }
    if (number >= 25 && number <= 50){
      System.out.printf("Intervalo [25, 50]");
      return;
    }
    if (number >= 50 && number <= 75){
      System.out.printf("Intervalo [50, 75]");
      return;
    }
    if (number >= 75 && number <= 100){
      System.out.printf("Intervalo [75, 100]");
      return;
    }

    System.err.println("Fora de intervalo");
  }
}
