package cast;

public class Casting {

	public static void main(String[] args) {
		int x = 459;  
		//automatically converts the integer type into long type  
		long y = x;  
		//automatically converts the long type into float type  
		float z = y;  
		System.out.println("Before conversion, int value "+x);  
		System.out.println("After conversion, long value "+y);  
		System.out.println("After conversion, float value "+z);  
	}

}
