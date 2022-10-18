package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca dos números");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num2 > num1) {
			System.out.println("El segundo número es mayor");
		} else {
			System.out.println("El primer número es mayor");
		}

		sc.close();
	}
}