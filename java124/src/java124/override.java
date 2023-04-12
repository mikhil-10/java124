package java124;
class parent {
	void show()
	{
		System.out.println("this is the parent class");
	}
}

class child extends parent{
	void show() {
		System.out.println("This is the child class");
	}
}
public class override {
	public static void main(String[] args) {
		parent p = new parent();
		child c = new child();

		p.show();
		c.show();
	}

}
