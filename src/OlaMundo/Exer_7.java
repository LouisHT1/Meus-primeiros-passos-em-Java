package OlaMundo;

import java.util.Scanner;

public class Exer_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float conCarro, custoF, porD, imp;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o valor inicial do carro:");
		custoF = leia.nextFloat();
		
		
		porD = (custoF * 28) / 100;
		imp = (custoF * 45) / 100;
		
		conCarro = custoF + porD + imp;
		
		System.out.printf("O custo final do carro será de : %.2f",conCarro);
		
		
		
		
		

	}

}
