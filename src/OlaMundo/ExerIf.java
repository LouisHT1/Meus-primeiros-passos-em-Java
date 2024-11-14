package OlaMundo;

import java.util.Scanner;

public class ExerIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c,n,e;
		float s,se = 0,t;
		
		Scanner leia = new Scanner(System.in);
		
		/* 10 reais hora trabalhada.
		 20 reais hora trabalhada excedente*/
		
		System.out.println("Informe o seu código de cadastro:");
		c = leia.nextInt();
		System.out.println("Informe seu número de horas trabalhadas:");
		n = leia.nextInt();
		
		e = n - 50;
		
		s = n*10;
		
		System.out.println("Seu código é "+c);
		
		
		if(e >= 1 ) {
			se = e * 20;
			t = s + se;
			System.out.printf("\nO salário liquído será de R$ %.2f reais", s);
			System.out.printf("\nJá seu excedente será de R$ %.2f reais", se);
			System.out.printf("\nO salário total será de R$ %.2f reais", t);
			
		}
		
		else {
			System.out.printf("\\nO salário total será de R$ %.2f reais", s);
		}
		
		

	}

}
