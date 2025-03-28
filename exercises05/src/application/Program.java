package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
    public static void main (String[] args){
        Scanner measures = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.height = measures.nextDouble();
        rectangle.width = measures.nextDouble();
        measures.close();

        System.out.println(rectangle);
    }
}