package heros;
//문 13 문 14
public class SuperHero extends Hero{

	@Override
	public void run() {
		System.out.println("슈퍼영웅이 도망");
	}
	
	public void fly() {
		System.out.println("비행");
	}
	public void land() {
		System.out.println("착지");
	}
}
