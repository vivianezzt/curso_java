package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	//final que não pode ser mudado
	//padrão do java para constantes NET_SALARY
	
	public static void main(String[] args) {
		//método main é statico
		Locale.setDefault(Locale.US);;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		
			double c = Calculator.circumference(radius);
			double v = Calculator.volume(radius);
			
			System.out.printf("Circ;unferences: %.2f%n", c);
			System.out.printf("Volume: %.2f%n", v);
			System.out.printf("Pi value: %.2f%n", Calculator.PI);
				
		sc.close();
	}


}
