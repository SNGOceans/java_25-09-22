package day02;
import java.util.Scanner;

import java.time.LocalDate;

public class Exam02_2 {

	public static void main(String[] args) {
		// 생년을 입력받아, 어린이 (13), 청소년(19), 어른(20)으로 구분.
		// 어린이는 입장료가 5000원, 청소년은 7000원, 어른은 10000원. 입장료를 출력하기.
		// ex) 2017(년도 입력) => 9세 어린이입니다. 입장료는 5000원입니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("태어난 년도를 입력>");
		
		int BirthYear = scan.nextInt();
		int CurrentYear = LocalDate.now().getYear();
		
		int Age = CurrentYear - BirthYear + 1;
		
		if (Age <=13) {
			System.out.println("어린이의 입장료는 5000원 입니다.");
		}
		else if (Age <=19) {
			System.out.println("청소년의 입장료는 7000원 입니다.");
		}
		else {
			System.out.println("어른의 입장료는 10000원 입니다.");
		}		
		
	}

}
