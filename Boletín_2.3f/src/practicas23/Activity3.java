package practicas23;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		double n1d;
		double n2d;
		int n2 = 0;
		int n1 = 0;
		char n3;
		System.out.println("escribe dos numeros:");
		n1d = keyboard.nextDouble();
		n2d = keyboard.nextDouble();
		System.out.println("escribe \'s' para sumar, \'r' para restar, \'m' para multiplicar y 'd' para dividir ");
		n3 = keyboard.next().charAt(0);
		
		if ( n1d % 1 == 0 && n2d % 1 == 0){
			n1 = (int)n1d;
			n2 = (int)n2d;
			System.out.println(operaciones(n1, n2, n3));
		} else
			
		System.out.println(operaciones(n1d, n2d, n3));
	}

	public static int operaciones(int n1, int n2, char n3) {
		int resultado = 0;
		
			if (n3 == 's') {
				resultado = n1 + n2;
			} else if (n3 == 'r') { 
				resultado = n1 - n2;
			} else if (n3 == 'm') {
				resultado = n1 * n2;
			} else if (n3 == 'd') {
				resultado = n1 / n2;
			}
		
			return resultado;
		
	}


public static double operaciones(double n1, double n2, char n3) {
	double resultado = 0;
	
		if (n3 == 's') {
			resultado = n1 + n2;
		} else if (n3 == 'r') { 
			resultado = n1 - n2;
		} else if (n3 == 'm') {
			resultado = n1 * n2;
		} else if (n3 == 'd') {
			resultado = n1 / n2;
		}
	
		return resultado;
	
}

}