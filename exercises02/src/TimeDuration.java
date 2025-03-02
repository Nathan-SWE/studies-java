/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
*/

import java.util.Scanner;

public class TimeDuration {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);   

    System.out.println("INFORME A HORA DE INICIO E A HORA DE TERMINO DO JOGO:");

    int duracao;
    int inicio = sc.nextInt();
    int fim = sc.nextInt();
    boolean foraDoLimite = inicio < 0 || inicio > 24 || fim > 24 || fim < 0;

    if(foraDoLimite){
      System.out.println("Valores fora do limite de inicio e fim entre 1 e 24!");
      sc.close();
      return;
    }

    if(inicio < fim){
      duracao = fim - inicio;
    } else  if(inicio > fim){
      duracao = 24 - inicio + fim;
    } else {
      duracao = 24;
    }
    
    System.out.printf("O jogo durou %d hora(s)", duracao);
    sc.close();    
  }
}