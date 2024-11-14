package OlaMundo;

import java.util.Scanner;

public class ExerIf_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cod, numdeH, e;
		float salH, salM;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o seu código de empregado?");
		cod = leia.nextInt();
		System.out.println("Quantas horas você trabalhou?");
		numdeH = leia.nextInt();
		System.out.println("O valor da hora trabalhada:");
		salH = leia.nextFloat();
		
		
		if (numdeH > 40) {
			e = numdeH - 40;
			salM = (float) (40 * salH + ((salH * 1.5)* e));
			
			System.out.println("\nSeu código de funcionário é "+cod);
			System.out.printf("\nSeu salário do mês com o acréscimo foi de R$ %.2f Reais", salM);
			System.out.println("\nQuantidade de horas extras:"+ e);
			
		}
		
		else {
			e = 0;
			salM = salH * numdeH;
			System.out.println("Seu código de funcionário é "+cod);
			System.out.printf("Seu salário do mês foi de R$ %.2f Reais", salM);
			System.out.println("Quantidade de horas extras:"+ e);
		}
		
		
		

	}

}
