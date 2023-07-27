package ejerciciosGithub;
import java.util.Scanner;


public class ejercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Edad del cliente: ");
		int edad = in.nextInt();
		
		double precio;
		if (edad >= 5 && edad <=59) {
			precio= 7;
		} else if (edad < 5) {
			precio= (7-(7*0.60));
		} else {
			precio= (7-(7*0.55));
		}
		System.out.println("El precio total de su boleto es de " + precio + " euros.");
		in.close();

	}//main
}//class