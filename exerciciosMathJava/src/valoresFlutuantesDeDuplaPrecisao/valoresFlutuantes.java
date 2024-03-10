package valoresFlutuantesDeDuplaPrecisao;

import java.util.Locale;
import java.util.Scanner;

public class valoresFlutuantes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, Triangulo, Circulo, Trapezio, Quadrado, Retangulo, pi = 3.14159;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		Triangulo = (A * C) / 2;
		Circulo = pi * C * C;
		Trapezio = (A + B) * C / 2;
		Quadrado = Math.pow(B, 2.00);
		Retangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%n", Triangulo);
		System.out.printf("Circulo: %.3f%n", Circulo);
		System.out.printf("Trapezio: %.3f%n", Trapezio);
		System.out.printf("Quadrado: %.3f%n", Quadrado);
		System.out.printf("retangulo: %.3f%n", Retangulo);

		sc.close();
	}

}
