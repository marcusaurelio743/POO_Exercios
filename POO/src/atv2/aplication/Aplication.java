package atv2.aplication;

import java.util.Locale;
import java.util.Scanner;

import atv2.entities.Funcionario;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		System.out.println("Name:");
		func.setName(sc.nextLine());
		System.out.println("Gross salary:");
		func.setGrossSalary(sc.nextDouble());
		System.out.println("Tax:");
		func.setTax(sc.nextDouble());
		
		System.out.println(func);
		
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + func);
		sc.close();

	}

}
