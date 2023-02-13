package exercise4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int array[] = new int[20];
		Scanner sc = new Scanner(System.in);
		for(int index = 0; index < array.length; index++) {
			array[index] = (int)(Math.random() * 10);
		}
		System.out.print("Array: " + Arrays.toString(array));
		sc.close();
	}
}
/*
Escribir un programa que genere 20 números enteros aleatorios entre 0 y 10 y los almacene en una tabla.
A continuación, debe solicitar al usuario un número entero.
El programa debe eliminar de la tabla todos los números que sean mayores que un número dado.
La tabla no está ordenada ni hay que ordenarla.
*/