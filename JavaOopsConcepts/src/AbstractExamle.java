abstract class Human
{
	
	public abstract void walk(); // Abstract method have no body.
	
	public void talk()
	{
		System.out.println("Every human can talking.");
	}
	
}

class Man extends Human // Concrete class // Number = Int, Float, double, etc.
{
	public void walk()
	{
		System.out.println("Every human can walking.");
	}
}


public class AbstractExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Human obj = new Man();
		obj.walk();
		obj.talk();
		

	}

}
