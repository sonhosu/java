package kr.or.kh;

public class HouseConstractorTest {

	public static void main(String[] args) {
		House house1 = new House();
		System.out.println(house1.price+":"+house1.size+"+"+house1.dong+":"+house1.kind);
		House house2 = new House(300);
		System.out.println(house2.price+":"+house2.size+"+"+house2.dong+":"+house2.kind);
		House house3 = new House(300,40);
		System.out.println(house2.price+":"+house2.size+"+"+house2.dong+":"+house2.kind);
		
		
		
	}

}
