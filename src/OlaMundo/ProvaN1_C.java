package OlaMundo;

import java.util.Scanner;

public class ProvaN1_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codP, qtd, valorT, nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva o código do produto:");
		System.out.println("\n(1)-Cachorro quente");
		System.out.println("\n(2)-X Salada");
		System.out.println("\n(3)-X Bacon");
		System.out.println("\n(4)-Bauru");
		System.out.println("\n(5)-Refrigerante");
		System.out.println("\n(6)-Suco de Laranja");
		codP = leia.nextInt();
		System.out.println("\nEscreva a quantidade:");
		qtd = leia.nextInt();
		
		if (codP == 1) {
			valorT = 10 * qtd;
			System.out.println("\nProduto: Cachorro Quente");
			System.out.println("\nValor Total:R$ "+valorT+" Reais");
		}
		
		else if  (codP == 2) {
			valorT = 15 * qtd;
			System.out.println("\nProduto: X-Salada");
			System.out.println("\nValor Total:R$ "+valorT+" Reais");
		}
		
		else if (codP == 3) {
			valorT = 18 * qtd;
			System.out.println("\nProduto: X-Bacon");
			System.out.println("\nValor Total:R$ "+valorT+" Reais");
		}
		
		else if (codP == 4) {
			valorT = 12 * qtd;
			System.out.println("\nProduto: Bauru");
			System.out.println("\nValor Total:R$ "+valorT+" Reais");
		}
		
		else if (codP == 5) {
			valorT = 8 * qtd;
			System.out.println("\nProduto: Refrigerante");
			System.out.println("\nValor Total:R$ "+valorT+" Reais");
		}
		
		else if(codP == 6) {
			valorT = 13 * qtd;
			System.out.println("\nProduto: Suco de Laranja");
			System.out.println("\nValor Total:R$ "+valorT+" Reais");
		}
		
		else {
			System.out.println("Escreva um código de 1 a 6");
		}
		
		
			
		}
		
		
		

	}


