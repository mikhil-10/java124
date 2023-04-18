 package java124;

//creating abstract class and method using abstract keyword
abstract class A {
//abstract method does not have body or cannot write logic inside it
//to create a body or write a logic inside it we have to extend the abstract class
	abstract int show();
}

//Extending the abstract class and providing body to its method
class B extends A {
	public int show() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println(a * b);
		return 0;
	}
}

public class Abstraction {
	public static void main(String[] args) {
//creating object of extended class i.e B.
		B ob = new B();
		ob.show();
	}
}
