package basics;

public class Weather {
	public static void main (String[] args) {
		// suggestions of clothing based on weather 
		
		int temperature = 65; 
		
		String sunCondition = "Overcast";
		
		if(temperature > 80) {
			System.out.println("Wear a t-shirt");
		} else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("Wear a long-sleeve shirt and jeans");
			System.out.println("Wear a hat");

		} else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day. ");
			System.out.println("Wear a sweater");			
		} else {
			System.out.println("Looks like a cold day. Bring a sweater");
		}
		
		System.out.println("Program is ending");
	}

}
