package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	
	int num;
	int sol;
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Introduce un número para saber el valor absoluto");
	num = sc.nextInt();
	
	if (num < 0) {
		sol = -num;
	}else {
		sol = num;
	}
	
	System.out.println("La solución es " + sol);
	sc.close();

}
}
