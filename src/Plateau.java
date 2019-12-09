package src;

public class Plateau {
    public static char[][] plateau;

    public static void initialisation() {
        plateau = new char[8][8];
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                plateau[i][j] = ' ';
            }
        }
    }

    public static void affichage() {
        for (int i = 0; i <= 7; i++) {
            System.out.print("\n");
            for (int j = 0; j <= 7; j++) {
                System.out.print("|"+plateau[i][j]+"|");
            }
        }
    }

    public static void update() {
        System.out.print("\n\n\n\n\n\n");
        for (int i = 0; i <= 7; i++) {
            System.out.print("\n");
            for (int j = 0; j <= 7; j++) {
                System.out.print("|"+plateau[i][j]+"|");
            }
        }
    }
}
