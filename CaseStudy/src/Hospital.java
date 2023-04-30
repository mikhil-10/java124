class Accountant {
	int salary(int sal, int tax) {
		return sal - tax;
	}

	int salary(int sal) {
		return sal;
	}
}

class Doctor extends Accountant {
	String name;
	int id;

	public Doctor(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + "]";
	}
@Override
int salary(int sal, int tax) {
	// TODO Auto-generated method stub
	return super.salary(sal, tax);
}

}

class Nurse extends Accountant {
	String name;
	int id;

	public Nurse(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nurse [name=" + name + ", id=" + id + "]";
	}
	@Override
	int salary(int sal) {
		// TODO Auto-generated method stub
		return super.salary(sal);
	}
}

public class Hospital {
	public static void main(String[] args) {
		Doctor doc = new Doctor("Doctor1", 101);
		Doctor doc1 = new Doctor("Doctor2", 102);
		System.out.println(doc);
		System.out.println(doc1);
		System.out.println(doc.salary(100000,3000));
		
		Nurse n1 = new Nurse("Nurse1 ",201);
		Nurse n2 = new Nurse("Nurse2",202);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1.salary(50000));
	}
}
