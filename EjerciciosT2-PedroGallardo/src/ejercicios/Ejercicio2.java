package ejercicios;

import java.util.Scanner;//The scanner is imported

public class Ejercicio2 {

	/*Para probar este programa se introducen DNIs que terminen en cada una de las letras,
	y vemos si en algún caso da error */
	

		public static void main(String[] args) {
			
			int num; //We declare a variable to save the number that the user writes down
			
			Scanner sc = new Scanner(System.in);//The scanner is named
			
			
			System.out.println("Introduzca un número del DNI para averiguar su letra");//This line asks for a number 
			num = sc.nextInt();//The program saves a number that the user writes down
			
			//En función del resultado de dividir entre 23 asignamos una letra
			switch (num%23) {
			case 0:
				System.out.println("Su letra es T");
				break;
			case 1:
				System.out.println("Su letra es R");
				break;
			case 2:
				System.out.println("Su letra es A");
				break;
			case 3:
				System.out.println("Su letra es W");
				break;
			case 4:
				System.out.println("Su letra es G");
				break;
			case 5:
				System.out.println("Su letra es M");
				break;
			case 6:
				System.out.println("Su letra es Y");
				break;
			case 7:
				System.out.println("Su letra es F");
				break;
			case 8:
				System.out.println("Su letra es P");
				break;
			case 9:
				System.out.println("Su letra es D");
				break;
			case 10:
				System.out.println("Su letra es X");
				break;
			case 11:
				System.out.println("Su letra es B");
				break;
			case 12:
				System.out.println("Su letra es N");
				break;
			case 13:
				System.out.println("Su letra es J");
				break;
			case 14:
				System.out.println("Su letra es Z");
				break;
			case 15:
				System.out.println("Su letra es S");
				break;
			case 16:
				System.out.println("Su letra es Q");
				break;
			case 17:
				System.out.println("Su letra es V");
				break;
			case 18:
				System.out.println("Su letra es H");
				break;
			case 19:
				System.out.println("Su letra es L");
				break;
			case 20:
				System.out.println("Su letra es C");
				break;
			case 21:
				System.out.println("Su letra es K");
				break;
			case 22:
				System.out.println("Su letra es E");
				break;	
		}
			sc.close();//Cerramos el escáner
		}
		}
