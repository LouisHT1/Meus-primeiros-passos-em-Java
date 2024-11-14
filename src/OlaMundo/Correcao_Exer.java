package OlaMundo;

import java.util.Scanner;

public class Correcao_Exer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, resultado=0;
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um primeiro número:");
		n1 = leia.nextFloat();
		System.out.println("Digite um segundo número:");
		n2 = leia.nextFloat();
		
		System.out.println("\n\t\tCalculadora");
		System.out.println("\n1-Soma");
		System.out.println("\n2-Subtração");
		System.out.println("\n3-Multiplicação");
		System.out.println("\n4-Divisão");
		System.out.println("\nDigite a operação que deseja executar:");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			resultado = n1 + n2;
			break;
		case 2:
			resultado = n1 - n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4:
			if(n2 == 0) {
				System.out.println("\nNão pode dividir número por zero");
			}else {
				resultado = n1 / n2;
			}
			break;
			default:
				System.out.println("\nOpção inválida!!!");
		}
		
		System.out.println("\nResultado da operação: "+resultado);
		
}
}
