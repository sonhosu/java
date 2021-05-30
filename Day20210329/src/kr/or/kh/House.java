package kr.or.kh;

public class House{

	
	public int price;
	public String dong;
	public int size;
	public String kind;
	public House() {
		this(100,32,"동판교","아파트");
		
	}
	public House(int price) {
		this(price,32,"동판교","아파트");
		
		
	}
	public House(int pirce,int size, String dong, String kind) {
		
		this.price=price;
		this.size=size;
		this.dong=dong;
		this.kind=kind;
	}
}



