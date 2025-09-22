package day07;

import java.util.Scanner;

public class Method04 {

	// 정수 하나를 매개변수 입력받아(2~9까지의 숫자)
	// 해당 정수의 구구단을 출력하는 메서드
	// 리턴 타입 : void(리턴 안 받음)
	// 매개변수 : 정수 1개 int num
	// 메서드명 : multi
	
	public void multi(int num) {
		for(int i=1; i<10; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method04 m = new Method04();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단을 입력하세요>");
		
		String input = scan.next();
		int user_input = Integer.parseInt(input);
		
		m.multi(user_input);
	}

}
