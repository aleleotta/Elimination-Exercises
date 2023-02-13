package exercise3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int array[] = new int[20];
		String option;
		Scanner sc = new Scanner(System.in);
		for(int index = 0; index < array.length; index++) {
			array[index] = (int) (Math.random() * 100);
		}
		while (option == "c" || option == "C") {
			option = sc.next();
			switch(option) {
			case "a", "A":
			case "b", "B":
			default:
				System.out.println("Please introduce a valid option.");
			}
		}
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