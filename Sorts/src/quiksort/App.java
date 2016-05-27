package quiksort;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int Arraylength = sc.nextInt();
		int [] arrasort = new int[Arraylength];
		System.out.println("Please enter:"+Arraylength + "elements");
		for(int i =0; i<Arraylength; i++){
			
			arrasort[i]=sc.nextInt();
		}
		
		int max = arrasort.length-1;
		int min =0;
		System.out.println(max);
		
		
		quiksortImpl quk = new quiksortImpl();
		quk.quiksortalog(arrasort, min, max);
	
		sc.close();
	}

}
