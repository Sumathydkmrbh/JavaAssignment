package Assignments;

public class CommonArray {

	public static void main(String[] args) {
		int [] array1 = {1,2,3,4,5,6};
		int[] array2 = {5,6,7,8,9};
		for (int i=0; i<array1.length; i++){
			for(int j=0; j<array2.length; j++){
				if(array1[i]==array2[j]){
					System.out.println(array1[i]);
				}
		}
		}
	
	}

	}


