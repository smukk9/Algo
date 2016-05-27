package BubbleSort;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int Arraylength = sc.nextInt();
		int [] arrasort = new int[Arraylength];
		System.out.println("Please enter:"+Arraylength + "elements");
		for(int i =0; i<Arraylength; i++){
			
			arrasort[i]=sc.nextInt();
		}
		
		bubblesortImpl bub  = new bubblesortImpl();
		bub.bubbleimpl(arrasort);
		sc.close();
	}
}