package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		

	String unidad;
	int numero;
	String decena;
	

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduzca un número del 1 al 99");
	
	numero = sc.nextInt();
	
	unidad = switch (numero % 10){
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

decena = switch (numero/ 10 % 10){

case 1 -> {
	yield "dieci";
	}
case 2 -> {
	yield "veinti";
	}
case 3 -> {
	yield "treinta";
	}
case 4 -> {
	yield "cuarenta";
	}
case 5 -> {
	yield "cincuenta";
	}
case 6 -> {
	yield "sesenta";
	}
case 7 -> {
	yield "setenta";
	}
case 8 -> {
	yield "ochenta";
	}
case 9 -> {
	yield "noventa";
	}
default -> "";

};

if (numero <= 9) {
	
	System.out.println("El número es " + unidad);
	
} else if (numero > 9 && numero < 16 || numero == 20) {

	switch (numero){

	case 10 -> {
		System.out.println("diez");
		}
	case 11 -> {
		System.out.println("once");
		}
	case 12 -> {
		System.out.println("doce");
		}
	case 13 -> {
		System.out.println("trece");
		}
	case 14 -> {
		System.out.println("catorce");
		}
	case 15 -> {
		System.out.println("quince");
	}
	case 20 -> {
		System.out.println("veinte");
		
	} 
	} 
	
	}else if (numero > 10 && numero < 29) {
	

	System.out.println("El número es "+ decena + unidad);
	
}else if (numero > 29) {
	
	System.out.println("El número es "+ decena + " y " + unidad);
	
}
	
sc.close();
}
	
}

