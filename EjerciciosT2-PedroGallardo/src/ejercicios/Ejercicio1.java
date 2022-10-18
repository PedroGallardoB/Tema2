package ejercicios;

import java.util.Scanner;//The scanner is imported

public class Ejercicio1 {

	/*
	Tests of conditionals:
	
	-The first if checks if the number that the user wrote was in the limit, to test it out,
	we introduce a bigger number, and a lower number than the ones that are allowed.
	
	-The second conditional checks if the number has only one digit, to test it we introduce
	a number of one digit, and then a number of two digits. With one digit the program has to
	always answer that the number is palindromic
	
	-The third conditional checks if the number has two digits and if it is palindromic, we have to introduce
	numbers with more digits, with less and introducing palindromic and not palindromic numbers  
	
	 -We will do the same tests with each one of the following conditionals than with the ones with three.
	
	-Finally, we would have tested all the options
	 */
	
	public static void main(String[] args) {

		int num; //We declare a variable to save the number that the user writes down
		
		Scanner sc = new Scanner(System.in);//The scanner is named
		
		
		System.out.println("Introduzca un número entre 0 y 9999");//This line asks for a number 
		num = sc.nextInt();//The program saves a number that the user writes down
		
		if (num < 0 || num > 9999) { //If the number is not in the limits, this condition write it down
			
			System.out.println("El número está fuera de los límites permitidos ");
	
		} else if (num < 10) {//If the number has one digit, it will be palindromic, and we write it down
			
			System.out.println("El número es capicúa");

		
			} else if (num < 100 && num/10 == num % 10) { //If the number has 2 digits, we watch if the two digits are the same
		
					System.out.println("El número introducido es capicúa");//If they are the same digits, we write it down

			 } else if (num < 1000 && num / 100 == num%10) { //If the number has 3 digits, we watch if the first and third digits are the same
				 
				 System.out.println("El número introducido es capicúa");//If they are the same digits, we write it down
			
			 } else if (num < 10000 && num / 1000 == num % 10 && ((num/100)%10)==((num/10)%10)){ 
				 
				 System.out.println("El número introducido es capicúa"); //If the first and the fourth & the second and the third are the same digits, we write it down 
			 

			 } else 
				 System.out.println("El número introducido no es capicúa");//If the conditions aren't true, we write it down
			
			 sc.close();
}
}


