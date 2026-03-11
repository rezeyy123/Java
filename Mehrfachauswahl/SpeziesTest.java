
public class SpeziesTest {

    public static void speziesPruefen(String spezies) {

        String ausgabe = "Du bist ";

        if (spezies.equals("reptil")) {
            System.out.println(ausgabe + "ein Reptil");
        }
        else if (spezies.equals("saeugetier")) {
            System.out.println(ausgabe + "ein Säugetier");
        }
        else {
            System.out.println("Ungültige Eingabe");
        }
    }

    public static void main(String[] args) {
        speziesPruefen("reptil");
        speziesPruefen("saeugetier");
        speziesPruefen("fisch");
    }
}