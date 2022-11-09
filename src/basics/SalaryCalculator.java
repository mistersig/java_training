package basics;

public class SalaryCalculator {
	
	public static void main(String[] args) {
		// compute annual salary 
		// rate + hoursPerWeek + weeklyPerYear
		
		String career; 
		System.out.println("Program is starting");
		
		career = "Software Developer";
		System.out.println("My Career" + career);
		
		int hoursPerWeek = 40; 
		int weeksPerYear = 50; 
		double rate = 42.50; 
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My Salary as a " + career + " at the rate of $" + rate + "per hour is $" + salary + " per year ");
		
	}

}
