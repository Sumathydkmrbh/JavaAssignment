package Assignments;

public class SwapElements {

	public static void main(String[] args) {
		int[] array = {1, 2, 5, 6, 4};
		boolean fixed=false;
		while(fixed==false){ 
			fixed=true;
			for(int i=0; i<array.length-1; i++){
			if (array[i] > array[i+1])
			{
				
				int temp1 = array[i+1];
				array[i+1]= array[i];
				array[i]= temp1;
				fixed=false;
			}
			}
		}
		for(int i=0; i<array.length; i++)
		System.out.println(array[i]);
	
}
}


	


