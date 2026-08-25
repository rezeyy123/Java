public class Main {
    public static void main(String[] args) {

        Paket [] pakete = new Paket[5];

        pakete[0] = new Paket("P1001", 4.5, "Offen");
        pakete[1] = new Paket("P1002", 2.0, "Unterwegs");
        pakete[2] = new Paket("P1003", 3.0, "Zugestellt");

        for (int i = 0; i < pakete.length; i++) {
            if(pakete[i] != null){
                pakete[i].anzeigen();  
            }
        }
    }

}

class Paket {
    private String sendungsNr;
    private Double gewicht;
    private String status;
    

    Paket(String sendungsNr, Double gewicht, String status){
        this.sendungsNr = sendungsNr;
        this.gewicht = gewicht;
        this.status = status;
    }
    public void anzeigen(){
        System.out.println("Sendungsnummer: " + sendungsNr);
        System.out.println("Gewicht: " + gewicht);
        System.out.println("Status: " + status);
    }
}