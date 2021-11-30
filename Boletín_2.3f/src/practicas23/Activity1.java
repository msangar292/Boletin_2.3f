package practicas23;

public class Activity1 {

	public static void main(String[] args) {

		System.out.printf("el exponente de 5 elevado a 3 es: " + potencia(5, 3));
	}

	public static int potencia(int n1, int n2) {
		int result = 1;

		do {
			result *= n1;
			n2--;

		} while (n2 > 0);
		
			return result;
	}
	}

