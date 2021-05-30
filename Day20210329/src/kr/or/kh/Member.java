package kr.or.kh;

public class Member {

	private String name;
	private int height;
	private int weight;
	private String nation;
	public Member() {
		name = null;
		height = 0;
		weight = 0;
		nation = null;
		System.out.println(name+":"+height+":"+"weight");
	}
	public static void main(String[] args) {
		Member member = new Member();
		System.out.println(member.toString());
	}
	
	
}
