package OlaMundo;

import java.util.Scanner;


class OlaMundo {
	public static void main(String[] args) {
		
		String nome = "Luiz Henrique";
		int idade = 21;
		float altura = (float) 1.75,n1,n2,media;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Informações pessoais abaixo:");
		
		System.out.println("\n\tMeu nome é: "+nome);
		System.out.println("\n\tEu tenho: "+idade+" ano(s)...");
		System.out.println("\n\tMinha altura é: "+altura+" metros(s)...");
		
		System.out.println("\n\tEntre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\n\tEntre com a segunda nota: ");
		n2 = leia.nextFloat();
		
		media = (n1 + n2) / 2;
		
		System.out.println("\n\tSua média foi de: "+media);
		System.out.printf("\n\tSua média foi de: %.2f ",media);
		
	}

}
