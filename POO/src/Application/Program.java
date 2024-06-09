package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Informe as medidas do trian X");
		x.a = sc.nextDouble();
		x.b =sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Informe as medidas do trian Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		System.out.printf("Area do triangulo X: %.2f\n",x.area());
		System.out.printf("Area do triangulo Y: %.2f\n",y.area());
		
		
		sc.close();
		
		

	}

}
