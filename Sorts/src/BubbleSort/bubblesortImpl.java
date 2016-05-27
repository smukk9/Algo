package BubbleSort;

public class bubblesortImpl {

	

	public void bubbleimpl(int[] arrasort) {
		// TODO Auto-generated method stub
		
		int a[] = arrasort;
		boolean swaped = true;
		
		while (swaped){
			
			swaped = false;
			for(int i =0; i< a.length-1; i++){
				
				
				if(a[i]>a[i+1]){
					
					int temp = a[i];
					a[i] =a[i+1];
					a[i+1] = temp;
					swaped = true;
				}
				showarray(a);
			}
			System.out.println("******************");
		}
		
		
		
		
			
	}
	private void showarray(int[] ele) {
		// TODO Auto-generated method stub
		
		for(int a: ele){
			
			System.out.print("->"+a);
		}
		System.out.println();
	}
}
