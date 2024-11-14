package Bimestre_2;

import java.util.Scanner;

public class exer_12For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,nf,nt=0,mt,maior=0,menor=0;
		int matr,freq,x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=2;x++) {
			System.out.println("\nQual o seu código de matricula:");
			matr = leia.nextInt();
			System.out.println("\nEntre com a sua primeira nota:");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a sua segunda nota:");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a sua terceira nota:");
			n3 = leia.nextFloat();
			System.out.println("\nQuantas aulas você participou:");
			freq = leia.nextInt();
			nf = (n1+n2+n3)/3;
			nt += nf;
			if(maior < nf) {
				maior = nf;
			}
			if(menor > nf) {
				menor = nf;
			}
			
			
			System.out.println("\nA sua matricula é "+matr);
			System.out.println("\nSua primeira nota: "+n1);
			System.out.println("\nSua segunda nota: "+n2);
			System.out.println("\nSua terceira nota: "+n3);
			System.out.println("\nSua nota final: "+nf);
			System.out.println("\nSua frequência: "+freq+"%");
			if(nf >= 6.0 && freq >= 40) {
				System.out.println("APROVADO!!");
				}
			else if(nf < 6.0 && freq < 40) {
				System.out.println("REPROVADO!!");
			}
			}
		
		mt = nt/x;
		System.out.println("\nA menor nota: "+menor);
		System.out.println("\nA maior nota: "+maior);
		System.out.println("\nA média da turma: "+mt);
		
			
		}

	}


