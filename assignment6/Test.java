package assignment6;

public class Test {
	int eid;
	String ename;
	double esalary;
	
	Test(int eid){
		this("ruthvik",10000);
		this.eid = eid;
	}
	Test(String name,double sal){
		ename = name;
		esalary = sal;
	}
	
	public void printMemberVariables() {
		System.out.println("Employee id: " + eid + " " + "Employee name: "+ ename + "Employee Salary: " + esalary);
	}

	public static void main(String[] args) {
		Test t = new Test(111);
		t.printMemberVariables();

	}

}
