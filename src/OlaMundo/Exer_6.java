package OlaMundo;

import java.util.Scanner;

public class Exer_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float seg, min, hr,segT;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o total de segundos:");
		segT = leia.nextFloat();
		
		min = (segT%3600)/60;
		hr = segT/3600;
		seg = (segT%3600)%60;
		
		System.out.printf("\nO evento durou %.0f : %.0f : %.0f",hr, min, seg);
		

	}

}
