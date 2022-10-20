package ejercicios;

import java.util.Scanner; //Importamos el escáner

public class Ejercicio8 {
	public static void main(String[] args) {

		double distancia; // En esta variable guardaremos la distancia recorrida
		double dias; // En esta variable guardaremos los días de estancia
		double precio; // En esta variable guardaremos el precio con y sin descuento

		Scanner sc = new Scanner(System.in); // Llamamos al escáner

		System.out.println("Introduzca la distancia recorrida"); // Pedimos la distancia recorrida
		distancia = sc.nextDouble(); // Leemos la distancia recorrida

		System.out.println("Introduzca los días de estancia"); // Pedimos los días de estancia
		dias = sc.nextDouble(); // Leemos los días de estancia

		precio = distancia * 2.75; // Multiplicamos la distancia en km por el precio en km

		if (distancia > 800 && dias > 7) { // Introducimos las condiciones del descuento en el condicional
			precio = precio * 0.7; // Si el condicional se cumple cambia el valor de precio a el valor con el
									// descuento
		}

		System.out.println("El precio es " + precio + " euros"); // Imprimimmos el precio final

		sc.close(); // Cerramos el escáner
	}
}
