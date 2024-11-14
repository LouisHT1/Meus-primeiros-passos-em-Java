package Bimestre_2;

public class exer_10For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,i=0;
		
		for(x=1;x<=100;x++) {
			if(x % 2 == 0 && x % 3 == 0 && x % 5 == 0) {
				System.out.println(x);
				i ++;
			}
			
			
		}
		System.out.println("A quantidade de números múltiplos: "+i);

	}

}
