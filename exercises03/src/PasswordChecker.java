/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/

import java.util.Scanner;

public class PasswordChecker {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe sua senha: ");

    int input = sc.nextInt();
    int senhaEsperada = 2002;
    int tentativas = 3;
    
    
    while (input != senhaEsperada) {
      System.out.printf("Senha incorreta você ainda tem %d tentativa(s): ", tentativas);
      input =  sc.nextInt();
      tentativas--;
      
      if (tentativas == 0){
        System.out.println("\nVocê atingiu o limite de tentativas");
        sc.close();
        return;
      }
    }

    System.out.println("Acesso permitido!");
    sc.close();
  }  
}