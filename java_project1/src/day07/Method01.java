package day07;

import java.util.Scanner;

public class Method01 {
	
	// 메서드 생성 가능 위치
	// 두 정수를 주면(매개변수) 합을 리턴하는 메서드
	public int add(int[] num) {
		int result = 0;
		for(int i=0; i<num.length; i++) {
			result +=num[i];
		}
		return result;
	}
	
	// 두 정수를 주면 차를 리턴하는 메서드
	public int minus(int num1, int num2) {
		int result = 0;
		result = Math.abs(num1 - num2);
		return result;
	}

	public static void main(String[] args) { //method = 기능 = 함수 = function
		// class : 변수(가지는 요소), 메서드(해야하는 기능)
		// main : 컴파일러가 실행을 위해 가장 먼저 찾는 메서드 (static)
		// method 구조
		// 접근제어자 : 리턴타입, 메서드명(매개변수) /public, private, void (리턴할 값이 없을 경우)
		// 구현;
		// }
		/* - 접근제어자 : 접근할 수 있는 주체의 제한범위
		 * - 리턴타입 : 기능이 실행된 후 반환 값 (반환할 값의 자료형) => 반드시 1개
		 * - void : 리턴할 값이 없다는 것을 의미.
		 * - 메서드명 : 소문자로 시작 / - 클래스명 : 대문자로 시작
		 * - 매개변수 : 파라미터 기능을 하기 위해서 외부에서 반드시 들어와야 하는 값.
		 * - 메서드는 중복이 안됨 (메서드 안에 메서드가 있을 수 없음.)
		 * - 메서드 선언 위치
		 *   - 클래스 안, 다른 메서드 밖.
		 *   - 메서드는 독립적인 기능.
		 *   - 메서드의 순서는 아무 상관이 없음.
		 *     (메서드는 호출되어야 실행되므로 어디에 선언되어 있는지는 중요하지 않다.)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		String input = scan.nextLine(); // 한 줄 입력 받기
		String[] tokens = input.trim().split(" "); // 문자 나누기
		
		int[] numbers = new int[tokens.length]; // 학생 이름
		int result = 0;
		
		for(int i=0; i<tokens.length; i++) {
		    numbers[i] = Integer.parseInt(tokens[i]); // 문자열 → 정수 변환
		}
//		Method01 m = new Method01(); // main 안에서 클래스를 객체화
//		sum = m.add(numbers);
//		System.out.println(sum);
		
		Method01 m = new Method01(); // main 안에서 클래스를 객체화
		result = m.minus(numbers[0], numbers[1]);
		System.out.println(result);
	}
	
	// 메서드 생성 가능 위치

}
