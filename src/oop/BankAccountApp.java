package oop;

public class BankAccountApp  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAccount acc1 = new BankAccount();
		
//		acc1.routingNumber = "09089";
		
		BankAccount acc2 = new BankAccount( "Checking" );
		
		
		BankAccount acc3 = new BankAccount( "Savings account", 5000);
		
		acc3.checkBalance();
		
		
//		System.out.println( acc1.routineNumber);
//		System.out.println( acc2.routineNumber);
		
		
		// Demo for Inheritence 
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.accountType = "CD account";
//		cd1.name = "Juan";
		// with encapsulation : public API methods | all about hiding
		cd1.setName("Juan Rogers");
		cd1.setSsn("15646545646515");
		
		cd1.setRate();
		cd1.increaseRate();
		
		System.out.println( cd1.getName());
		System.out.println("SSN " + cd1.getSsn() );
		
		cd1.accountType = "CD Account";
		
	
		//polymorphism through overriding		
		System.out.println( cd1.toString());
		
		
		cd1.deposit(500);
		cd1.deposit(100);
		cd1.deposit(200);
		
		cd1.withdrawl();
		
		
//		System.out.println( cd1.showActivity());


		
		
		
	}

}

