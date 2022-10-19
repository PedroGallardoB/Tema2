package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		int hor;
		int min;
		int seg;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca los segundos");
		seg = sc.nextInt();

		System.out.println("Introduzca los minutos");
		min = sc.nextInt();

		System.out.println("Introduzca las horas");
		hor = sc.nextInt();
		
		seg = (seg + 1 + hor*3600 + min * 60);

		hor = seg / 3600; // Convertimos segundos a horas
		min = (seg % 3600) / 60; // Convertimos segundos a minutos con el resto de la operación anterior
		seg = (seg % 60);// Los segundos serán el resto de dividir el total de ellos entre 60 (pasar a
							// minutos)

		System.out.println("Son " + hor + " horas," + min + " minutos, y " + seg + " segundos si añadimos un segundo"); // Mostramos
		// el
		// resultado
		sc.close();// Cerramos el escáner

	}
}
