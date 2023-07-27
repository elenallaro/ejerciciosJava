package ejerciciosGithub;
import java.util.Scanner;


public class ejercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Escribe tu número de ventas del mes: ");
		int sales = in.nextInt();
		
		short commission;
		if (sales >= 10000) {
			commission= 30;
		} else if (sales >= 5001  && sales <= 9999) {
			commission= 20;
		} else if (sales >= 1001 && sales <=5000) {
			commission= 10;
		} else {
			commission= 0;
		}
		System.out.println("Tu comisión es del " + commission + "%");
		in.close();

	}//main
}//class
