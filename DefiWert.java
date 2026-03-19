import java.util.Scanner;

public class DefiWert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Quadratische Funktion f(x) = ax² + bx + c ===\n");
        
        System.out.print("Gib a ein: ");
        double a = sc.nextDouble();
        
        System.out.print("Gib b ein: ");
        double b = sc.nextDouble();
        
        System.out.print("Gib c ein: ");
        double c = sc.nextDouble();
        
        double x_s = -b / (2 * a);
        double y_s = a * x_s * x_s + b * x_s + c;
        
        System.out.println("\n---Ergebnis---");
        System.out.println("f(x) = " + a + "x² + " + b + "x + " + c);
        System.out.println("\nDefinitionsmenge: D = R");
        
        if (a > 0) {
            System.out.println("Wertemenge: W = [" + y_s + ", ∞)");
        } else {
            System.out.println("Wertemenge: W = (-∞, " + y_s + "]");
        }
        
        System.out.println("Scheitelpunkt: S(" + x_s + " | " + y_s + ")");
        
        sc.close();
    }
}
