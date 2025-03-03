/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
*/
import java.util.Scanner;

public class NumberPowersPrinter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número inteiro positivo N: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {

      double quadrado = Math.pow(i, 2);
      double cubo = Math.pow(i, 3);

      System.out.printf("%d %.0f %.0f\n", i, quadrado, cubo);
    }
    sc.close();
  }
}
