
class sum {
	
	
	public int calculation(int ... i) // Value take in array. we able to put no of parameters.
	{
	
		int sum1 = 0;
		for(int j : i)
		{
			sum1 = sum1 + j;
		}
		return sum1;
		
		
	}
}

public class VarArgs {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum obj = new sum();
		System.out.println(obj.calculation(11,3,5,6,7,4,3,3,7));
	}

}
