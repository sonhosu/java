package kh.or.kh;

public class LedExam {

	public static void main(String[] args) {
		
		Tv tv = new LedTv();
		tv.turnOn();
		tv.changeChannel(0);
		tv.changeVolume(0);
		tv.turnOff();
	}

}
