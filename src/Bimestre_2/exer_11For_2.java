package Bimestre_2;

import java.util.Scanner;

public class exer_11For_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op,x,conteM=0;
		float alt,maior=0,menor=0,altM=0,altW=0;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=1;x<=5;x++) {
			System.out.println("Pessoa "+x);
			System.out.println("Qual o seu Gênero:");
			System.out.println("1 - Masculino");
			System.out.println("2 - Feminino");
			op = leia.nextInt();
			System.out.println("Qual a sua altura:");
			alt = leia.nextFloat();
			if(maior<alt) {
				maior = alt;
			}
			if(menor>alt){
				menor = alt;
			}
			
			switch(op) {
			case 1:
				conteM ++;
				altM += alt;
				break;
			case 2:
				if(altW<alt) {
					altW = alt;
				break;
			
				
				}
			}
			
			
		
			
		}
		altM = altM/conteM;
		System.out.println("\nA menor altura: "+menor);
		System.out.println("\nA maior altura: "+maior);
		System.out.printf("\nA média da altura dos homens: %.2f",altM);
		System.out.println("\nA altura da mulher mais alta "+altW);
		System.out.println("\nA quantidade de homens: "+conteM);
		

	}

}
