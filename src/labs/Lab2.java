package labs;

public class Lab2 {
	
	public static void main(String[] args) {
		// todo 
		
		Student stu1 = new Student("Janelle", "321901256");
		Student stu2 = new Student("THomas", "65415613");
		Student stu3 = new Student("Elizabeth", "98762452");
		
		
		stu1.enroll("Math 151");
		stu1.enroll("Math 230");
		stu1.enroll("Geog 230");
		
		
//		
//		stu1.showCourses();
//		stu1.checkBalance();
//		
//		stu1.payTuition(600);
//		stu1.checkBalance();
		
//		stu1.toString();
		
		System.out.println( stu1.toString() );
	}
	
	

}



class Student {
	private static int iD = 10;
	private String userId; 
	private String name; 
	private String ssn; 
	private String email; 
	
	private String phone; 
	private String city; 
	private String state; 
	
	private static final int costOfCourse = 800;
	
	private int balance; 
	
	
	private String courses = "";
	
	public Student(String name, String ssn) {
		iD++; 
		this.name = name; 
		this.ssn = ssn; 
		setUserID();

		setEmail();
		
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "."+ iD + "@sdetuniversity.com";
//		System.out.println("Your email: " + email);
	}
	
	public String getEmail() {
		return email; 
	}
	
	
	private void setUserID() {
		int max = 9000;
		int min = 1000; 
		
		int randNum = (int) (Math.random()  * (max - min)  );
		
		randNum = randNum + min;
//		System.out.println( randNum );
		
		userId = iD + "" +  randNum + ssn.substring(5);
		
//		System.out.println( "Your User ID: " + userId );

		
	}
	
	public void enroll( String course) {
		
		this.courses = this.courses + "\n " + course; 
//		System.out.println( "You enrolled in : " + courses );
		
		balance = balance + costOfCourse; 
		
	}
	public void payTuition( int amount ) {
		balance = balance - amount;
		
		System.out.println( "Payment Amount: $" + amount);
	}
	
	public void checkBalance() {
		
		System.out.println( "Balance: $" + balance );
		
	}
	
	
	public void showCourses() {
		System.out.println(courses );
	}
	
//	@Override
	public String toString() {
		return "[Name: " + name + "\n Courses: " + courses +  "]\n Balance: " + balance + " ]";
//	System.out.println();
		
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
	
	
	
//	
	
}




