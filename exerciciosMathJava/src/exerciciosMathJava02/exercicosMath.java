package exerciciosMathJava02;

import java.util.Locale;
import java.util.Scanner;

public class exercicosMath {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int x, y, c;

		x = sc.nextInt();

		y = sc.nextInt();
		
		c = x + y;
		
		System.out.println("A soma Desses números é:" + c);
		
		sc.close();
		
	}

}
