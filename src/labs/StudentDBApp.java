package labs;

public class StudentDBApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDB student1 = new StudentDB("James", "6545645645");
//		student1.setName("John");
		
		System.out.println(student1.getName());

	}
}
	
	class StudentDB {
		
		private static String SSN;
		private static String name;
		private static int id = 1000;
		private String studentID ;
		
		private String phone;
		private String city;
		private String state;
		

		public StudentDB(String name, String SSN) {
			this.name = name;
			this.SSN = SSN;
			id++;
			
			createEmail(name); 
						
			
		}
		
		public void createEmail(String name) {
			String emailEnd = "@seti_university.edu";
			String studentEmail = name + emailEnd;
			
			System.out.println("Your email is: " + studentEmail);
			
//			return studentEmail; 
			
		}
		
		private void setStudentID(){
			int random = (int)(Math.random() * 100);
			studentID = id + "" + random + SSN.substring(0,2);
			
		}
		
		
		
		public void enroll() {
			
		}
		
		public void checkBalance() {
			
		}

		public void ShowCourses() {
			
		}
		
		@Override
		public String toString() {
			return "Name" + name;
//			return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[ Balance: " + balance  +"]\n";
		}
		
		
		public static String getName() {
			return name;
		}

		public static void setName(String name) {
			StudentDB.name = name;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		
		
		
	}


