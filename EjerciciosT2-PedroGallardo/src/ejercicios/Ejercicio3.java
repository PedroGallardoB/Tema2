package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	
	 */

	public static void main(String[] args) {

		int comida;
		int animal;
		int cantidad;
		int requerimiento;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca los kilos de comida comprada");
		comida = sc.nextInt();

		System.out.println("Introduzca la cantidad de animales");
		animal = sc.nextInt();

		System.out.println("Introduzca los kilos de comida que consumen");
		cantidad = sc.nextInt();

		requerimiento = animal * cantidad;

		if (animal == 0) {

			System.out.println("No tienes animales, error.");
		} else if (requerimiento > comida) {

			System.out.println("Cada animal comerá " + requerimiento / animal + " kilos de comida");

		} else {

			System.out.println("Hay suficiente comida");
		}

		sc.close();
	}
}
