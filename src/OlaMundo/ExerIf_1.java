package OlaMundo;

import java.util.Scanner;

public class ExerIf_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float p, m , e;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o peso da carga de peixes:");
		p = leia.nextFloat();
		
		e = p - 50;
		m = e * 4;
		
		System.out.println("O seu peso de peixes foi de "+p+" Kg(s)");
		
		if (e > 0) {
			System.out.println("\nSeu excesso foi de "+e+" Kg(s)");
			System.out.printf("\nO valor da sua multa será de R$ %.2f Reais",m);
		}
		
		else {
			e = 0;
			m = 0;
		}
		
		

	}

}
