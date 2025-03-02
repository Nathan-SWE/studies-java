/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.

*/

import java.util.Scanner;

public class FuelSurvey {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe qual combustivel deseja abastecer: \n1 - Alcool \n2 - Gasolina \n3 - Diesel \n4 - Fim");
    
    int opcao = sc.nextInt();
    int alcool = 0, gasolina = 0, diesel = 0;

    while (opcao != 4) {
      if (opcao == 1) alcool++;
      if (opcao == 2) gasolina++;
      if (opcao == 3) diesel++;

      if (opcao < 0 || opcao > 4){
        System.out.println("Opção inválida tente novamente!");
      }
      opcao = sc.nextInt();
    }

    System.out.printf("\nMUITO OBRIGADO \nAlcool: %d \nGasolina: %d \nDiesel: %d", alcool, gasolina, diesel);
    sc.close();
  } 
}
