package practicas23;

import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		
		primos1000();
		System.out.println("introduce un numero: ");
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		if (primos(num) == true) {
			System.out.println("es primo");
		} else {
			System.out.println("no es primo");
		}

	}

	public static boolean primos(int num) {
		int contador = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contador++;
			}
		}

		if (contador >= 1) {
			return false;
		} else {
			return true;
		}
	}

	public static void primos1000() {
		
		for (int i = 1; i < 10000; i++) {
			int contador = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					contador++;

				}
			}

			if (contador <= 2) {
				System.out.println(i);
			}
		}

	}
}
