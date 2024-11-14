package OlaMundo;

import java.util.Scanner;

public class ExerIf_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3, n4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		n1 = leia.nextInt();
		System.out.println("Entre com o segundo número:");
		n2 = leia.nextInt();
		System.out.println("Entre com o terceiro número:");
		n3 = leia.nextInt();
		System.out.println("Entre com o quarto número:");
		n4 = leia.nextInt();
		
		n1 = (int) Math.pow(n1, 2);
		n2 = (int) Math.pow(n2, 2);
		n3 = (int) Math.pow(n3, 2);
		n4 = (int) Math.pow(n4, 2);
		
		if(n3 >= 1000) {
			System.out.println("O valor do seu terceiro número foi de "+ n3);
		}
		
		
		
		else {
			System.out.println("O resultado dos seus números foi o seguinte:");
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);
		}
		
		

	}

}
