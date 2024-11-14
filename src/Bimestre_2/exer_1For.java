package Bimestre_2;

import java.util.Scanner;

public class exer_1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,x,contador=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=1;x<=5;x++) {
			System.out.println("\nDigite um número: ");
			a = leia.nextInt();
			
			System.out.println("\nEsse foi seu número: "+a);
			if (a < 0) {
				contador ++;
			}
			
		}
		
		System.out.println("\n"+contador+" desses números foram negativos");

	}

}
