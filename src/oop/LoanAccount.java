package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void increaseRate() {
		// 
		System.out.println("Increase Rate");
		
	}
	
	
	public void setTerm( int terms) {
		
		System.out.println("Setting the terms to " + terms + " Years");
	}
	
	public void setAmortSchedule() {
		System.out.println("Amoertization schedule");
	}

}
