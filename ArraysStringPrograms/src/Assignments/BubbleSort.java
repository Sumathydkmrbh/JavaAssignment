package Assignments;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {9,8,7,5,4,6,3};
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


