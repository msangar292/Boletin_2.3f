package practicas23;

public class Activity11 {

	public static void main(String[] args) {
		int filas = 4;
        ajedrez(filas);

    }

    public static void ajedrez(int filas) {
        String WHITE_BACKGROUND = "\u001B[47m";
        String BLACK_BACKGROUND = "\u001B[40m";
        for (int i = 1; i <= filas; i++) {
            int j = 0;
            for (j = 1; j <= filas; j++) {
                System.out.print(WHITE_BACKGROUND + "  ");
                System.out.print(BLACK_BACKGROUND + "  ");

            }
            System.out.println();
            for (j = 1; j <= filas; j++) {
                System.out.print(BLACK_BACKGROUND + "  ");
                System.out.print(WHITE_BACKGROUND + "  ");
            }
            System.out.println();
        }
	}

}
