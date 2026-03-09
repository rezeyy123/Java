
public class MyClass {
  public static void main(String args[]) {
      int gesamt = 0;
      int zahl = 1;
      while (zahl < 100) {
          int sum = zahl + (zahl + 1);
          System.out.println(sum);
          gesamt += sum;
          zahl += 2;
      }
      System.out.println("Gesamtsumme: " + gesamt);
  }
}

