package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int prim;
		int seg;
		int ter;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro número");
		num2 = sc.nextInt();
		System.out.println("Introduzca otro número");
		num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {

			prim = num1;

		} else {

			if (num2 > num1 && num2 > num3) {

				prim = num2;

			} else {

				prim = num3;
			}
		}

		if (num1 < prim && num1 > num3 || num1 > num2) {

			seg = num1;

		} else {

			if (num2 < prim && num2 > num3 || num2 > num1) {

				seg = num2;

			} else {

				seg = num3;

			}
		}

		if (num1 != prim && num1 != seg) {

			ter = num1;

		} else {

			if (num2 != prim && num2 != seg) {

				ter = num2;

			} else {

				ter = num3;
			}

			System.out.println("El primer número es " + prim + ", el segundo " + seg + " y el tercero " + ter
					+ " de mayor a menor");
			sc.close();
		}

	}
}
