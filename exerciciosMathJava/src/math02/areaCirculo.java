package math02;

import java.util.Locale;
import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double circulo, raio, pi = 3.14159;
		
		raio = sc.nextDouble();
		
		circulo = pi * raio * raio;
		
		System.out.printf("circulo é igual a: %.4f%n", circulo);
		
		
		sc.close();

	}

}
