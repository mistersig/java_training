package oop;

public class AccountApp {

	public static void main(String[] args) {
		
		LoanAccount la =  new LoanAccount(); 
		
		la.increaseRate();
		la.setRate();
		
		la.setAmortSchedule();
		la.setTerm(20);
		
		//Polymorphism changes where we are pointing
		// creating a variable on the interface but is pointing to the load account 
		IRate account1 = new LoanAccount();
		
		account1.increaseRate();
		account1.setRate();
		

	}

}
