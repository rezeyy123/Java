public class Test {
		
public static int verdopple (int zahl) { 
	return zahl * 2; 
}

public static void main(String[] args) {
	int a = 5;
	System.out.println("Verdoppelt von " + a + " ist :" + verdopple(a));
}

public static int subtrahiere (int a, int b) {
	return a - b;
    }
    
public static void printSubtrahiere(int a, int b) {
	System.out.println("Subtrahiert von " + a + " und " + b + " ist :" + subtrahiere(a, b));
    }
}