package exercise3;

import java.util.Arrays;

public class Functions {
	public static int[] eliminateValue(int[] array, int input) {
		int counter = 0;
		for(int value: array) {
			if(value == input) {
				counter++;
			}
		}
		for(int index = 0; index < array.length; index++) {
			int value = array[index];
			for(int i = 0; i < counter; i++) {
				if(index >= 0 && value == input) {
					System.arraycopy(array, index + 1, array, index, array.length - index - 1);
					array = Arrays.copyOf(array, array.length - 1);
				}
			}
		}
		return array;
	}
}
/*Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:

Mostrar valores.
Eliminar valor.
Salir.

La opción ‘a’ mostrará todos los valores por pantalla.
La opción ‘b’ pedirá un valor V y eliminará todas las apariciones de V del array.
El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa.
*/