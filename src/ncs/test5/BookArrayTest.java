package ncs.test5;

public class BookArrayTest {
	public static void main(String[] args) {
		Book[] bookArr = new Book[3];
		bookArr[0] = new Book("자바의 정석","남궁성",30000,"도우출판",0.1);
		bookArr[1] = new Book("열혈강의 자바","구정은",29000,"프리렉",0.1);
		bookArr[2] = new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1);
		
		for(int i=0;i<bookArr.length;i++) {
			System.out.println(bookArr[i].getTitle()+", "+bookArr[i].getAuthor()+", "+bookArr[i].getPublisher()+", "+bookArr[i].getPrice()+"원, "+bookArr[i].getDiscountRate()*100+"% 할인");
			System.out.println("할인된 가격 : "+(int)(bookArr[i].getPrice()*(1-bookArr[i].getDiscountRate()))+"원");
		}
	}
}
