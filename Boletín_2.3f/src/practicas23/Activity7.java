package practicas23;

import java.util.Scanner;

public class Activity7 {

	public static void main(String[] args) {
		int tama�o;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("tama�o piramide: ");
		tama�o = keyboard.nextInt();
		piramide(tama�o);
	}

	public static void piramide(int n) {
		int blancos = 0;
		for (int asteriscos = 1; asteriscos <= n; asteriscos++) {
			for (blancos = 1; blancos <= n - asteriscos; blancos++) {
				System.out.printf(" ");
			}
			for (blancos = 1; blancos <= asteriscos; blancos++) {
				System.out.printf("* ");
			}
			System.out.println();
		}

	}
}
