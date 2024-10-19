package javabasics;

public class VariablesAndDatatypes {

	public static void main(String[] args) {
		
		/* (Multi line comment) 
		 * Primitive Data types
		 * --------------------
		 * byte & boolean = 1 byte
		 * short & char   = 2 byte
		 * int & float    = 4 byte
		 * long & double  = 8 byte
		 * 
		 * Non-primitive
		 * ---------------------
		 * String, Array, Class, Interface etc...
		 * */
		
		// Variables are named memory locations (Single line comment)
		
		/* Variable Initialization */
		byte ambulance_helpline = 108;
		boolean isIndianCitizen = true;
		short $course_fees = 25000;
		char _initial = 'S';
		int bike_cost = 80000; // also 80_000 for readability
		float interest_rate = 8.5f;
		long phone_number = 70809__01234L; // JDK v7 and above
		double discount_price = 49.99;
		String myName = "yogaraja";
		
		/* Type Casting (left side operand type should be higher than the right side one)*/
		byte numA = 29;
		int numB = numA; // auto or implicit type conversion
		
		float PI = (float) 3.14159; // explicit type conversion
		
		
		System.out.println("ambulance_helpline: " + ambulance_helpline);
		System.out.println("isIndianCitizen: " + isIndianCitizen);
		System.out.println("$course_fees: " + $course_fees);
		System.out.println("_initial: " + _initial);
		System.out.println("bike_cost: " + bike_cost);
		System.out.println("interest_rate: " + interest_rate);
		System.out.println("phone_number: " + phone_number);
		System.out.println("discount_price: " + discount_price);
		System.out.println("myName: " + myName);
		System.out.println("numB: " + numB);
		System.out.println("PI: " + PI);
		System.out.println("============ XXX ============");

	}

}
