// We can use final keyword as a class level, variable level & method level.


class mainLogic { // When user keep final keyword in class level then we can't extend class.
	
	//final int detailsOfAccount = 20; // when user keep final keyword before the datatype then this variable is constant.
	
	 int detailsOfAccount;
	
	
	public mainLogic()
	{
		detailsOfAccount = 10;
	}
	
	//public final void deatilsOfCustomer()
	public void deatilsOfCustomer() // Keep the final keyword we can't derive the method in child class.
	{
		System.out.println("Users details Class");
	}
	
}

class deriveLogic extends mainLogic
{
  
	public void deatilsOfCustomer()
	{
		System.out.println("derive users deatils from parent class");
	}
	
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		deriveLogic obj = new deriveLogic();
		obj.deatilsOfCustomer();
		
		
		
		
		
	}

}
