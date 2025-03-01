/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/

import java.util.Locale;
import java.util.Scanner;

public class GeometricForms {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
    double pi = 3.14159;

    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();


    triangulo = (a * c) / 2;
    circulo = pi * Math.pow(c, 2);
    trapezio = ((a + b) * c) / 2;
    quadrado = b * b;
    retangulo = a * b;

    System.out.printf("Triangulo: %.3f\n", triangulo);
    System.out.printf("circulo: %.3f\n", circulo);
    System.out.printf("trapezio: %.3f\n", trapezio);
    System.out.printf("quadrado: %.3f\n", quadrado);
    System.out.printf("retangulo: %.3f", retangulo); 

    sc.close();
  }
}
