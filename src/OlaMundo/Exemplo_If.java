package OlaMundo;

import java.util.Scanner;

public class Exemplo_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float ma, n1, n2, n3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a primeira nota");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota");
		n3 = leia.nextFloat();
		
		ma = (n1+n2+n3)/3;
		
		System.out.printf("\nSua média foi: %.2f",ma);
		
		if (ma >= 7 && ma <= 10) {
			System.out.println("\nAluno Aprovado(a)");
		}
		
		else if (ma >=5 && ma<=6) {
			System.out.println("Aluno no Exame");
		}
		
		else {
			System.out.println("\nAluno Repovado(a)");
		}
		
		
	}
	
}
	

		
	
			
		
			
