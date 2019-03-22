
public class EnhanceLoop {

	public static void main(String[] args) {
		
		
		int a [] = {1, 2, 3, 4};
		
		for(int k : a) // Advance for loop using array.
		{
			System.out.print(" "+k);
		}
		System.out.println();
		
		
		int b[][] =
				
			{
					{1,2,3,4},
					{5,6,7,8},
					{9,0,1,3}
			};
		
		for(int j[] : b) // Advance for loop using array.
		{
			for(int c : j)
			{
				System.out.print(" "+c);
			}
			System.out.println();
		}
		
		
		

	}

}
