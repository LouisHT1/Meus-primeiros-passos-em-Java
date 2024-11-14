package OlaMundo;

import java.util.Scanner;

public class Exer_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Me dê a sua primeira nota:");
		n1 = leia.nextFloat();
		System.out.println("Me dê a sua segunda nota:");
		n2 = leia.nextFloat();
		System.out.println("Me dê a sua terceira nota");
		n3 = leia.nextFloat();
		
		media = n1/2+n2/3+n3/5;
		
		System.out.printf("Sua média foi de: %.1f ", media);
		

	}

}
