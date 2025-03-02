/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME UM NUMERO INTEIRO POSITIVO OU NEGATIVO:");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("NAO NEGATIVO");
            sc.close();
            return;
        }
        System.out.println("NEGATIVO");
        sc.close();
    }
}
