package basics;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("**********************************************");
		
		System.out.println( sum(4) );
		System.out.println("**********************************************");
		System.out.println( "Factoral " + fact(5) );
		
		System.out.println("**********************************************");
		
		int[] numbers = {-5, 4, 20, 300, 75, -15};
		
		System.out.println( "Min: " + findMin(numbers) );
		System.out.println( "Max: " + findMax(numbers) );
		System.out.println("Average " + findAvg(numbers) );
		System.out.println("Average 2nd Function: " + findAvg2(numbers) );

	}
	
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		
		// for loop. 
		// start at 0 
		// loops through the entire length of the array as long as less than is true
		// increments +1 at the end of loop
		for( int i = 0; i < arr.length; i ++) {
			// using the i or increment 
			// loop through arround and check if the position is less than min
			if (arr[i] < min) {
				// min assigned here where it's check every item in the array only replacing when it finds
				// a position less than the one it checks. 
				min = arr[i];
			}
		}
		
		return min; 
		
	}
	
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		
		for (int n =0; n < arr.length; n ++) {
			if (arr[n] > max) {
				max = arr[n];
			}
		}
		
		return max; 
		
	}
	
	// not a good way to add 
	public static int findAvg(int[] arr) {
		// take sum, divide by number of elements
		 int avg = 0;
		 
		 for (int c = 0; c < arr.length; c++) {
			 
			 avg += arr[c];
			 System.out.println( "For loop  " + avg );
		 }
		 
		return avg / arr.length; 
	}
	
	
	public static int findAvg2(int[] arr) {
		// take sum, divide by number of elements
		 int avg = 0;
		 
		 for (int c = 0; c < arr.length; c++) {
			 
			 avg = avg +  arr[c];
			 System.out.println( "For loop with adding of the avg " + avg );
		 }
		 
		return avg / arr.length; 
	}	
	
	
	public static int sum(int n ) {
		int sum = 0; 
		
		for (int i =1; i <=n; i++) {
			System.out.print( sum + " + " + i  );
			sum = sum + i ;
			System.out.println( " = " + sum  );
		}
		return sum; 
	}
	
	public static int fact( int n) {
		if (n ==0 ) {
			return 1; 
		}
		System.out.println( n  );
		return fact(n-1) * n; 
	}
	
	
	
	

}
