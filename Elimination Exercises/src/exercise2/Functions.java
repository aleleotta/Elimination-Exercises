package exercise2;

public class Functions {
	public static boolean prime(int value) {
		boolean check = true;
		if (value % 2 == 0 && value != 2) {
			check = false;
		}
		return check;
	}
}
/*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 * Seguidamente, el programa eliminará los números no primos
 */