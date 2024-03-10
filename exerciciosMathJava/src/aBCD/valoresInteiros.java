package aBCD;

import java.util.Locale;
import java.util.Scanner;

public class valoresInteiros {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, Diferenca;
		
		A = sc.nextInt();	
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Diferenca = A * B - C * D;
		System.out.println("A diferença é de: " + Diferenca);
		sc.close();
	}

}
