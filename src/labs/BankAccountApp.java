package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAccount acc1 = new BankAccount("465329874", 1000.50);
		BankAccount acc2 = new BankAccount("546546546", 20000);
		BankAccount acc3 = new BankAccount("369419498", 10000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(500);
		acc1.makeDeposit(500);
		acc1.accrue();
		acc1.toString();
		System.out.println(acc1.toString());

		

	}

}

class BankAccount implements IInterest {
	//properties of bank account
	//encapsulation, make sure client doesn't have access to variable
	
	private static int id = 1000; // static makes it stay with the class not the object | Internal ID
	private String accountNumber; // ID + random 2-digit + first 2 of ssn 
	private static final String routingNumber = "005400657"; // final is a constant within java
	private String name; 
	private String SSN; 
	private double balance;
	
	//Constructor
	
	public BankAccount(String SSN, double initDeposit) {
		System.out.println("New Account Created");
		balance = initDeposit;
		
		this.SSN = SSN;
		id++;
		setAccountNumber();
	}
	
	
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
//		System.out.println("Random:  " + random);
		accountNumber = id + "" + random + SSN.substring(0,2);
		
		System.out.println("Your Account Number: " + accountNumber);
		
	}
	
	
	
	public void setName (String name ) {
		this.name  = name; 
	}
	
	public String getName() {
		return name; 
	}
	
	
	public void payBill(Double amount) {
		balance = balance - amount;
		System.out.println("Paying Bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making Deposit: " + amount);
		showBalance();
		
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue() {
		
		balance = balance * (1+ rate / 100);
		
		showBalance();
		
	}
	
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[ Balance: " + balance  +"]\n";
	}
}	





