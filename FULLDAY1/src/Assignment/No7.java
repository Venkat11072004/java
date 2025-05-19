package Assignment;
interface Name {
	void rollno(String name);
	void name(String roll);
	void branch(String group);
}
interface Address{
	void address(String add);
}
interface Marks{
	void marks(double gpa);
}
class Student implements Name{
	public void name(String name) {
		System.out.println("Name: "+name);
	}
	public void rollno(String roll) {
		System.out.println("RollNo: "+roll);
	}
	public void branch(String group) {
		System.out.println("Branch: "+group);
}
}
class Student_address implements Address{
	public void address(String add) {
		System.out.println("Dist: "+add);
	}
}
class Student_marks implements Marks{
	public void marks(double gpa) {
		System.out.println("CGPA: "+gpa);
	}
}
public class No7 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name("Venkat");
		s1.rollno("22X01A0575");
		s1.branch("CSE");
		Student_address s2=new Student_address();
		s2.address("Suryapet");
		Student_marks s3=new Student_marks();
		s3.marks(7.61);
	}

}
