package java124;

//Creating interface class by using interface keyword
//as interface is pure abstract class it contain only abstract method.
interface M {

	abstract int show();
}

//To give body to its method we have to implement interface
class N implements M {
	public int show() {
		int i = 80;
		int j = 40;
		System.out.println(i - j);
		return 0;

	}
}

public class Interface {
	public static void main(String[] args) {
//Creating object of class N
		N ob = new N();
		ob.show();
	}
}
