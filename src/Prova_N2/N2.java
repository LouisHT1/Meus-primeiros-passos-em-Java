package Prova_N2;

import java.util.Scanner;

public class N2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota_1, nota_2, nota_3, me, ma;
		int cod;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nQual o seu número de identificação:");
		cod = leia.nextInt();
		System.out.println("\nQual foi a sua primeira nota:");
		nota_1 = leia.nextFloat();
		System.out.println("\nQual foi a sua segunda nota:");
		nota_2 = leia.nextFloat();	
		System.out.println("\nQual foi a sua terceira nota:");
		nota_3 = leia.nextFloat();
		System.out.println("\nQual foi a sua média nos exercícios:");
		me = leia.nextFloat();
		
		ma = (nota_1 + nota_2 * 2 + nota_3 * 3 + me) /7;
		
		System.out.println("\nO seu número de identificação é: "+cod);
		System.out.println("\nSua primeira nota foi: "+nota_1);
		System.out.println("\nSua segunda nota foi: "+nota_2);
		System.out.println("\nSua terceira nota foi: "+nota_3);
		System.out.println("\nSua média dos exercícios foi: "+me);
		System.out.printf("\nSua média de aproveitamento foi: %.2f ",ma);
		
		if(ma >= 90) {
			System.out.println("\n\tClassificação: A");
			System.out.println("\n'APROVADO'");
		}
		
		else if(ma >=75 && ma<90) {
			System.out.println("\nClassificação: B");
			System.out.println("\n'APROVADO'");
		}
		else if(ma >= 60 && ma<75) {
			System.out.println("\nClassificação: C");
			System.out.println("\n'APROVADO'");
		}
		else if(ma>=40 && ma<60) {
			System.out.println("\nClassificação: D");
			System.out.println("\n'REPROVADO'");
		}
		else if(ma<40) {
			System.out.println("\nClassificação: E");
			System.out.println("\n'REPROVADO'");
		}
		else {
			System.out.println("Notas não computadas!!");
		}
		
		
		

	}

}
