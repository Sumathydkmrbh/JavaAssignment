package Assignments;

public class LargestNoArray {

	public static void main(String[] args) {

		int[] array =  {70, 90, 800, 67,500,30,40};
		int temp =array[0] ;
		for(int i=1; i<array.length; i++)
		{
		if(temp< array[i]){
			temp=array[i];
		}
				
	}

System.out.println("the largest number  = " + temp);
}
}
