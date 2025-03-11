package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner userInput = new Scanner(System.in);    
    Product product = new Product();

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    product.name = userInput.nextLine();

    System.out.print("Price: ");
    product.price = userInput.nextDouble();

    System.out.print("Quantity: ");
    product.quantity = userInput.nextInt();
    System.out.println("Product data: " + product);

    System.out.print("\nEnter the number of products to be added in stock: ");
    product.addProducts(userInput.nextInt());    
    System.out.println("Updated data: " + product);    

    System.out.print("\nEnter the number of products to be removed from stock: "); 
    product.removeProducts(userInput.nextInt());
    System.out.println("Updated data: " + product);

    userInput.close();
  }
}
