package java124;

class Empl {
	String Name;
	int id;
	int sal;
	String Address;

	public Empl(String name, int id, int sal, String address) {
		super();
		Name = name;
		this.id = id;
		this.sal = sal;
		Address = address;
	}
	void info() {
		System.out.println(Name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(Address);
	}
}

public class Employee {
	public static void main(String[] args) {
		Empl emp = new Empl("Mikhil" , 24, 650000, "Mumbai");
		emp.info();
	}

}
