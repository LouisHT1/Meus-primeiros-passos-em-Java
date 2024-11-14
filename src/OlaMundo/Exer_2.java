package OlaMundo;

import java.util.Scanner;

class Exer_2 {
	
	public static void main(String[] args) {
		
		int a,b,c,r,s;
		float d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A:");
		a = leia.nextInt();
		System.out.print("\nEntre com o valor de B:");
		b = leia.nextInt();
		System.out.println("\nEntre com o valor de C:");
		c = leia.nextInt();
		
		// r = (int) Math.pow((a+b), 2);		// Forma mais organizada
		// s = (int) Math.pow((b + c), 2);
		
		//d = (float) (Math.pow((a+b),2)+Math.pow((b+c),2)/2);	// Forma mais compacta
		
		System.out.println("O valor de D foi de: "+ d);
	}

}
