package exercise1;

public class Functions {
	public static boolean even(int value) {
		boolean check = false;
		if(value % 2 == 0) {
			check = true;
		}
		return check;
	}
}
/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array.
 * El programa debe eliminar todos los números impares.
 * No se debe cambiar el orden en el que están insertados los elementos.
*/