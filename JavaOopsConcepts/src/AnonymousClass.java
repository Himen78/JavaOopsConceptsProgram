class declareAnonymous
{
	public void displayMethod()
	{
		System.out.println("This is inside method of class");
	}

}

public class AnonymousClass {

	public static void main(String[] args) {
		
		declareAnonymous obj = new declareAnonymous()
				{
			       public void displayMethod()
			       {
			    	   System.out.println("This is anonymous method, It's created without any class.");
			       }
				};
				obj.displayMethod();

	}

}
