

import java.util.Scanner;

public class Monate {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib eine Zahl von 1 bis 12 ein: ");
        int zahl = sc.nextInt();

        if (zahl == 1) {
            System.out.println("Januar");
        } else if (zahl == 2) {
            System.out.println("Februar");
        } else if (zahl == 3) {
            System.out.println("März");
        } else if (zahl == 4) {
            System.out.println("April");
        } else if (zahl == 5) {
            System.out.println("Mai");
        } else if (zahl == 6) {
            System.out.println("Juni");
        } else if (zahl == 7) {
            System.out.println("Juli");
        } else if (zahl == 8) {
            System.out.println("August");
        } else if (zahl == 9) {
            System.out.println("September");
        } else if (zahl == 10) {
            System.out.println("Oktober");
        } else if (zahl == 11) {
            System.out.println("November");
        } else if (zahl == 12) {
            System.out.println("Dezember");
        } else {
            System.out.println("Ungültige Zahl!");
        }

        sc.close();
    }
}