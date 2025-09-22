package day01;

public class Variable {

	public static void main(String[] args) {
		// 변수(Variable)
		/* 타입 변수명 선언 후 사용.
		 * 선언 + 초기값 함께 줄 수 있음.
		 * int num = 0;
		 * 같은 타입일 경우 동시 선언 가능.
		 * 초기값은 각자 지정.
		 * 기본 데이터 타입은 초기화해야 사용가능.
		 * = (대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장(덮어쓰기)
		 * 
		 * 
		 */
		
		int[] scores = {10, 20, 30, 40, 50};
		for (int i=0; i<scores.length; i++)
		{
			System.out.println(scores[i]);
		}
		
		// char : 아스키 코드(유니코드) 표에 따른 한 글자만 저장 가능. ''로 표시.
		// string : 문자열 표현 클래스
		char ch = 'a';
		System.out.println((int)ch); //char -> int로 형 변환.
		
		double dou = 3.1;
		System.out.println(dou);
		
		byte b = 1;
		System.out.println(b);
		
		// boolean
		boolean boo = true;
		System.out.println(boo); 
		
		// float / long 접미사 붙여야 함.
		// float(f F) / long (l L)
		
		float f = 1.2f;
		System.out.println(f);
		
		long l = 1L;
		System.out.println(l);
		
		int num1;
		num1 = 010; // 앞에 숫자 0을 붙이면 8진수로 인식한다.
		System.out.println(num1);
		
		int num2;
		num2 = 0x10; //16진법으로 인식(0~9ABCDEF)
		System.out.println(num2);
		
		// 지역변수의 범위 {}
		{
			int a = 100;
			System.out.println(a);
		}
		
		// {}가 끝나면 지역변수는 사라진다. 다시 선언해야 인지할 수 있다.
		int a = 200;
		System.out.println(a);
		
	}

}
