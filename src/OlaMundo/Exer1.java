package OlaMundo;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x1,x2,y1,y2;
		double d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tEntre com o valor de x1: ");
		x1 = leia.nextFloat();
		System.out.println("\n\tEntre com o valor de x2: ");
		x2 = leia.nextFloat();
		System.out.println("\n\tEntre com o valor de y2:  ");
		y2 = leia.nextFloat();
		System.out.println("\n\tEntre com o valor de y1: ");
		y1 = leia.nextFloat();
		
		d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		
		System.out.println("\n\tO valor de D foi de: "+d);
		System.out.printf("\n\tO valor de D foi de: %.4f ",d);
		

	}

}
