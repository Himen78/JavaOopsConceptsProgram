
public class ConstructorEx {
	
	
	int sum1;
	int sum2;
	int result;
	float calculation;
	float cal1, cal2;
	
	public ConstructorEx() //  Default constructor
	{
		sum1 = 5;
		sum2 = 5;
	}
	
	public ConstructorEx(int x, int y) // Parameterized  Constructor
	{
		sum1 = x;
		sum2 = y;
		result = x + y;
	}
	
	public ConstructorEx(float a, float b)
	{
		
		cal1 = a;
		cal2 = b;
		calculation = a + b;
	}
	

	public static void main(String[] args) {
		
     ConstructorEx obj = new ConstructorEx(50,50);
     
     System.out.println(obj.sum1);
     System.out.println(obj.sum2);
     System.out.println("Result of two sum :"+ obj.result);
     
     ConstructorEx obj1 = new ConstructorEx(50.8f ,50.9f);
     
     System.out.println(obj1.cal1);
     System.out.println(obj1.cal2);
     System.out.println("Result of two sum :"+ obj1.calculation);
     
     
     	
	}

}
