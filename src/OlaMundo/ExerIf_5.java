package OlaMundo;

import java.util.Scanner;

public class ExerIf_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base, altura;
		float area;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de altura do triângulo:");
		altura = leia.nextInt();
		System.out.println("Entre com o valor da base do triângulo:");
		base = leia.nextInt();
		
		if(base > 0 && altura > 0) {
			area = (altura*base)/2;
			System.out.println("A sua área do triângulo foi de "+area);
		}
		
		else {
			System.out.println("Um dos valores inseridos é negativo");
		}

	}

}
