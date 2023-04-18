package java124;

abstract class A {
	abstract int show();
}

class B extends A {
	public int show() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(a*b);
		return 0;
	}
}

public class Abstraction {
	public static void main(String[] args) {
		B ob = new B();
		ob.show();
	}
}
