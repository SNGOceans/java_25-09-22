package day02;
import java.util.Scanner;

public class IF01 {

	public static void main(String[] args) {
		// 조건문 : IF, Switch
		// if(조건식) {true일 때 실행;}
		// 실행문이 한 줄이면 중괄호 생략 가능.
		// 실행문이 두 줄 이상이면 반드시 중괄호 있어야 함.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력해주세요>");
		int inputNum = scan.nextInt();
//		if(inputNum==0) { 
//			System.out.println(inputNum +"는(은) 0 입니다.");
//		}else if(inputNum % 2 == 0){
//			System.out.println(inputNum +"는(은) 짝수 입니다.");
//		}else{
//			System.out.println(inputNum +"는(은) 홀수 입니다.");
//		}
		
		if(inputNum<=13) { 
			System.out.println(inputNum +"는(은) 어린이 입니다.");
		}else if(inputNum > 13 && inputNum <= 19){
			System.out.println(inputNum +"는(은) 청소년 입니다.");
		}else{
			System.out.println(inputNum +"는(은) 성인 입니다.");
		}
	}

}
