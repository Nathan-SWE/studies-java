package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();

        System.out.print("Enter the employee name: ");
        employee.name = inputData.nextLine();

        System.out.print("Enter gross salary amount: ");
        employee.grossSalary = inputData.nextDouble();

        System.out.print("Enter total taxes amount: ");
        employee.tax = inputData.nextDouble();
        System.out.println(employee);

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(inputData.nextDouble());        
        System.out.println(employee);

        inputData.close();
    }
}
