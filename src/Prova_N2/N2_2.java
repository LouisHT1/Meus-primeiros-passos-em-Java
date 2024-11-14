package Prova_N2;

import java.util.Scanner;

public class N2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float s_atual, s_novo;
		int anos,op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQuantos anos você tem na empresa:");
		anos = leia.nextInt();
		System.out.println("\nQual o seu salário atual:");
		s_atual = leia.nextFloat();
		System.out.println("\nQual o seu gênero:");
		System.out.println("\n1-Masculino");
		System.out.println("\n2-Feminino");
		op = leia.nextInt();
		
		System.out.println("Você tem "+anos+" anos na empresa");
		System.out.printf("Seu salário atual é de %.2f", s_atual);
		
		switch(op) {
		case 1 :
			System.out.println("\nSeu gênero é Masculino");
			if(anos < 20) {
				s_novo = (float) (s_atual * 1.03);
				System.out.printf("Seu novo salário é de R$ %.2f reais",s_novo);
			}
			else if(anos >= 20 && anos <= 30) {
				s_novo = (float) (s_atual * 1.13);
				System.out.printf("Seu novo salário é de R$ %.2f reais",s_novo);
			}
			else if(anos > 30) {
				s_novo = (float) (s_atual * 1.25);
				System.out.printf("Seu novo salário é de R$ %.2f reais",s_novo);
			}
			else {
				s_novo = 0;
			}
			break;
			
		case 2:
			System.out.println("\nSeu gênero é Feminino");
			if(anos < 15) {
				s_novo = (float) (s_atual * 1.05);
				System.out.printf("Seu novo salário é de R$ %.2f reais",s_novo);
			}
			else if(anos >= 15 && anos <= 20) {
				s_novo = (float) (s_atual * 1.12);
				System.out.printf("Seu novo salário é de R$ %.2f reais",s_novo);
			}
			else if(anos > 20) {
				s_novo = (float) (s_atual * 1.25);
				System.out.printf("Seu novo salário é de R$ %.2f reais",s_novo);
			}
			else {
				s_novo = 0;
			}
			break;
		}
		

	}

}
