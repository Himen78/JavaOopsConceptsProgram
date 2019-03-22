class Casio
{
	
	public void sum(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public void sum(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	
	public void sum(double i, double j)
	{
		System.out.println(i+j);
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		
		Casio obj = new Casio();
		obj.sum(3, 5);
		obj.sum(5, 5, 5);
		obj.sum(5.7, 6.8);
		

	}

}
