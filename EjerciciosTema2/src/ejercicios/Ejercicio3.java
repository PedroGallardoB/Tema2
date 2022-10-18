package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		double número;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un número");
		número = sc.nextDouble();

		if (1 > número && número > -1 && número != 0) {
			System.out.println("El número introducido es casi cero");
		} else
			System.out.println("El número introducido no es casi cero");
		sc.close();
	}
}
