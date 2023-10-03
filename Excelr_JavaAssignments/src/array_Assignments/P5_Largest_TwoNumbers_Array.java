package array_Assignments;

public class P5_Largest_TwoNumbers_Array {

	public static void main(String[] args) {
		
	
	int [] arr = {14,12,92,15,11,91} ;
	
	int FirstLargestNum = 0 ;
	
	int SecondLargestNum = 0 ;
	
	for (int i = 0 ; i<arr.length ; i++)
		
		
	{
		if (FirstLargestNum < arr[i])
		{
			SecondLargestNum = FirstLargestNum ; // assign first largest num to second
			FirstLargestNum = arr[i] ;           // assign array element to first largest num 
		}
		
		else if(SecondLargestNum < arr[i])
		{
			SecondLargestNum = arr[i] ;      //assign array element to second largest num 
		}
	}
	
	System.out.println ("First Largest Number in Array is:" +FirstLargestNum ) ;
	
	System.out.println ("Second Largest Number in Array is:" +SecondLargestNum ) ;
	
	}
	}