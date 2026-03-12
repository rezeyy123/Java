
public class Ampel {
    public static void main(String[] args) {
        System.out.println("Geben Sie die Farbe der Ampel ein (rot, gelb, grün): ");
        String ampelFarbe = input.nextLine();  
        
        switch (ampelFarbe.toLowerCase()) {
            case "rot":
                System.out.println("Die Ampel ist rot. Bitte warten Sie.");
                break;
            case "gelb":
                System.out.println("Die Ampel ist gelb. Bitte bereiten Sie sich vor zu fahren.");
                break;
            case "grün":
                System.out.println("Die Ampel ist grün. Sie können jetzt fahren.");
                break;
            default:
                System.out.println("Ungültige Eingabe. Bitte geben Sie rot, gelb oder grün ein.");
                break;  
        }
    }
    
}
