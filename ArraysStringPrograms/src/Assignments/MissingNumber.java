package Assignments;

public class MissingNumber {

	public static void main(String[] args) {
		int n = 8;
		int[] a = {1, 4, 5, 2, 6, 7, 8};
		int sumOfNumb =  sumOfNumb(n);
		int sumOfElemts = sumOfElemts(a);
		int missingNumber = sumOfNumb - sumOfElemts ; 
		System.out.println("the missing number is = " + missingNumber);
	}
static int sumOfNumb(int n)
{
int sum = (n*(n+1))/2;
return sum;
}

static int sumOfElemts(int[] array){
	int sum = 0;
	for(int i = 0; i < array.length; i++){
		sum = sum + array[i];
	}
	return sum ;
}

}


