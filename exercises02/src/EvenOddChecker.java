/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
*/

import java.util.Scanner;

public class EvenOddChecker {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero para descobrir se e par ou impar:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
            sc.close();
            return;
        }

        System.out.println("IMPAR");
        sc.close();       
    }
}