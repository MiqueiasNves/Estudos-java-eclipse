package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		int y;
		y = sc.nextInt();
		double z;
		z = sc.nextDouble();
		char c;
		c = sc.next().charAt(0);
		
		
		System.out.println("Voce digitou: " + x);
		System.out.println("Voce digitou: " + y);
		System.out.println("Voce digitou: " + z); //caso queria trocar vc pode digitar o System.out.printf(); dentro dele vc coloca o %.2f%n para configurar o "." ou ","
		System.out.println("Voce digitou: " + c);
		
		
		sc.close();
		
	}

}
