package day01;

public class Operator {

	public static void main(String[] args) {
		// (연산자(Operator)
		// 사칙연산자 (+ - * / %)
		
		int a = 1;
		int b = 2;
		
		//a=b;
		a = a + b;
		System.out.println(a);
		
		int d = 0;
		d = d +1;
		System.out.println(d);
		
		String[] num = {"a", "b", "c", "d", "e", "f"};
		
		// 사칙연산자 : + - * / % (나머지)
		// + : 숫자가 아닐 때는 연결연산자 바뀜. 문자 + 숫자
		for(int c=0; c<6; c++)
		{
			System.out.println(c); // Ctrl + Space. 
			System.out.println(num[c]+ c);
		}
		
		// 나누기 ( /%)
		// 정수 / 정수 = 정수 (10/3 = 3)
		// 정수 / 실수 = 실수 (10/3 = 3.33333)
		// 실수 / 실수 = 실수
		// 정수 / 0 => Exception (infinity)
		System.out.println(10/(float)3);
		System.out.println(10.0/0);
		System.out.println(10%3);
		
		// 비교연산자 : 비교연산의 결과는 반드시 True/False
		// >=, <=, >, <, ==, !=
		// 논리연산자 : && / || / !
		// 조건 선택 연산자 : (조건식) ? true : false
		// System.out.println((3>2) ? "3이 더 큽니다." : "3이 더 작습니다");
		
		/* 문제
		 *  num  정수 변수를 선언하고, 값을 입력
		 *  조건 선택 연산자를 활용하여 num가 짝수인지 홀수 인지 출력.
		 */
		
		int num1 = 5;
		if (num1 % 2 == 0) {
			System.out.println(num1 +"는(은) 짝수 입니다.");
		} else {
			System.out.println(num1 +"는(은) 홀수 입니다.");
		}
	}

}
