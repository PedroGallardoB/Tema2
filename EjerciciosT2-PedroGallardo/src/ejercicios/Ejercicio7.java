package ejercicios;

import java.util.Scanner; //Importamos el escáner

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*
		 * PRUEBAS TRAS CODIFICAR: Hay que comprobar que el resultados de los bloques "if"
		 * sea el esperado. EJEMPLOS DE PRUEBAS REALIZADAS SEGÚN LA SITUACIÓN:
		 * 
		 * -CASO EN EL QUE EL USUARIO NO INTRODUCE 59 SEGUNDOS: 
		 * 
		 * IMPUTS:
		 * -Segundos: 20
		 * -Minutos: 43
		 * -Horas: 12
		 * 
		 * OUTPUT: Son 12 horas, 43 minutos, y 20 segundos si añadimos un segundo
		 * 
		 * CORRECTO
		 * 
		 * -CASO EN EL QUE EL USUARIO NO INTRODUCE 59 SEGUNDOS (SOLO DEBEN AVANZAR LOS MINUTOS): 
		 * 
		 * IMPUTS:
		 * -Segundos: 59
		 * -Minutos: 23
		 * -Horas: 2
		 * 
		 * OUTPUT: Son 2 horas, 24 minutos, y 0 segundos si añadimos un segundo
		 * 
		 * CORRECTO
		 * 
		 * -CASO EN EL QUE EL USUARIO NO INTRODUCE 59 SEGUNDOS (DEBEN AVANZAR MINUTOS Y HORAS): 
		 * 
		 * IMPUTS:
		 * -Segundos: 59
		 * -Minutos: 59
		 * -Horas: 2
		 * 
		 * OUTPUT: Son 3 horas, 0 minutos, y 0 segundos si añadimos un segundo
		 * 
		 * CORRECTO
		 */

		int hor; // La variable guarda los segundos
		int min; // La variable guarda los minutos
		int seg; // La variable guarda las horas

		Scanner sc = new Scanner(System.in); // Llamamos al escáner

		// Pedimos al usuario las horas minutos y segundos

		System.out.println("Introduzca los segundos"); // Pedimos
		seg = sc.nextInt(); // Leemos

		System.out.println("Introduzca los minutos"); // Pedimos
		min = sc.nextInt(); // Leemos

		System.out.println("Introduzca las horas"); // Pedimos
		hor = sc.nextInt(); // Leemos

		seg = seg + 1; // Hacemos que se sume un segundo a lo que introduzca el usuario

		if (seg > 59) { // Si los segundos superan 59

			seg = 0; // Los segundos pasan a valer cero
			min = min + 1;// Se suma un minuto a minuto

		}

		if (min > 59) { // Si los minutos superan 59

			min = 0; // Los segundos pasan a valer cero
			hor = hor + 1; // Se suma una hora a hora

		}
		// Mostramos el resultado
		System.out.println("Son " + hor + " horas," + min + " minutos, y " + seg + " segundos si añadimos un segundo");

		sc.close();// Cerramos el escáner

	}
}
