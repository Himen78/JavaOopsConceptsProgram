
public class VariableExanples {

	public static void main(String[] args) {
		
		int num = 50_00_00_000; // 4 byte -> 32 Bits 
		//num = 8;
		System.out.println(num);
		
		long l = 500000000000l; // 8 bytes
		int i = 5; // 4 byte
		short s = 5; // 2 byte
		float f = 5.5f;
		double d = 5.5;
		
		char c = 'A';
		c = 66; // Ascii
		
		System.out.println(c);
		
		double d1 = 5; // implicit conversion
		int k = (int)5.6; // Type casting
		System.out.println(k);
		
		

	}

}
