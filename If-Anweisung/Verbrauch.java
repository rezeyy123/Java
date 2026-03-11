import java.util.Scanner;
public class Verbrauch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Gefahrene Kilometer: ");
            double kilometer = sc.nextDouble();
            
            System.out.print("Verbrauchter Kraftstoff (Liter): ");
            double kraftstoff = sc.nextDouble();
            
            if (kilometer != 0) {
                double verbrauch = (kraftstoff / kilometer) * 100;
                System.out.println("Durchschnittsverbrauch: " + verbrauch + " Liter pro 100 km");
            } else {
                System.out.println("Fehler: Kilometer dürfen nicht 0 sein.");
            }
        }
    }
}