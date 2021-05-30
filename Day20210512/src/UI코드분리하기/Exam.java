package UI코드분리하기;

public class Exam {
	
	int kor1;
	int eng;
	int math;
	public int getKor1() {
		return kor1;
	}
	public void setKor1(int kor1) {
		this.kor1 = kor1;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int total() {
		
		return eng + kor1 + math;
	}
	public int avg() {
		
		return total() / 3;
	}
	
}
