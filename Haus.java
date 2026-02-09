public class Haus{

	public double seiteA;

	public double seiteB;

	public static void main(String[] args){

		Einfamilienhaus = new Haus();

		Reihenhaus  = new Haus();

		Hochhaus  = new Haus();

		Villa  = new Haus();

		Bungalow  = new Haus();

		Doppelhaus  = new Haus();

		Einfamilienhaus.seiteA = 4.0;

		Einfamilienhaus.seiteB = 12;

		Reihenhaus.seiteA = 4.5;

		Reihenhaus.seiteB = 2.3;

		System.out.println("Die Seite A von Einfamilienhaus :"+Einfamilienhaus.seiteA);
		System.out.println("Die Seite B von Einfamilienhaus :"+Einfamilienhaus.seiteB);
		System.out.println("Die Seite A von Reihenhaus :"+Reihenhaus.seiteA);
		System.out.println("Die Seite B von Reihenhaus :"+Reihenhaus.seiteB);
	}
}