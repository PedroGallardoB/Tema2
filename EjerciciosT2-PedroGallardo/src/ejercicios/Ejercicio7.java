package ejercicios;

import java.util.Scanner; //Importamos el escáner

public class Ejercicio7 {
	public static void main(String[] args) {

		int hor; // La variable guarda los segundos
		int min; // La variable guarda los minutos
		int seg; // La variable guarda las horas

		Scanner sc = new Scanner(System.in); // Llamamos al escáner

		// Pedimos al usuario las horas minutos y segundos

		System.out.println("Introduzca los segundos");
		seg = sc.nextInt();

		System.out.println("Introduzca los minutos");
		min = sc.nextInt();

		System.out.println("Introduzca las horas");
		hor = sc.nextInt();

		seg = seg + 1; //Hacemos que se sume un segundo a lo que introduzca el usuario

		
		if (seg > 59) { //Si los segundos superan 59

			seg = 0; //Los segundos pasan a valer cero
			min = min + 1;//Se suma un minuto a minuto

		}

		if (min > 59) { //Si los minutos superan 59

			min = 0; //Los segundos pasan a valer cero
			hor = hor + 1; //Se suma una hora a hora

		}

		System.out.println("Son " + hor + " horas," + min + " minutos, y " + seg + " segundos si añadimos un segundo"); // Mostramos
		// el
		// resultado
		sc.close();// Cerramos el escáner

	}
}
