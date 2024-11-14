package OlaMundo;

import java.util.Scanner;

public class Exer_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dias,meses,anos,totalDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a quantidade de anos:");
		anos = leia.nextInt();
		System.out.println("\nEntre com a quantidade de meses:");
		meses = leia.nextInt();
		System.out.println("\nEntre com a quantidade de dias");
		dias = leia.nextInt();
		
		totalDias = anos*365+meses*30+dias;
		
		System.out.println("\nVocê viveu "+totalDias+" de dia(s) até hoje");
		

	}

}
