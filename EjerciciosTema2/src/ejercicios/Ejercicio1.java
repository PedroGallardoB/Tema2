package ejercicios;

import java.util.Scanner;//Importamos el escáner

public class Ejercicio1 {
	public static void main(String[] args) {
		int número;//Variable que almacena el número introducido
		Scanner sc = new Scanner(System.in);//Llamamos al escáner
		
		//Pedimos y leemos un número introducido por el usuario
		System.out.println("Introduzca un número para comprobar que sea par");
		número = sc.nextInt();
		
	
		if (número % 2 == 0) {	//Si el resto de dividir entre dos es cero...

			System.out.println("El número es par");	//Es par
		} else {	//En caso contrario
			System.out.println("El número es impar");	//Es impar
		}
		sc.close();	//Cerramos el escáner
	}
}
