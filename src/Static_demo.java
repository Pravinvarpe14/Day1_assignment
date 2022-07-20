
public class Static_demo {

	/**
	 * defining static variables
	 */
	static int a = 10;
	static long b = 20;

	/**
	 * 
	 * defining static method
	 */
	static void display() {
		System.out.println("Static method");
	}

	/**
	 * 
	 * static block
	 */
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		display();

	}


	}


