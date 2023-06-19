package primer_Proyecto;

import java.util.Scanner;

public class area_Circulo {
	public static void main (String [] arg) {
		Scanner entrada = new Scanner( System.in );
		float diametro;
		double area;
					
		System.out.println("Ingresa la medida del diametro");
		diametro = entrada.nextFloat();
		
		area = 3.1416 * ((diametro/2)*(diametro/2));
		
		System.out.println("El area del circulo es " + area);
		}

}
