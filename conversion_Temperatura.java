package primer_Proyecto;

import java.util.Scanner;

public class conversion_Temperatura {
	public static void main (String [] arg) {
		Scanner entrada = new Scanner( System.in );
		float celcius;
		float farenheit;
					
		System.out.println("Ingresa la temperatura en grados Celcius");
		celcius = entrada.nextFloat();
		
		farenheit = (celcius * 9/5) + 32;
		
		System.out.println("La temperatura en grados Farenheit es " + farenheit);
		}

}
