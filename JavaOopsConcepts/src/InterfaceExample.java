interface calculator
{
	void sum();
	void sub();
	void mul();
}

class mainBody implements calculator
{
	public void sum()
	{
		System.out.println("This is a sum method");
		// return i + j ;
	}
	
	public void sub()
	{
		System.out.println("This is a sub method");
		// return x - z;
	}
	
	public void mul()
	{
		System.out.println("This is a mul method");
		// return a * b;
	}
	
}


public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	calculator obj = new mainBody();
	obj.mul();
	obj.sub();
	obj.sum();
	

	}

}
