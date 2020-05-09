// In java 8, we can create normal method in interface class.

interface Car
{
	void sportsStering();
	
	default void jblMusicSystem() // In java 8, we can create a non abstract method also.
	{
		System.out.println("I love Music");
	}
	
	static void powerWindoww()
	{
		System.out.println("I lovee sports car");
	}
}


class marutiSuzuki implements Car
{
	public void sportsStering()
	{
		System.out.println("I love sports stering");
	}
	 
}

public class DefaultInterface {

	public static void main(String[] args) {
		
		Car c = new marutiSuzuki();
		c.sportsStering();
		c.jblMusicSystem();

	Car.powerWindoww();
	
	}

}
