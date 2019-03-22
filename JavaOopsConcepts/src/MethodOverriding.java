class methodOverride{
	
	public void show()
	{
		System.out.println("Print A");
	}
}

class methodOverrideBas extends methodOverride
{
	@Override
	public void show()
	{
		show();
		System.out.println("Print B");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodOverride obj = new methodOverride();
		obj.show();
		
	}

}
