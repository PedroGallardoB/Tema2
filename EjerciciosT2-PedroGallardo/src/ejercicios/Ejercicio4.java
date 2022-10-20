package ejercicios;

import java.util.Scanner; //Importamos el escáner 

public class Ejercicio4 {

	public static void main(String[] args) {

		/*
		 * PRUEBAS TRAS CODIFICAR: Hay que comprobar que el resultados de todos los
		 * bloques de if sean los esperados. EJEMPLOS DE PRUEBAS REALIZADAS SEGÚN LA
		 * SITUACIÓN:
		 * 
		 * -Caso en el que solo introduzcamos una unidad: Imput: 4 / Output: Cuatro
		 * CORRECTO
		 * 
		 * -Caso en el que introduzcamos una excepción Imput: 14 / Output: catorce
		 * CORRECTO
		 * 
		 * -Caso en el que introduzcamos un número de dos décimas sin "y" Imput: 22/
		 * Output: veintidos CORRECTO
		 * 
		 * -Caso en el que introduzcamos un número de dos décimas con "y" Imput: 67 /
		 * Output: sesenta y siete CORRECTO
		 */

		String unidad; // En esta variable guardaremos las unidades
		int numero; // En esta variable guardaremos el número que introduce el usuario
		String decena;// En esta variable guardaremos las decenas

		Scanner sc = new Scanner(System.in); // Llamamos al escáner

		System.out.println("Introduzca un número del 1 al 99"); // Pedimos un número al usuario

		numero = sc.nextInt(); // Leemos el número

		// Bloque de asignar unidades (Da valores a las unidades y los guarda en la
		// variable unidad

		unidad = switch (numero % 10) { // Hacemos el resto entre diez del número introducido, porque será la unidad
		case 1 -> {

			// Asignamos valores al resto con la función yield

			yield "uno";
		}
		case 2 -> {
			yield "dos";
		}
		case 3 -> {
			yield "tres";
		}
		case 4 -> {
			yield "cuatro";
		}
		case 5 -> {
			yield "cinco";
		}
		case 6 -> {
			yield "seis";
		}
		case 7 -> {
			yield "siete";
		}
		case 8 -> {
			yield "ocho";
		}
		case 9 -> {
			yield "nueve";
		}
		default -> "";

		};

		// Bloque de asignar decenas
		// Las decenas se guardan en decena como resultado del resto de dividir entre 10
		// un número ya dividido entre 10
		decena = switch (numero / 10 % 10) {

		case 1 -> {
			yield "dieci"; // No llevarán "y"
		}
		case 2 -> {
			yield "veinti";
		}
		case 3 -> {
			yield "treinta"; // Llevarán "y"
		}
		case 4 -> {
			yield "cuarenta";
		}
		case 5 -> {
			yield "cincuenta";
		}
		case 6 -> {
			yield "sesenta";
		}
		case 7 -> {
			yield "setenta";
		}
		case 8 -> {
			yield "ochenta";
		}
		case 9 -> {
			yield "noventa";
		}
		default -> "";

		};

		// Bloque de imprimir excepciones

		if (numero <= 9) {

			System.out.println("El número es " + unidad); // Las unidades, que no llevan decenas (menores de 10) se
															// imprimen aquí

			// Seleccionamos números mayores que nueve y menores que 16 (incluimos el 200)

		} else if (numero > 9 && numero < 16 || numero == 20) {

			switch (numero) {

			case 10 -> {
				System.out.println("diez");
			}
			case 11 -> {
				System.out.println("once");
			}
			case 12 -> {
				System.out.println("doce");
			}
			case 13 -> {
				System.out.println("trece");
			}
			case 14 -> {
				System.out.println("catorce");
			}
			case 15 -> {
				System.out.println("quince");
			}
			case 20 -> {
				System.out.println("veinte");

			}
			}

			// Bloque de imprimir dos dígitos con y sin "y"

		} else if (numero > 10 && numero <= 29) { // Si el número está entre 11 y 29 se ejecuta

			System.out.println("El número es " + decena + unidad); // Imprime números sin "y"

		} else if (numero > 29) { // Si el número es mayor de 29 se ejecuta

			System.out.println("El número es " + decena + " y " + unidad); // Imprime números con "y"

		}

		sc.close(); // Cerramos el escáner
	}

}
