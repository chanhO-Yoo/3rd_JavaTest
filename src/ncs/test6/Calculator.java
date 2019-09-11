package ncs.test6;

public class Calculator {
	public double getSum(int data) {
		//입력값이 2부터 5사이의 값이 아닐경우 exception발생
		if(data>5 || data<2) {
			new InvalidException("입력 값에 오류가 있습니다.");
			return -1;
		}
		else {
			//1부터 입력된 data까지 합을 계산
			double sum=0; //합계를 저장할 변수
			for(int i=0;i<=data;i++) {
				sum += i;
			}
			return sum;
		}
	}
}
