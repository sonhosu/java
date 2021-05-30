package kr.or.kh;

public class ConstracktorTest {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person(30);
		Person person3 = new Person("yoon");
		
		System.out.println(person1.age+":"+person1.name+":"+person1.height);
		System.out.println(person2.age+":"+person2.name+":"+person2.height);
		System.out.println(person3.age+":"+person3.name+":"+person3.height);
		
		
		

	}

}
