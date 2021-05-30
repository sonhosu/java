package 문제모음1;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExam {

	public static void main(String[] args) {
		System.out.println("오늘 몇월 몇일 입니까?");
		Calendar cal =  Calendar.getInstance() ;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇월"); 
		int todaymonth =sc.nextInt();
		System.out.println("몇일");
		int todaydate = sc.nextInt();
		
		int date= cal.get(Calendar.DATE);
		int month=cal.get(Calendar.MONTH+1);
		
		if (todaymonth==month || todaydate==date) {
			System.out.println("오늘");
		}else {
			System.out.println("오늘아님");
		}
		
	}

}
