package ejercicios;

import java.util.Scanner;//Importamos el escáner

public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaramos las variables que guardarán las cifras introducidas
		int número1;
		int número2;
		
		Scanner sc = new Scanner(System.in);//Nombramos al escáner

		//Pedimos y leemos los números
		System.out.println("Introduzca dos números para ver si son iguales");
		System.out.println("Introduzca el primero");
		número1 = sc.nextInt();
		System.out.println("Introduzca el segundo");
		número2 = sc.nextInt();
		//Operadores lógicos
		if (número1 == número2) {	//Si los números tienen el mismo valor...
			System.out.println("Los números son iguales.");	//Imprime que son iguales
		} else {	//Si no
			System.out.println("Los números son diferentes"); //Imprime que son diferentes
		}
		sc.close(); //Cerramos el escáner
	}

}
