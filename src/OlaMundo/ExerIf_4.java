package OlaMundo;

import java.util.Scanner;

public class ExerIf_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* A variação é entre 0,05 a 0,25
		 * grupo 1 - alerta no 0,3 e acima
		 * grupo 2 - alerta 0,4 e acima
		 * todos os grupos - acima 0,5
		 * 
		 * */
		
		float nivel;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o nível de poluição atualmente?");
		nivel = leia.nextFloat();
		
		if (nivel >= 0.05 && nivel <= 0.25) {
			System.out.println("\nGrupos liberados...");
		}
		
		else if(nivel >= 0.25 && nivel <=0.3) {
			System.out.println("\nNotificar empresas do 1°grupo");
		}
		
		else if(nivel >= 0.3 && nivel <= 0.4) {
			System.out.println("\nNotificar empresas do 1° e 2° grupo");
		}
		
		else if(nivel > 0.5) {
			System.out.println("\nNotificar empresas do 1° e 2° e 3° grupo");
		}
		
		
		
		
	

	}

}
