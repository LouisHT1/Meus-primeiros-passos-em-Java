package OlaMundo;

import java.util.Scanner;

public class Exemplo_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tMenu de Elogios");
		System.out.println("\n1 - Vocês são lindos");
		System.out.println("\n2 - Vocês são muito gentis");
		System.out.println("\n3 - O professor é um garoto de programa");
		System.out.println("\n4 - vocês são muito educados");
		System.out.println("\nDigite a sua opção: ");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\nVocês são lindos");
			break;
			
		case 2:
			System.out.println("\nVocês são muito gentis");
			if (op == 2) {
				System.out.println("Além de gentis são participantes");
			}
			break;
		case 3:
			System.out.println("\n3 - O professor é um garoto de programa");
			break;
		case 4:
			System.out.println("\n4 - vocês são muito educados");
			break;
			
			default:
				System.out.println("\nOpção Inválida");
		}

	}

}
