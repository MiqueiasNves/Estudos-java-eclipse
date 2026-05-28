package Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double NOTA1 = sc.nextDouble();
		double NOTA2 = sc.nextDouble();
		
		double notaFinal = NOTA1 + NOTA2;
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		
		if (notaFinal < 60 ) {
			System.out.println("REPROVADO");
		} else {
			System.out.println("APROVADO");
		}
		
		sc.close();
	}

}
