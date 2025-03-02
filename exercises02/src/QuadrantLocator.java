/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
          ^y
          |
          |
    Q2    |    Q1
          |           x
----------------------->
          |
    Q3    |    Q4
          |
          |
*/

import java.util.Scanner;
import java.util.Locale;

public class QuadrantLocator {
  public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double x = sc.nextDouble();
    double y = sc.nextDouble();
    sc.close();

    if (x == 0 && y == 0){
      System.out.println("Origem");
      return;
    }

    if(x > 0 && y > 0){
      System.out.println("Q1");
      return;
    }

    if(x < 0 && y > 0){
      System.out.println("Q2");
      return;
    }

    if(x < 0 && y < 0){
      System.out.println("Q3");
      return;
    }

    if (x > 0 && y < 0){
      System.out.println("Q4");
      return;
    }
  }  
}
