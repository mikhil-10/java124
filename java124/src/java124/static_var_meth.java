package java124;

public class static_var_meth {
	static int x = 10;
	static int y = 90;

	static int sum() {
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(static_var_meth.sum());
	}
}
