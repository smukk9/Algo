package quiksort;

public class quiksortImpl {

	
	
	public void quiksortalog(int ele [],int lowerIndex, int higherIndex){
		
		int min = lowerIndex;
		int max = higherIndex;
		int pivot =(min+max)/2;
		
		while(min<=max){
			
			if(ele[pivot]< ele[min]){
				
				int temp =0;
				temp = ele[max];
				ele[max] = ele[min];
				ele[min] = temp;
				min++;
				max--;	
			}else{
				
				min++;
			}
			System.out.println("max:"+max +"\n"+"min:"+ min);
			showarray(ele);
			
			
		}
		
		System.out.println("max:"+max +"\n"+"min:"+ min);
		
		System.out.println("************************");
		if(lowerIndex < max	){
			
			quiksortalog( ele, lowerIndex,max);
			
		}else if(higherIndex > min)
		quiksortalog(ele, min, higherIndex);
		
		
		
		
	}

	private void showarray(int[] ele) {
		// TODO Auto-generated method stub
		
		for(int a: ele){
			
			System.out.print("->"+a);
		}
		System.out.println();
	}
}
