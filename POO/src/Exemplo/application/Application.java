package Exemplo.application;

import java.util.Locale;
import java.util.Scanner;

import Exemplo.entities.Product;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Entrer product data:");
		System.out.println("Name:");
		String name =sc.nextLine();
		System.out.println("Price:");
		double price = sc.nextDouble();
		System.out.println("quantity:");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("Product data: "+product);
		
		System.out.println("Enter the number of products to be added in stock:");
		
		product.AddProduct(sc.nextInt());
		
		System.out.println("update data:" +product);
		System.out.println();
		
		System.out.println("Enter the number of products to be remover in stock:");
		product.RemoveProduct(sc.nextInt());
		System.out.println();
		System.out.println("update data:" +product);
		
		sc.close();

	}

}
