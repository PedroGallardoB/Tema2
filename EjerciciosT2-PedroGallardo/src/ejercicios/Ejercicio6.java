package ejercicios;

import java.util.Scanner; //Importamos el escáner

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*
		 * PRUEBAS TRAS CODIFICAR: Hay que comprobar que el resultados del bloque del if
		 * sea el esperado. EJEMPLOS DE PRUEBAS REALIZADAS SEGÚN LA SITUACIÓN:
		 * 
		 * -Caso en el que el resultado de la suma coincida con el introducido: 
		 * 
		 * El programa entrega 34 y 12
		 * 
		 * Imput: 46 / Output: El resultado es correcto
		 * CORRECTO
		 * 
		 * -Caso en el que el resultado de la suma no coincida con el introducido: 
		 * 
		 * El programa entrega 54 y 36
		 * 
		 * Imput: 45 (El resultado es 90) / Output: El resultado es incorrecto
		 * CORRECTO
		 */

		int num1; // En esta variable guardaremos el primer número introducido por el usuario
		int num2; // En esta variable guardaremos el segundo número introducido por el usuario
		int resultado; // En esta variable guardaremos el resultado

		Scanner sc = new Scanner(System.in); // Llamamos al escáner

		// Generamos dos número aleatorio multiplicando un número del 0 al 1 por 99, es
		// necesario castear a int la operación
		num1 = (int) (Math.random() * 99);
		num2 = (int) (Math.random() * 99);

		// Imprimimos los números para que el usuario los sume
		System.out.println("Introduzca la suma de los siguientes números: " + num1 + " y " + num2);

		resultado = sc.nextInt(); // Guardamos el resultado

		if (resultado == num1 + num2) { // CONDICIÓN: La suma de los números aleatorios coincide con el resultado
										// introducido

			System.out.println("El resultado es correcto"); // Caso afirmativo: Decimos que es correcto

		} else { // De lo contrario...

			System.out.println("El resultado es incorrecto"); // ... Decimos que es incorrecto
		}
		sc.close(); // Cerramos el escáner
	}
}