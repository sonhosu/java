package Test;

public class Car extends option {

	@Override
	public void move() {
		System.out.println("이동2");

	}

	@Override
	public void stop() {
		System.out.println("정지");
	}

	@Override
	public void left() {

		System.out.println("좌회전");
	}

	@Override
	public void right() {
		System.out.println("우회전");
	}

	public void speed() {

		System.out.println("빠르게 이동");

	}

}
