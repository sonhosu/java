package 학사프로그램;

public class ExamList {
	int current;
	Exam[] exams;
	int k =0;
	int i = 0;

	public ExamList() {
	this(5, 5);
	
	
	}
	
	public ExamList(int size, int i) {
		exams = new Exam[size];
		
		
		current=0;
		
	}
	
}
