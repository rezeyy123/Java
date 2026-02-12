public class Haus{

	public double stock1;

	public double stock2;

	public static void main(String[] args){

		Einfamilienhaus = new Haus();

		Reihenhaus  = new Haus();

		Hochhaus  = new Haus();

		Villa  = new Haus();

		Bungalow  = new Haus();

		Doppelhaus  = new Haus();

		Einfamilienhaus.stock1 = 4.0;

		Einfamilienhaus.stock2 = 12;

		Reihenhaus.stock1 = 4.5;

		Reihenhaus.stock2 = 2.3;

		Hochhaus.stock1 = 47.0;

		Hochhaus.stock2 = 192;

		Villa.stock1 = 41.0;

		Villa.stock2 = 122;

		Doppelhaus.stock1 = 4.0;

		Doppelhaus.stock2 = 12;

		Bungalow.stock1 = 46.0;

		Bungalow.stock2 = 142;

		System.out.println("Die Seite A von Einfamilienhaus :"+Einfamilienhaus.stock1);
		System.out.println("Die Seite B von Einfamilienhaus :"+Einfamilienhaus.stock2);
		System.out.println("Die Seite A von Reihenhaus :"+Reihenhaus.stock1);
		System.out.println("Die Seite B von Reihenhaus :"+Reihenhaus.stock2);
	}
}