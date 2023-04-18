package java124;

class Empl {
	String Name;
	int id;
	int sal;
	String Address;

//Creating constructor 
	public Empl(String name, int id, int sal, String address) {
		super();
		Name = name;
		this.id = id;
		this.sal = sal;
		Address = address;
	}

//writing all the details in info() to show details at once
	void info() {
		System.out.println(Name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(Address);
	}

//using toString() to convert hash code into String
	@Override
	public String toString() {
		return "Empl [Name=" + Name + ", id=" + id + ", sal=" + sal + ", Address=" + Address + "]";
	}
}

public class Employee {
	public static void main(String[] args) {
		// creating object of Empl and giving arguments to it.
		Empl emp = new Empl("Mikhil", 24, 650000, "Mumbai");
		emp.info();
	}

}
