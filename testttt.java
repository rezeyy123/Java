import java.util.Scanner;

public class testttt {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int auswahl = 0;
        
        while (auswahl != 3) {
            System.out.println("HAUPTMENÜ");
            System.out.println("1. Startseite");
            System.out.println("2. Einstellungen");
            System.out.println("3. Beenden");
            System.out.print("Bitte wählen Sie: ");
            
            auswahl = scanner.nextInt();
            
            switch (auswahl) {
                case 1:
                    System.out.println("Sie befinden sich auf der Startseite");
                    break;
                case 2:
                    System.out.println("Sie befinden sich in den Einstellungen");
                    break;
                case 3:
                    System.out.println("Beendet!");
                    break;
                default:
                    System.out.println(">> Ungültige Eingabe!");
            }
        }
        
        scanner.close();
    }
}
