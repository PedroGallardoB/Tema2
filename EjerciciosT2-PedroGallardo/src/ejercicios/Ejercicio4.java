package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
	int num;
	String un;
	String nu;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduzca un número del 1 al 99");
	
	num = sc.nextInt();
	
	un = switch (num % 10){
	case 1 -> {
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
}
}
