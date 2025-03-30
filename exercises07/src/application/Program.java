package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SchoolGrades;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        SchoolGrades studentGrade = new SchoolGrades();

        studentGrade.name = sc.nextLine();
        studentGrade.grade1 = sc.nextDouble();
        studentGrade.grade2 = sc.nextDouble();
        studentGrade.grade3 = sc.nextDouble();
        sc.close();

        System.out.printf("FINAL GRADE: %.2f%n", studentGrade.finalGrade());

        if (studentGrade.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", studentGrade.missingPoints());
        } else {
            System.out.println("PASS");
        }
    }
}
