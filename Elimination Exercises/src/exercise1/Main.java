package exercise1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int array[] = new int[20];
		for(int index = 0; index < array.length; index++) {
			array[index] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(array));
		for(int index = 0; index < array.length; index++) {
			int value = array[index];
			if(!exercise1.Functions.even(value)) {
					System.arraycopy(array, index + 1, array, index, array.length - index - 1);
					array = Arrays.copyOf(array, array.length - 1);
			}
		}
		System.out.println("\nNew array without odds: ");
		System.out.println(Arrays.toString(array));
	}
}
/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array.
 * El programa debe eliminar todos los números impares.
 * Hacer sin (Arrays.sort).
*/

/*System.arraycopy(
  Which array would you like to copy?,
  Which index to start copying from?,
  Which array to paste elements into?,
  Which index to start pasting into?,
  How many elements should be copied?)*/

//System.arraycopy(array, index + 1, array, index, array.length - index - 1);
//array = Arrays.copyOf(array, array.length - 1);