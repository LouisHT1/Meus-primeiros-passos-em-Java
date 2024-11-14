package Bimestre_2;

import java.util.Scanner;

public class For_exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media,Somamedia=0,mg,contador=0;
		int x;
		
		Scanner leia =new Scanner(System.in);
		
		//o for tem que ter um inicio;fim;condição
		for(x=1;x<=5;x++) {
			System.out.println("\nEntre com primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com terceira nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			
			System.out.println("\nO aluno "+x+ " teve uma média de: "+media);
			
			Somamedia += media;
			
			if(media>contador) {
				contador = media;
			}
		}
		
		mg = Somamedia / 5;
		
		System.out.println("\nMédia geral foi de: "+mg);
		System.out.println("\nA maior média foi de: "+contador);

	}

}
