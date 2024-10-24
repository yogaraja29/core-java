package oop;

class Cube {
	int length; 
	int breadth;
	int height;
	
	// Constructor
	Cube(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
	}
	// Constructor Overloading
	Cube(){ // No param
		length = -1;
		breadth = -1;
		height = -1;
	}
	Cube(int l){ // One param
		length = l;
		breadth = l;
		height = l;
	}
}

public class MethodOverloading {
	/* Java Method Overloading
	 * - We can create multiple methods with the same name in a class, but with different parameter lists. 
	 * - These methods perform similar functions but differ by the type, number, or order of parameters.
	 * */

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static int max(int a, int b, int c) {
		return a > b ? a : b > c ? b : c;
	}

	// overloading max method for different parameter type
	static double max(double a, double b) {
		return a > b ? a : b;
	}

	static char max(char a, char b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		// for integer
		System.out.println(max(5, 9));
		System.out.println(max(5, 9, 20));
		// for double
		System.out.println(max(5.5, 9.9));
		// calls double method(returns value in double) by default when no speific
		// method for char
		System.out.println(max('y', 'd'));
		
		
		// Class constructor overloading
		Cube c1 = new Cube();
		System.out.println(c1.length);
		Cube c2 = new Cube(1,2,3);
		System.out.println(c2.height);
		Cube c3 = new Cube(5);
		System.out.println(c3.breadth);

	}

}
