package ncs.test2;

public class StringTest {
	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double[] data = new double[5];
		double sum = 0;
		
		//str에서 데이터를 ,단위로 분리한다.
		String[] st = str.split(",");
		
		//for ~ each문을 사용하는 반복문
		int i = 0;
		for(String newStr : st) {
			data[i++] = Double.parseDouble(newStr);//data배열에 실수 데이터 넣기
			sum += Double.parseDouble(newStr);//배열 데이터의 합을 구한다.
		}
		
		System.out.printf("합계 : %.3f",sum);
		System.out.println();
		System.out.printf("평균 : %.3f",sum/data.length);
	}
}
