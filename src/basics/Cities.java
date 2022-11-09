package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cities = {"New York","San Francisco","Miami","Dallas"};
		
		System.out.println(cities[1]);
				
		
		String[] countries = new String[3];
		
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";

		System.out.println(countries[0] );
		System.out.println("*********************************");
		
		
		
		//STATES
		String[] states = new String[5];
		
		states[0] = "California";
		states[1] = "Illinios";
		states[2] = "Ohio";
		states[3] = "Wisconsin";
		states[4] = "Michigan";
		
		 int i = 0; 
		 // do loop: enters the loop then test conditions 
		 do {
			 
//			 System.out.println(states[i]);
			 
			 System.out.println("States in DO loop " +  states[i]);
			 i = i + 1; 
			 } while ( i < 5 ) ;
		
		 System.out.println("*********************************");
		 
	     // while loop: test conditions first then enters loop
		 
		 int n = 0; 
		 boolean statefound = false; 
		 
		 while(n <= 4 ) {
			 String state = states[n];
			 if (state == "Ohio") {

				 System.out.println("State found!!");
				 
				 statefound = true;
			 }
			 System.out.println("States in while loop " +  states[n]);
//			 System.out.println("States in while loop " +  states[n]);
			 n++; 
			 
		 }
		 
		 System.out.println("*********************************");
		 // For Loop: best structure for iterating through an array
		 
		 for (int x = 0; x < 5; x++ ) {
			 System.out.println("States in For Loop " +  states[x]);
		 }
			 
			 
			 
		
	}

}
