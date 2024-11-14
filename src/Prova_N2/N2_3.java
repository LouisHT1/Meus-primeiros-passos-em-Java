package Prova_N2;

import java.util.Scanner;

public class N2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num_1,num_2,num_3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o primeiro número:");
		num_1 = leia.nextInt();
		System.out.println("Escreva o segundo número:");
		num_2 = leia.nextInt();
		System.out.println("Escreva o terceiro número:");
		num_3 = leia.nextInt();
		
		if(num_1>num_2 && num_1>num_3) {
			System.out.println(num_1);
		}
		else if(num_2<num_1 && num_2>num_3) {
			System.out.println(num_2);
		}
		else if(num_3<num_1 && num_3<num_2) {
			System.out.println(num_3);
		}
		
		
		if(num_2>num_1 && num_2>num_3) {
			System.out.println(num_2);
		}
		
		

	}

}
