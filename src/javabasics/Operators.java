package javabasics;

public class Operators {

	public static void main(String[] args) {

		int a = 10, b = 3, c;

		/* Arithmetic Operators (+ - * / %) */
		System.out.println("a+b: " + (a + b));
		System.out.println("a-b: " + (a - b));
		System.out.println("a*b: " + (a * b));
		System.out.println("a/b: " + (a / b)); // returns quotient
		System.out.println("a%b: " + (a % b)); // returns reminder
		System.out.println("============");

		/* Unary Operators (++, --) */
		// c = a++; => c = a + 1;
		c = a++; // post increment: first assign a value to c then a increment by 1
		System.out.println("c= " + c + " a= " + a);
		c = ++a; // pre increment: first increment a value by 1 then assign it to c
		System.out.println("c= " + c + " a= " + a);
		c = a--; // post decrement
		System.out.println("c= " + c + " a= " + a);
		c = --a; // pre decrement
		System.out.println("c= " + c + " a= " + a);
		System.out.println("============");

		/* Compound assignment operators (+=, -=, *=, /=, %=, &=, |=, ^=) */
		c = c + b;
		System.out.println("c= " + c);
		c += b;
		System.out.println("c= " + c);
		c -= b;
		System.out.println("c= " + c);
		c *= b;
		System.out.println("c= " + c);
		c /= b;
		System.out.println("c= " + c);
		c %= b;
		System.out.println("c= " + c);
		a = 3;
		b = 4;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("result " + c);
		System.out.println("============");

		/* Relational Operators (>, >=, <, <=, ==, !=) */
		System.out.println("a = " + a + " b = " + b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println("============");

		/* Bitwise Operator (&, |, ^, ~, <<, >>, >>>) */
		System.out.println("a = " + a + " b = " + b);
		System.out.println("a&b: " + (a & b));
		System.out.println("a|b: " + (a | b));
		System.out.println("a^b: " + (a ^ b));
		System.out.println("~a: " + ~a);
		System.out.println("5 << 3: " + (5 << 3)); // same as 5*(2*2*2)
		System.out.println("5 >> 3: " + (5 >> 2)); // same as 5/(2*2)
		System.out.println("5 >>> 3: " + (5 >>> 3)); // right shift with zero fill
		System.out.println("true&false= " + (true & false));
		System.out.println("true|false= " + (true | false));
		System.out.println("true^false= " + (true ^ false));
		// swap two numbers
		System.out.println("num1= " + ((8 ^ 9) ^ 8) + " num2= " + ((8 ^ 9) ^ 9));

		/* Short circuit operators (&&, ||) */
		int age = 18;
		System.out.println("Elegible: " + (age >= 18 && age <= 60));
		System.out.println("Senior citizen: " + (age > 60 || age == 100));

	}

}
