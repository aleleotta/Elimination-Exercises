package exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int array[] = new int[20];
		String option = "A";
		int value;
		Scanner sc = new Scanner(System.in);
		for(int index = 0; index < array.length; index++) {
			array[index] = (int) (Math.random() * 100);
		}
		Arrays.sort(array);
		System.out.print("Array: " + Arrays.toString(array));
		boolean termination = false;
		while (!termination) {
			System.out.print("\n\nOptions:\n"
					+ "A: Show current array.\n"
					+ "B: Eliminate every instance of a value from the array.\n"
					+ "C: Terminate the program.\n\n"
					+ "Please select an option: ");
			option = sc.next();
			switch(option) {
			case "a", "A": //To show array.
				System.out.print("Array: " + Arrays.toString(array));
				break;
			case "b", "B": //To eliminate certain value selected by the user.
				System.out.print("Introduce a value that you would like to eliminate from the array: ");
				value = sc.nextInt();
				array = Functions.eliminateValue(array, value);
				break;
			case "c","C": 
				termination=true;
				break;
			default:
				System.out.println("Please introduce a valid option.");
				break;
			}
		}
		System.out.println("\n\n\nProgram terminated.");
		sc.close();
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