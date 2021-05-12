package assignment12;
import java.util.Comparator;
public class Student implements Comparable<Student> {
		int id;
		String name;
		int age;
		String gender;
		String engDepartment;
		int yearOfEnrollment;
		double perTillDate;
		public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment,
				double perTillDate) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.engDepartment = engDepartment;
			this.yearOfEnrollment = yearOfEnrollment;
			this.perTillDate = perTillDate;
		}
		@Override
		public int compareTo(Student o) {
			if(o.perTillDate < this.perTillDate)
				return -1;
			else if(o.perTillDate> this.perTillDate)
				return 1;
			return 0;
		}	

}

class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age < o2.age)
			return -1;
		else if(o1.age > o2.age)
			return 1;
		return 0;
	}
	
}