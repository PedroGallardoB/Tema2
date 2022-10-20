package ejercicios;

import java.util.Scanner; //Importamos el escáner

public class Ejercicio6 {
public static void main(String[] args) {
	
	int num1; // En esta variable guardaremos el primer número introducido por el usuario
	int num2; //En esta variable guardaremos el segundo número introducido por el usuario 
	int resultado; //En esta variable guardaremos el resultado
	
	Scanner sc = new Scanner(System.in); //Llamamos al escáner
	
	//Generamos dos número aleatorio multiplicando un número del 0 al 1 por 99, es necesario castear a int la operación
	num1 = (int)(Math.random() *99); 
	num2 = (int)(Math.random() *99); 
	
	//Imprimimos los números para que el usuario los sume
	System.out.println("Introduzca la suma de los siguientes números: " + num1 + " y " + num2);
	
	resultado = sc.nextInt(); 	//Guardamos el resultado
	
	if (resultado == num1 + num2) { //CONDICIÓN la suma de los números aleatorios coincide con el resultado introducido
	
		System.out.println("Es correcto"); //Caso afirmativo: Decimos que es correcto

	} else { //De lo contrario...
	
	System.out.println("Es incorrecto"); //... Decimos que es incorrecto
}
	sc.close(); //Cerramos el escáner
}
}