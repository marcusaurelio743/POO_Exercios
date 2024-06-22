package atv1.aplication;

import java.util.Locale;
import java.util.Scanner;

import atv1.entities.Rectangle;

public class Application {
	/*Fazer um programa para ler os valores da largura e altura 
de um retângulo. Em seguida, mostrar na tela o valor de 
sua área, perímetro e diagonal. Usar uma classe como 
mostrado no projeto ao lado*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		
		Rectangle rec = new Rectangle();
		rec.setWidth(sc.nextDouble());
		rec.setHeight(sc.nextDouble());
		
		System.out.printf("Area: %.2f\n",rec.Area());
		System.out.printf("Perimetre: %.2f\n",rec.perimetre());
		System.out.printf("Diagonal: %.2f\n",rec.diagonal());
		sc.close();

	}

}
