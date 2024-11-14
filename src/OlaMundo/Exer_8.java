package OlaMundo;

import java.util.Scanner;

public class Exer_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float a ,b , c, d, e, f, x, y;
		
		Scanner leu = new Scanner(System.in);
		
		System.out.println("Escreva o valor de A:");
		a = leu.nextInt();
		System.out.println("Escreva o valor de B:");
		b = leu.nextInt();
		System.out.println("Escreva o valor de C:");
		c = leu.nextInt();
		System.out.println("Escreva o valor de D:");
		d = leu.nextInt();
		System.out.println("Escreva o valor de E:");
		e = leu.nextInt();
		System.out.println("Escreva o valor de F:");
		f = leu.nextInt();
		
		x = (c*e - b*f)/(a*f - c*d);
		y = (a*f - c*d)/(a*f - c*d);
		
		System.out.printf("\nO Resultado de X foi de: %.1f", x);
		System.out.printf("\nO Resultado de Y foi de : %.1f", y);
		
		
		

	}

}
