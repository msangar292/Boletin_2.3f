package practicas23;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n1;
		int n2;
		char n3;
		System.out.println("escribe dos numeros:");
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		System.out.println("escribe \'s' para sumar, \'r' para restar, \'m' para multiplicar y 'd' para dividir ");
		n3 = keyboard.next().charAt(0);
		System.out.println(operaciones(n1, n2, n3));

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
}
