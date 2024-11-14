package OlaMundo;

import java.util.Scanner;

public class Exer_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalDias,anos,meses,dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nMe dê o total de dias:");
		totalDias = leia.nextInt();
		
		anos = totalDias/365;
		meses = (totalDias%365)/30;
		dias = (totalDias%365)%30;
		
		System.out.println("\nO total de Anos: "+anos);
		System.out.println("\nO total de Meses: "+meses);
		System.out.println("\nO total de Dias: "+dias);
		

	}

}
