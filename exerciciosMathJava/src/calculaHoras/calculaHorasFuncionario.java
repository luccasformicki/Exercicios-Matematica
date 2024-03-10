package calculaHoras;

import java.util.Locale;
import java.util.Scanner;

public class calculaHorasFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double horasTrabalhadas, Dinheiro, Salario;
		
		int ID = sc.nextInt();
		horasTrabalhadas = sc.nextDouble();
		Dinheiro = sc.nextDouble();
		
		Salario = horasTrabalhadas * Dinheiro;
		
		System.out.println("number Funcionario:" + ID);
		System.out.printf("Salario: U$ %.2f%n", Salario);
		
		
		sc.close();
	}

}
