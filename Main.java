public class Main {
    public static void main(String[] args) {

        Paket[] pakete= newPaket[5];

        pakete[0] = new Paket(sendungsNr: "P1001", gewicht: 4.5, status: "offen");
        pakete[1] = new Paket(sendungsNr: "P1002", gewicht:5.0, status: "in transit");
        pakete[2] = new Paket(sendungsNr: "P1003", gewicht: 8.0, status: "delivered");
    }
}