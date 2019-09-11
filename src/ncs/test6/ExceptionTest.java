package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("2부터 5사이의 정수를 입력하세요 : ");
		int data = sc.nextInt();
		if(cal.getSum(data) != -1) {
			System.out.println(cal.getSum(data));
		}
	}
}
