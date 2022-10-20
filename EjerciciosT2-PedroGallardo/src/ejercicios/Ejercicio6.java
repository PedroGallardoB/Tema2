package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
	
	int num1;
	int num2;
	int resultado;
	
	Scanner sc = new Scanner(System.in);
	
	num1 = (int)(Math.random() *99);
	num2 = (int)(Math.random() *99);
	
	System.out.println("Introduzca la suma de los siguientes números: " + num1 + " y " + num2);
	resultado = sc.nextInt();
	
	if (resultado == num1 + num2) {
	System.out.println("Es correcto");
} else {
	
	System.out.println("Es incorrecto");
}
	sc.close();
}
}