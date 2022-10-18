package ejercicios;

import java.util.Scanner;//The scanner is imported

public class Ejercicio2 {

	/*
	
	 */
	
	public static void main(String[] args) {

		int num; //We declare a variable to save the number that the user writes down
		
		Scanner sc = new Scanner(System.in);//The scanner is named
		
		
		System.out.println("Introduzca un número entre 0 y 9999");//This line asks for a number 
		num = sc.nextInt();//The program saves a number that the user writes down
		
		if (num < 0 || num > 9999) { //If the number is not in the limits, this condition write it down
			
			System.out.println("El número está fuera de los límites permitidos ");
	
		} else if (num < 10) {//If the num
			
			System.out.println("El número es capicúa");

		
			} else if (num < 100 && num/10 == num % 10) {
		
					System.out.println("El número introducido es capicúa");

			 } else if (num < 1000 && num / 100 == num%10) { 
				 
				 System.out.println("El número introducido es capicúa");
			
			 } else if (num < 10000 && num / 1000 == num % 10 && ((num/100)%10)==((num/10)%10)){ 
				 
				 System.out.println("El número introducido es capicúa");	 
			 

			 } else 
				 System.out.println("El número introducido no es capicúa");
			
			 sc.close();
}
}


