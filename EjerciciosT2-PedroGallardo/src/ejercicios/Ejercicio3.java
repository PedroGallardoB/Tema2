package ejercicios;

import java.util.Scanner; //Importamos el escáner 

public class Ejercicio3 {

	/*
	 * PRUEBAS TRAS CODIFICAR: Una vez codificado el programa, se sometió a pruebas
	 * para determinar su correcto funcionamiento y comprobar las diferentes
	 * situaciones a las que se podría enfrentar, EJEMPLOS DE PRUEBAS REALIZADAS
	 * SEGÚN LA SITUACIÓN:
	 * 
	 * OPCIÓN DE QUE ANIMAL SEA 0:
	 * 
	 * Imput de kilos de comida comprada: 2 Imput de cantidad de cantidad de
	 * animales: 0 Imput de comida consumida (kg): 3
	 * 
	 * Output: Usted no tiene animales CORRECTO
	 * 
	 * OPCIÓN DE QUE FALTE COMIDA:
	 * 
	 * Imput de kilos de comida comprada: 14 Imput de cantidad de cantidad de
	 * animales: 2 Imput de comida consumida (kg): 21
	 * 
	 * Output: Hacen falta 3.5 kilos de comida para cada animal CORRECTO
	 * 
	 * OPCIÓN DE HAYA SUFICIENTE COMIDA:
	 * 
	 * Imput de kilos de comida comprada: 14 Imput de cantidad de cantidad de
	 * animales: 2 Imput de comida consumida (kg): 6
	 * 
	 * Output: Hay suficiente comida CORRECTO
	 */

	public static void main(String[] args) {

		double comida;// Variable donde guardaremos la cantidad de comida comprada
		double animal;// Variable donde guardaremos la cantidad de animales
		double total;// Variable donde guardaremos la cantidad de comida consumida
		double requerimiento;// Variable donde guardaremos cuanta comida hace falta por animal

		Scanner sc = new Scanner(System.in); // Llamamos al escáner

		// Pedimos y leemos los kilos de comida que compra el usuario
		System.out.println("Introduzca los kilos de comida comprada");// PEDIR
		comida = sc.nextInt();// LEER

		// Pedimos y leemos la cantidad de comida del usuario
		System.out.println("Introduzca la cantidad de animales");// PEDIR
		animal = sc.nextInt();// LEER
		// Pedimos y leemos los kilos de comida que se consume
		System.out.println("Introduzca los kilos de comida que consumen en total");// PEDIR
		total = sc.nextInt();// LEER

		requerimiento = (comida - total / animal);// Calculamos la comida que hará falta si no hay suficiente

		if (animal == 0) { //Si no hay animales...

			System.out.println("No tienes animales, error."); //...Se lo comunicamos al usuario
		
		} else if (total <= comida) { //Si hay más o la suficiente comida...

			System.out.println("Hay suficiente comida"); //...Se lo comunicamos al usuario

		} else { //Si no hay suficiente comida...

			System.out.println("Hacen falta " + requerimiento + " kilos de comida para cada animal"); //...Se lo comunicamos al usuario
		}

		sc.close(); //Cerramos el escáner
		
	}
}
