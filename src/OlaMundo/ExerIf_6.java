package OlaMundo;

import java.util.Scanner;

public class ExerIf_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		n = leia.nextInt();
		
		if (n > 100) {
			System.out.println("O seu número foi "+n);
		}
		
		else {
			System.out.println("O seu número foi 0");
		}

	}

}
