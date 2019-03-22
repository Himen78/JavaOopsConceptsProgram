
// Is-A, Has-A relationship


class Calculator{
	
public void sum(int i, int j)
{
	System.out.println(i + j);
}

}

class AdvCal extends Calculator
{
	public void sub(int i, int j)
	{
		System.out.println(i - j);
	}
	
}


public class SingleInheritance {

	public static void main(String[] args) {
		
		AdvCal obj = new AdvCal();
		
		obj.sum(8, 9);
		obj.sub(5, 7);
		
		
		

	}

}
