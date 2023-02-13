package exercise2;
import java.util.*;

import exercise1.Functions;

public class Main {
	public static void main(String[] args) {
		int array[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}
		for(int index = 0; index < array.length; index++) {
			int value = array[index];
			if(!exercise2.Functions.prime(value)) {
					System.arraycopy(array, index + 1, array, index, array.length - index - 1);
					array = Arrays.copyOf(array, array.length - 1);
			}
		}
		System.out.println("\nNew array without odds: ");
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array));
		sc.close();
	}
}
/*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 * Seguidamente, el programa eliminará los números no primos
 */