package oop;

public class BankAccount implements IRate {
	
	String accountNumber;
	// static belongs to class not object instance
	// final >> constant often static final 
	private static final String routineNumber = "016265465";
	
	private String ssn;
	private String name;
	
	String accountType;
 
	
	double balance = 0; 
	
	
	//Polymorphism through overloading 
	BankAccount(){
		System.out.println("New account created" );
	}
	
	BankAccount(String accountType){
		System.out.println("New Account Created: " + accountType );
	}
	
	BankAccount(String accountType, double initDeposit)
	{
		System.out.println("New Account: " + accountType );
		System.out.println( "Iniotial Deposit: "  + initDeposit);
		
		System.out.println();
		
		if (initDeposit < 1000) {
			String errorMsg = "Error minimum deposit is $1000";
			System.out.println(errorMsg);	
		} else {
			String realMSG = ("Thanks for you deposit of " + initDeposit);
			System.out.println(realMSG);	
			
		}
		
		balance = initDeposit; 
		
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	
	void deposit(double amount) {
		balance = balance + amount;
		
		showActivity("Deposit");
	}
	
	void withdrawl() {
		
	}
	
	void getStatus() {
		
	}
	
	private void showActivity(String activity ) {
		System.out.println("You recent transaction: " + activity);
		System.out.println("Your New Balance: " + balance);
		
	}
	
	
	
	@Override
	public String toString() {
		return "[ " + name +  accountNumber + " Balance $" + balance + " ] ";
	}

	
	//getters and setters
	// allow the user to define the name
	
	
	public void setName(String name) {
		this.name = "Mr." +name ;
	}
	
	public String getName() {
		return name; 
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	//Interface methods
	
	public void setRate() {
		
		System.out.println("Setting Rate");
		
	}
	
	public void increaseRate() {
		System.out.println("Increase Rate");
		
	}
	

	
	
	
}
