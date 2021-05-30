package kh.or.kh;

class Student{
	int school;
	public Student(int school) {
	this.school=school;
	}
	public static int ELEMENTARY=1;
	public static int MIDDLE=2;
	public static int HIGH=3;
	public static int UNIVERSITY=4;
}
	

public class EnumTest1 {

	public static void main(String[] args) {
		Student st1 = new Student(Student.ELEMENTARY);
		Student st2 = new Student(Student.MIDDLE);
		Student st3 = new Student(Student.HIGH);
		Student st4 = new Student(Student.UNIVERSITY);
		System.out.println("상수값을 출력한 경우");
		System.out.println(":"+st1.school);
		System.out.println(":"+st2.school);
		System.out.println(":"+st3.school);
		System.out.println(":"+st4.school);

	}

}
