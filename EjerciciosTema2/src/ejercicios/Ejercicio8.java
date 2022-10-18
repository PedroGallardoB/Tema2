package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
public static void main(String[] args) {
	
	int nota;
	Scanner sc = new Scanner(System.in);

	System.out.println("Introduzca una nota");
	nota = sc.nextInt();

	if (nota < 0) {
		System.out.println("El número es demasiado pequeño");
		
	} else if ( 0 < nota && nota < 5) {
		
		System.out.println("Insuficiente");

	} else if (5 <= nota && nota > 6) {
		
		System.out.println("Suficiente");

	} else if (6 <= nota && nota > 7) {
		
		System.out.println("Bien");
		
	}else if (7 <= nota && nota > 9) {
		
			System.out.println("El número tiene cinco cifras");
			
	}else if (9 <= nota && nota >= 10) {
		
		System.out.println("El número es demasiado grande");
		
	}else if (nota > 10) {
		
		System.out.println("Error, demasiado grande");
	}
	
	sc.close();
}
}
