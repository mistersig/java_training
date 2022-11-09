package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordChoice = "Ring";
		
		bookTitle = "The Lord of The Rings";
		
		if (bookTitle.contains("Ring")) {
			System.out.println(" The book title contains the word :" + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println(" The browser is chrome");
		}
		
		String firstName = "Sig";
		String lastName = "Gomez";
		String SSN = "12345678";
		
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,1));
		
		System.out.println(SSN.substring(4));

	}

}
