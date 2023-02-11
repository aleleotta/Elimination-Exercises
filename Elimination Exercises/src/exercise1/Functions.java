package exercise1;

public class Functions {
	public static boolean even(int value) {
		boolean check = false;
		if(value % 2 == 0) {
			check = true;
		}
		return check;
	}
	
	public static void deleteArrayOdds(int[] array, int index) {
		for(int value: array) {
			if(!Functions.even(value)) {
				System.arraycopy(array, index + 1, array, index, array.length - index - 1);
				//array = Arrays.copyOf(array, array.length - 1);
			}
			index++;
		}
	}
}
/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array.
 * El programa debe eliminar todos los números impares.
 * No se debe cambiar el orden en el que están insertados los elementos.
*/