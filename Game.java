import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final int SIZE = 7;
    private static final char EMPTY = '.';
    private static final char PLAYER = '@';
    private static final char GOAL = 'G';
    private static final char TRAP = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int px = 0, py = 0;
        int gx = SIZE - 1, gy = SIZE - 1;
        boolean[][] traps = new boolean[SIZE][SIZE];

        // Setze einige Fallen (nicht am Start / Ziel)
        for (int i = 0; i < 8; i++) {
            int tx, ty;
            do {
                tx = random.nextInt(SIZE);
                ty = random.nextInt(SIZE);
            } while ((tx == px && ty == py) || (tx == gx && ty == gy) || traps[ty][tx]);
            traps[ty][tx] = true;
        }

        System.out.println("=== Mini-Konsolen-Videospiel: Sammle das Ziel! ===");
        System.out.println("Steuerung: w=hoch, s=runter, a=links, d=rechts, q=beenden");

        while (true) {
            printBoard(px, py, gx, gy, traps);

            System.out.print("Dein Zug (w/a/s/d/q): ");
            String line = scanner.nextLine().trim().toLowerCase();
            if (line.isEmpty()) continue;
            char cmd = line.charAt(0);
            if (cmd == 'q') {
                System.out.println("Spiel beendet. Auf Wiedersehen!");
                break;
            }

            int nx = px, ny = py;
            switch (cmd) {
                case 'w': ny--; break;
                case 's': ny++; break;
                case 'a': nx--; break;
                case 'd': nx++; break;
                default:
                    System.out.println("Ungültige Eingabe, bitte w/a/s/d/q verwenden.");
                    continue;
            }

            if (nx < 0 || nx >= SIZE || ny < 0 || ny >= SIZE) {
                System.out.println("Außerhalb des Spielfeldes! Versuch's nochmal.");
                continue;
            }

            px = nx;
            py = ny;

            if (px == gx && py == gy) {
                printBoard(px, py, gx, gy, traps);
                System.out.println("🎉 Glückwunsch! Du hast das Ziel erreicht!");
                break;
            }

            if (traps[py][px]) {
                printBoard(px, py, gx, gy, traps);
                System.out.println("💥 Boom! Du bist in eine Falle getreten. Game Over.");
                break;
            }
        }

        scanner.close();
    }

    private static void printBoard(int px, int py, int gx, int gy, boolean[][] traps) {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                if (x == px && y == py) {
                    System.out.print(PLAYER + " ");
                } else if (x == gx && y == gy) {
                    System.out.print(GOAL + " ");
                } else if (traps[y][x]) {d
                    System.out.print(TRAP + " ");
                } else {
                    System.out.print(EMPTY + " ");
                }
            }
            System.out.println();
        }
    }
}
