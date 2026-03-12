import java.util.Scanner;

public class Freizeitpark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wilkommen im Freizeitpark! Um mitzufahren, müssen Sie mindestens 1,40m groß sein, und maximal 1,90m groß sein.");
        System.out.print("Bitte geben Sie ihre Größe in Metern ein: ");
        double groesse = sc.nextDouble();
        if (groesse >= 1.40 && groesse <= 1.90) {
            System.out.println("Viel Spaß auf der Fahrt!");
        }else {
            System.out.println("Leider entsprechen sie nicht den Größenanforderungen.");
            sc.close();
        }
    }
}