package java124;

public class NonStatic {
int x=10;
int y=30;

int multiply() {
	return x*y;
}

public static void main(String[] args) {
	NonStatic M = new NonStatic();
	System.out.println(M.multiply());
}
}
