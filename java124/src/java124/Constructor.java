package java124;

public class Constructor {
	int id;
	String name;

	// go in Source and select Generate Constructor using field

	public Constructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

// now again go in source and select generate toString() This will convert hashcode() into string
	@Override
	public String toString() {
		return "Constructor [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Constructor ob = new Constructor(1124, " Mikhil");
		System.out.println(ob.toString());
	}
}
