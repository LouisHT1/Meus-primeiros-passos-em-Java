package Bimestre_2;

public class exer_8For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,conj=0;
		
		for(x=1;x<=500;x++) {
			if(x % 3 == 0 && x % 2 == 1) {
				conj += x;
				System.out.println(conj);
			}
		}
		
		

	}

}
