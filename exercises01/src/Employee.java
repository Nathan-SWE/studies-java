/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

import java.util.Scanner;
import java.util.Locale;

public class Employee {
  public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int id, horas;
    double valorHora, salario;


    id = sc.nextInt();
    horas = sc.nextInt();
    valorHora = sc.nextDouble();

    salario = horas * valorHora;

    System.out.printf("Number = %d\n", id);
    System.out.printf("Salary = U$ %.2f\n", salario);

    sc.close();
  }
}