package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateTest {
	public static void main(String[] args) {
		//오늘
		Calendar today = new GregorianCalendar();
		int bYear = today.get(Calendar.YEAR);
		int bMonth = today.get(Calendar.MONTH+1);
		int bDay = today.get(Calendar.DAY_OF_MONTH);
		
		Calendar birth = new GregorianCalendar();
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 해을 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요 : ");
		int month = sc.nextInt();
		System.out.print("태어난 날짜을 입력하세요 : ");
		int date = sc.nextInt();
		birth.set(year, month-1, date);
		
		//나이 계산
		int age = today.getWeekYear() - birth.getWeekYear();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String birthDate = sdf.format(birth.getTime());
		String todayDate = sdf2.format(today.getTime());
		
		System.out.println("생일 : "+birthDate);
		System.out.println("현재 : "+todayDate);
		System.out.println("나이 : "+age);
		
	}
}
