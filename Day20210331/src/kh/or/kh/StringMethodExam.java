package kh.or.kh;

public class StringMethodExam {

	public static void main(String[] args) {
		
		
		//String str = new String("hello");
		
		String str = "hello ";
		System.out.println(str.length());
		System.out.println(str.concat("world"));  // concat 은 문자열 뒤에 붙여달라는 뜻
		System.out.println(str);       // 불변 클래스 //String 클래스는 한번 만들어진 객체를 바꾸지않음
		str = str.concat("world");  // str이 hello world를 그리키게됨 
		
		System.out.println(str.substring(3)); // 서브 스트링은 해당하는 숫자부터 실행
		System.out.println(str.substring(3, 7));  //3번부터 7번까지만 출력 
	}

}
