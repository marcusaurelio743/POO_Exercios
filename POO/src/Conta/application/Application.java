package Conta.application;

import java.util.Locale;
import java.util.Scanner;

import Conta.entities.Conta;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number:");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder");
		String name = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		String resp = sc.nextLine();
		
		Conta conta = null;
		
		if(resp.equalsIgnoreCase("y") || resp.equalsIgnoreCase("Y")) {
			System.out.println("Enter initial deposit value:");
			Double value = sc.nextDouble();
			conta = new Conta(number, name, value);
		}else {
			conta = new Conta(number, name);
		}
		
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println("Enter a deposit value: ");
		Double valor = sc.nextDouble();
		conta.deposit(valor);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println("Enter a withdraw value:");
		valor = sc.nextDouble();
		conta.withdraw(valor);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		
		
		sc.close();

	}

}
