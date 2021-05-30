package part2.ex3.데이터구조화;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		Exam exam = new Exam();

		input(exam);
		print(exam);

	}

	private static void print(Exam exam) {
		System.out.println("---------------------------");
		System.out.println("-----------성적출력-----------");
		System.out.println("---------------------------");
		System.out.println();

		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		int total = eng + kor + math;
		int avg = total / 3;

		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.println("총점수:"+ total);
		System.out.println("평균:"+ avg);
		
	}

	private static void input(Exam exam) {
		Scanner scan = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		System.out.println("---------------------------");
		System.out.println("-----------성적입력-----------");
		System.out.println("---------------------------");
		System.out.println();

		
			do {
				System.out.printf("국어:");
				kor = scan.nextInt();

				if (kor < 0 || kor > 100) {
					System.out.println("국어성적은 0~100사이 입니다.");
				}

			} while (kor < 0 || kor > 100);

			do {
				System.out.printf("영어:");
				eng = scan.nextInt();

				if (eng < 0 || eng > 100) {
					System.out.println("영어성적은 0~100사이 입니다.");
				}

			} while (eng < 0 || eng > 100);

			do {
				System.out.printf("수학:");
				math = scan.nextInt();

				if (math < 0 || math > 100) {
					System.out.println("수학성적은 0~100사이 입니다.");
				}

			} while (math < 0 || math > 100);
			
			exam.kor= kor;			
			exam.eng = eng;
			exam.math = math;
			
		}
		
		
		
		
	

}
