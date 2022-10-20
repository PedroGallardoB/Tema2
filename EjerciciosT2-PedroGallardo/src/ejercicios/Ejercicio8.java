package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
public static void main(String[] args) {
	
	double distancia;
	double dias;
	double precio;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduzca la distancia recorrida");
	distancia = sc.nextDouble();
	
	System.out.println("Introduzca los días de estancia");
	dias = sc.nextDouble();
	
	precio = distancia * 2.75;
	
	if (distancia > 800 && dias > 7){
		precio = precio*0.7;
	}
	
	System.out.println("El precio es " + precio + " euros");
	
	sc.close();
}
}
