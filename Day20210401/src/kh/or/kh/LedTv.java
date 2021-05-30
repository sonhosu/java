package kh.or.kh;

public class LedTv implements Tv {

	public void turnOn() {

		// TODO Auto-generated method stub
		System.out.println("켰다");
		System.out.println();
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("껐다");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 조정하다");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널을 조정하다");
	}

}



