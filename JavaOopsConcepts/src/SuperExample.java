class superEx{
	
	public superEx()
	{
		System.out.println("SuperEx Super Class");
	}
	
	public superEx(int i)
	{
		System.out.println("This is Parent class");
	}
	
}

class superBase extends superEx
{
	public superBase()
	{
		super();
		System.out.println("superBase Base class");
	}
	
	public superBase(int i)
	{
		super(i);
		System.out.println("This is Base class");
	}
}


public class SuperExample {

	public static void main(String[] args) {
		
		superBase obj = new superBase(8);
	

	}

}
