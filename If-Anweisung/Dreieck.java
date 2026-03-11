import java.util.Scanner;

public class Dreieck {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Seite a: ");
        double a = sc.nextDouble();

        System.out.print("Seite b: ");
        double b = sc.nextDouble();

        System.out.print("Seite c: ");
        double c = sc.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Das Dreieck lässt sich konstruieren.");
        } else {
            System.out.println("Das Dreieck lässt sich NICHT konstruieren.");
        }

        sc.close();
    }
}