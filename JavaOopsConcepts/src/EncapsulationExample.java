class EmployeeDeatils
{
	private int id;
	private String name;
	private String role;
	
	
	// For access private variable, we need to declare setter & getter method.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}


public class EncapsulationExample {

	public static void main(String[] args) {
		

		EmployeeDeatils obj = new EmployeeDeatils();
		obj.setId(456);
		obj.setName("Mr. Damion Write");
		obj.setRole("Softare Engineer Development in Test");
		
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getRole());
	}

}
