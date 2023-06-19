package primer_Proyecto;
import java.util.Scanner;

public class area_Rectangulo {
	
	public static void main (String [] arg) {
	Scanner entrada = new Scanner( System.in );
	int num1;
	int num2;
	int mult;
		
	System.out.println("Ingresa la base del rectangulo");
	num1 = entrada.nextInt();
	System.out.println("Ingresa la altura del rectangulo");
	num2 = entrada.nextInt();
	
	mult = num1 * num2;
	System.out.println("El area es " + mult);
	
	}
}
