package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		double x1;
		double x2;
		double a;
		double b;
		double c;
		double raiz;

		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora de funciones de segundo grado (ax2 + bx + c = 0)");

		System.out.println("Introduzca a");
		a = sc.nextInt();
		System.out.println("Introduzca b");
		b = sc.nextInt();
		System.out.println("Introduzca c");
		c = sc.nextInt();

		raiz = b * b - 4 * a * c;
		if (raiz >= 0) {
			x1 = -b + Math.sqrt(b * b - 4 * a * c) / 2 * a;
			System.out.println("La solución 1 es " + x1);
			x2 = -b - Math.sqrt(b * b - 4 * a * c) / 2 * a;
			System.out.println("La solución 1 es " + x2);
		} else {
			System.out.println("No hay solución");
		}
		sc.close();
	}
}
