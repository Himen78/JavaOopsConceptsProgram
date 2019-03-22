
class student{
	
	int id;
	String name;
	static String Subjects;
	String emailId;
	
	student(){
		
		id = 8;
		name = "Himen";
		emailId = "himen@gmail.com";
		System.out.println("Run Constructor");
	}
	
	
	static{
		
		System.out.println("Run static subject");
		Subjects = "English" ;
		// Subjects = "Hindi";
		// Subjects = "Computer";
		// Subjects = "Programming C";
	}
	
	
	public void detailsOfStudent() {
		
		System.out.println(id + ":" + name + ":" + emailId + ":" + Subjects);
		// System.out.println(id + ":" + name + ":" + emailId + ":" + Subjects);
	}
	
	
	
}


public class StaticExample {

	public static void main(String[] args) {
	
		student obj1 = new student();
		obj1.detailsOfStudent();
		
		student obj2 = new student();
		obj2.detailsOfStudent();
	}

}
