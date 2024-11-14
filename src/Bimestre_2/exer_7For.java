package Bimestre_2;

import java.util.Scanner;

public class exer_7For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,x,tab;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número para a tabuada: ");
		n = leia.nextInt();
		
		for(x=1;x<=10;x++) {
			tab = n*x;
			System.out.println(n+" X "+x+" = "+tab);
		}

	}

}
