package OlaMundo;

import java.util.Scanner;

public class ExerIf_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ip;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Me fale o indíce de poluição(IP):");
		ip = leia.nextInt();
		
		if (ip >= 35 && ip < 50) {
			System.out.println("Atenção!!!");
		}
		
		else if(ip < 35) {
			System.out.println("Bom.");
		}
		
		else if(ip >= 51 && ip < 75) {
			System.out.println("Perigoso!!");
		}
		
		else if(ip >= 75 && ip <= 100) {
			System.out.println("EMERGÊNCIA !!!!");
		}

	}

}
