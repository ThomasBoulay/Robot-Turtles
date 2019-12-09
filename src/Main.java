package src;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        initialisation();
        for (int i = 1; i > 0; i++) {
            deplacement(creationFile());

            System.out.println("Le pion a pour direction: " + direction);
            System.out.println("Le pion est a la position:\nLigne: " + position[0] + "\nColonne: " + position[1] + "\n\n");
        }

    }

    public static char[][] plateau;
    public static int[] position;
    public static char direction = 'E';

    public static void initialisation() {
        plateau = new char[8][8];
        position = new int[2];
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                plateau[i][j] = ' ';
            }
        }
        position[0] = 7;
        position[1] = 0;
    }

    public static ArrayDeque<String> creationFile() {
        ArrayDeque<String> instructions = new ArrayDeque<>();
        String entree;
        do {
            System.out.print("Saisissez \n“A” pour avancer \n“G” pour faire un quart de tour vers la gauche \n“D” pour faire un quart de tour vers la droite.");
            Scanner scanner = new Scanner(System.in);
            entree = scanner.next();
            if (entree.equals("A") || entree.equals("G") || entree.equals("D")) {
                instructions.add(entree);
            }
        } while (instructions.size() < 5);
        return instructions;
    }

    public static void deplacement(ArrayDeque<String> instructions) {
        do {
            String next = instructions.poll();
            if (direction == 'N') {
                if (next.equals("A")) {
                    if (position[0] == 0) {
                    } else {
                        position[0] -= 1;
                    }
                } else if (next.equals("G")) {
                    direction = 'W';
                } else if (next.equals("D")) {
                    direction = 'E';
                }
            } else if (direction == 'E') {
                if (next.equals("A")) {
                    if (position[1] == 7) {
                    } else {
                        position[1] += 1;
                    }
                } else if (next.equals("G")) {
                    direction = 'N';
                } else if (next.equals("D")) {
                    direction = 'S';
                }
            } else if (direction == 'S') {
                if (next.equals("A")) {
                    if (position[0] == 7) {
                    } else {
                        position[0] += 1;
                    }
                } else if (next.equals("G")) {
                    direction = 'E';
                } else if (next.equals("D")) {
                    direction = 'W';
                }
            } else if (direction == 'W') {
                if (next.equals("A")) {
                    if (position[1] == 0) {
                    } else {
                        position[1] -= 1;
                    }
                } else if (next.equals("G")) {
                    direction = 'S';
                } else if (next.equals("D")) {
                    direction = 'N';
                }
            }
        } while (instructions.size() != 0);
    }
}
