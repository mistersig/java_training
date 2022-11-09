package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is Starting");
		
		printName();
		int numA = 10;
		int numB = 20;
		
		addNumbers(numA, numB);
		int product = multipleNumbers(numA, numB);
		
		System.out.println("the product of the numbers is " + product );
		
	}
	
	static void printName() {
		System.out.println("My name is ");
	}
	
	static void addNumbers(int numberA, int numberB ) {
		int sum = numberA + numberB ; 
		System.out.println("The sum is " + sum);
	}

	static int multipleNumbers(int valueA, int valueB ) {
		int product = valueA * valueB ;
		return product; 
	}

}
