import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Steigung m eingeben: ");
    float m = sc.nextFloat();
    System.out.print("y-Achsenabschnitt b eingeben: ");
    float b = sc.nextFloat();
    float nullstelle=-b/m;

 System.out.println( "Die Nullstelle der linearen Funktion f(x) = " + m + "x + " + b + " ist: " + nullstelle);
  }
}