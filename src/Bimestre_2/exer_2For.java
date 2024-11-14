package Bimestre_2;

import java.util.Scanner;

public class exer_2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fil,x,somaFil=0,salC=0;
		float sal,somaSal=0,mSal,mFil,contador=0,p=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<=2;x++) {
			System.out.println("Entrevistado");
			System.out.println("\nQual o seu número de filhos: ");
			fil = leia.nextInt();
			System.out.println("\nQual o seu salario: ");
			sal = leia.nextFloat();
			
			somaFil += fil;
			somaSal += sal;
				
			if(contador < sal) {
				contador = sal;
			}
			
			if(sal <= 100) {
				salC++;
			}
			
			
		}
		mFil = somaFil/x;
		mSal = somaSal/x;
		p = (salC*100)/x;
		
		System.out.println("\nA média de filhos da região: "+mFil);
		System.out.println("\nA média do salario da região: R$ "+mSal+" reais");
		System.out.println("\nO maior salario foi de R$ "+contador+" reais");
		System.out.printf("\nO porcentual de pessoas com salario minimo: %.2f porcento",p);
		

	}

}
