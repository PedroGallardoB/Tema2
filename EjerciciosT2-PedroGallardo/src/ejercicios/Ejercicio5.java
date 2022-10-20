package ejercicios;

import java.util.Scanner; //Importamos el escáner 

public class Ejercicio5 {
public static void main(String[] args) {
	
	/*PRUEBAS TRAS CODIFICAR: Hay que comprobar que el  resultados del
	 * bloque del if sea el esperado. EJEMPLOS DE PRUEBAS REALIZADAS SEGÚN LA
	 * SITUACIÓN:
	 * 
	 * -Caso en el que  introduzcamos un número negativo: Imput: -4 / Output: 4
	 * CORRECTO
	 * 
	 * -Caso en el que introduzcamos un número positivo: Imput: 14 / Output: 14
	 * CORRECTO */

	
	int num; //En esta variable guardaremos el número introducido por el usuario que será el que guarde el valor absoluto
	
	Scanner sc = new Scanner(System.in); //Llamamos al escáner
	
	
	System.out.println("Introduce un número para saber el valor absoluto"); //Pedimos al usuario un número
	num = sc.nextInt(); //Leemos el número
	
	if (num < 0) { //Condición para ejecutar la siguiente línea: que el número sea menor que cero
		num = -num;} //Cambia el valor del número

	System.out.println("La solución es " + num); //Imprime la solución
	
	sc.close(); // Cerramos el escáner

}
}
