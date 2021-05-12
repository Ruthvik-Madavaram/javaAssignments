package assignment12;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
	public void printAllDepartments(ArrayList<Student> students) {
		students.stream().map(student->student.engDepartment).distinct().forEach(System.out::println);
	}
	public void studentsEnrolledAfter2018(ArrayList<Student> students) {
		students.stream().filter(student->student.yearOfEnrollment>2018).map(student->student.name).forEach(System.out::println);
	}
	public void detailsOfMaleCSEStudents(ArrayList<Student> students) {
		students.stream().filter(student->student.engDepartment.equals("Computer Science")).filter(student->student.gender.equals("Male")).forEach(s->System.out.println(s.name+" "+s.engDepartment));
	}
	public void countMaleAndFemale(ArrayList<Student> students) {
		students.stream().collect(Collectors.groupingBy(student -> student.gender,Collectors.counting())).forEach((s,c)-> System.out.println(s+" "+c));
	}
	public void averageAgeOfMaleAndFemale(ArrayList<Student> students) {
		students.stream().collect(Collectors.groupingBy(s -> s.gender,Collectors.averagingInt(s-> s.age))).forEach((g,res)-> System.out.println(g+" "+res));
	}
	public void studentWithHighPercentage(ArrayList<Student> students) {
		Student s = students.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println(s.name);
	}
	public void studentsInEachDept(ArrayList<Student> students) {
		students.stream().collect(Collectors.groupingBy(s->s.engDepartment,Collectors.counting())).forEach((dept,num)->System.out.println(dept+ " " + num));
	}
	public void averagePercentageInEachDept(ArrayList<Student> students) {
		students.stream().collect(Collectors.groupingBy(s->s.engDepartment,Collectors.averagingDouble(s->s.perTillDate))).forEach((dept,per)->System.out.println(dept+ " " + per));
	}
	public void youngestMaleInElectric(ArrayList<Student> students) {
		MyComparator c = new MyComparator();
		 students.stream().filter(student -> student.engDepartment=="Electric").
				filter(student -> student.gender=="Male").min((s1,s2)->c.compare(s1, s2)).ifPresent(s1->System.out.println(s1.name));
	}
	public void countMaleAndFemaleInCSE(ArrayList<Student> students) {
		students.stream().filter(s->s.engDepartment=="Computer Science").collect(Collectors.groupingBy(s->s.gender,Collectors.counting())).forEach((g,c)->System.out.println(g+" "+c));
	}
	public static void main(String[] args) {
		Main ex = new Main();
		AddStudents add = new AddStudents();
		ex.printAllDepartments(add.addStudents());
		ex.studentsEnrolledAfter2018(add.addStudents());
		ex.detailsOfMaleCSEStudents(add.addStudents());
		ex.countMaleAndFemale(add.addStudents());
		ex.averageAgeOfMaleAndFemale(add.addStudents());
		ex.studentWithHighPercentage(add.addStudents());
		ex.studentsInEachDept(add.addStudents());
		ex.averagePercentageInEachDept(add.addStudents());
		ex.youngestMaleInElectric(add.addStudents());
		ex.countMaleAndFemaleInCSE(add.addStudents());
		
	}
}
