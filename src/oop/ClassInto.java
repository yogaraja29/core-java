package oop;

// Wrapping data properties and its manipulation methods inside a class declartion
class Box {
	// class properties
	int length; // instance variables
	int breadth;
	int height;

	/*
	 * Constructor method 
	 * - Special method 
	 * - Same name as the Class 
	 * - Immediately called when the object is created 
	 * - Used for initializing the values 
	 * - No return type
	 */
	Box(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
	}

	// setter method
	/*
	 * void setDimension(int l, int b, int h) { length = l; breadth = b; height = h;
	 * }
	 */

	/* this pointer */
	void setDimension(int length, int breadth, int height) {
		// this is equal to the current object which is invoking this method
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	int getVolume() {
		return length * breadth * height;
	}

	/* Garbage collection */
	protected void finalize() {
		// this method will be invoked by jvm garbage collector just before deallocate
		// the memory.
		// This will work only if garbage collector found any dereferenced values.
		// This method is only accessible for jvm so its protected.
	}

}

public class ClassInto {

	// Method definition(we can call static methods without creating an instance)
	public static int getBoxVolume(int length, int breadth, int height) { // method input or parameters
		return length * breadth * height; // returning values
	}

	// void method which return nothing
	public static void printLine() {
		System.out.println("-----------------------------");
	}

	public static void main(String[] args) {

		Box box1 = new Box(12, 15, 20); // creating instance or object of a Class with new invoking
		Box box2 = new Box(2, 5, 9);

		System.out.println("Box1 Length= " + box1.length);
		System.out.println("Box2 Height= " + box2.height);

		box2.setDimension(8, 9, 10); // updating new values using setter
		System.out.println("Box2 Volume= " + box2.getVolume());

		printLine();

		// calling static method with its arguments
		int volume = getBoxVolume(10, 5, 2); // assigning returned value to a variable
		System.out.println("Volume= " + volume);
		System.out.println("Volume2= " + getBoxVolume(10, 15, 20));

		/* Stack operations */
		StackClass s1 = new StackClass();
		s1.push(29);
		s1.push(10);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		s1.pop();

	}

}
