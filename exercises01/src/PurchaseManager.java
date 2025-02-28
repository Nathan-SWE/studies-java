/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

import java.util.Scanner;
import java.util.Locale;

public class PurchaseManager{
  public static void main(String args[]){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int id1, id2, qntd1, qntd2;
    double valor1, valor2, total;

    System.out.println("Informe o id, quantidade e valor unitario da peça 1:");
    
    id1 = sc.nextInt();
    qntd1 = sc.nextInt();
    valor1 = sc.nextDouble();
    
    System.out.println("Informe o id, quantidade e valor unitario da peça 2:");
    
    id2 = sc.nextInt();
    qntd2 = sc.nextInt();
    valor2 = sc.nextDouble();

    total = (qntd1 * valor1) + (qntd2 * valor2);

    System.out.printf("Valor a pagar: R$ %.2f", total);
    sc.close();
  }
}