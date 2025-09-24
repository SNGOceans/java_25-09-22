package day02;
import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// Input
		/* 콘솔 입력
		 * console input : 콘솔에서 값을 입력받는 것을 의미
		 * Scanner 클래스 : 객체를 생성 시 New 라는 키워드를 사용한다.
		 * 클래스타입 객체명 = new 클래스명(값)
		 * 객체명.next() : 한 단어를 입력(공백 포함하지 않음.)
		 * 객체명.nextLine() : 여러 단어를 입력(공백 포함.) Enter 인지.
		 * 객체명.nextInt() : 정수입력
		 * 객체명.next자료형() : 그 자료형에 맞는 값을 입력받을 수 있음.
		 */
//		String str = "abc";  // 특별한 클래스. 워낙 많이 쓰는 클래스이기 때문에 New Keyword 없이 사용 가능.
//		System.out.println(str);
//		
//		String str2 = new String();
//		str2 = "bcd";
//		System.out.println(str2);
		
		Scanner scan = new Scanner(System.in); // Scanner는 어떤 값을 반드시 입력받아야 함.
//		System.out.println("숫자입력?");
//		
//		int inputNum = scan.nextInt();
//		System.out.println(inputNum+10);
//		
//		System.out.println("문자입력>");
//		String inputStr = scan.next();
//		System.out.println("입력받은문자:"+inputStr);
//		
//		scan.nextLine(); //buffer에 남아있는 값을 처리 용.
//		
//		System.out.println("여러문자입력>");
//		String inputStr2 = scan.nextLine();
//		System.out.println("입력받은문자열:"+inputStr2);
		
		// 입력 받은 수가 짝수인지 홀수인지 판별하세요.
		// ? If. : Else.
		System.out.println("숫자입력?");
		int inputNum = scan.nextInt();
		if (inputNum % 2 == 0) {
			System.out.println(inputNum +"는(은) 짝수 입니다.");
		} else {
			System.out.println(inputNum +"는(은) 홀수 입니다.");
		}
	}

}
