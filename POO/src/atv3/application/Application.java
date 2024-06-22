package atv3.application;

import java.util.Locale;
import java.util.Scanner;

import atv3.entities.Aluno;

public class Application {
	/*Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam 
para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para 
resolver este problema*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ol� Aluno informe seu nome:");
		Aluno alu = new Aluno();
		alu.setNome(sc.nextLine());
		System.out.println("Informe a nota 1");
		alu.setN1(sc.nextDouble());
		System.out.println("Informe a nota 2");
		alu.setN2(sc.nextDouble());
		System.out.println("Informe a nota 3");
		alu.setN3(sc.nextDouble());
		
		System.out.println("nota Final: "+ alu.NotaFinal());
		System.out.println(alu.VerAprovacao());
		
		
		sc.close();

	}

}
