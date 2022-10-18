package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número del 0 al 99999");
		num = sc.nextInt();

		if (num < 10) {
			System.out.println("El número tiene una cifra");
		} else if (num < 100) {
			System.out.println("El número tiene dos cifras");

		} else if (num < 1000) {
			System.out.println("El número tiene tres cifras");

		} else if (num < 10000) {
			System.out.println("El número tiene cuatro cifras");
		}else if (num < 100000) {
				System.out.println("El número tiene cinco cifras");
		}else if (num >= 100000) {
			System.out.println("El número es demasiado grande");
		}else if (num < 0) {
			System.out.println("El número es demasiado pequeño");
		}
		sc.close();
	}
}
