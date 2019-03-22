
class Calc
{
	int number1;
	int number2;

	
	public Calc(int number1, int number2)
	{
		this.number1 = number1; 
		this.number2 = number2;
	}
	
}


public class ThisKeywordEx
{
	public static void main(String[] args)
	{
		Calc obj = new Calc(5,5);
		
		System.out.println("Result is : "+ obj.number1);
		System.out.println("Result is : "+ obj.number2);
		
	}
}
