

class Outer{
	
	int i = 9;
	
	public void show()
	{
		System.out.println("The value of Outer is :"+i);
	}
	
	class Inner{  // Class file name : Outer$Inner.class
		
		int j = 10;
		
		public void display()
		{
			System.out.println("The value of Inner is:"+ j);
		}
	}
		
}

public class OuterDemo {

	public static void main(String[] args) {
	
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj2 = obj.new Inner(); // for run Inner Class
		obj2.display();

	}

}
