package day13;

import java.util.Scanner;

public class Exception03 {

	public static void main(String[] args) {
		// 0으로 나누었을 때 발생하는 예외처리
		
//        Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자1을 입력하세요.");
//		int num1 = scan.nextInt();
//		
//		System.out.println("수식을 입력하세요.");
//		char op = scan.next().charAt(0);
//		
//		System.out.println("숫자2를 입력하세요.");
//		int num2 = scan.nextInt();
		
		Exception03 m = new Exception03();
//		double result = m.Calc(num1, num2, op);
		
		try {
			System.out.println(m.Calc(1,2,'+'));
			System.out.println(m.Calc(1,2,'-'));
			System.out.println(m.Calc(1,0,'/'));
			System.out.println(m.Calc(1,0,'%'));
		} catch (Exception e){
			e.printStackTrace();
			System.out.println(m.Calc(1,0,'*'));
			System.out.println(m.Calc(1,0,'+'));
		}
		
	}

	// 메서드에서 예외 처리 / 예외 넘기기
	/* 두 정수를 입력받고, 연산자를 입력받아
	 * 사친연산의 결과를 return하는 메서드
	 * 매개변수 : 두 정수와 연산자 int num1, int num2, char op
	 * return은 일률적으로 double
	 * 
	 * 예외 발생시키기 : throw new
	 */
	
	/* 연산자가 /, % 이고, num2 == 0이면
	 * num2는 0이 될 수 없습니다. 
	 */
		
	public double Calc(int num1, int num2, char op) throws RuntimeException {
		
		switch(op) {
			case '+': return (double)(num1+num2); 
			case '-': return (double)(num1-num2); 
			case '/':
	            if (num2 == 0) {
	                throw new ArithmeticException("0으로 나눌 수 없습니다.");
	            }
	            return (double)(num1 / num2);
	        case '%':
	            if (num2 == 0) {
	                throw new ArithmeticException("0으로 나눌 수 없습니다.");
	            }
	            return (double)(num1 % num2); 
			case '*': return (double)(num1*num2); 
			default: throw new RuntimeException("산술 연산자가 아닙니다.");
		}
		
	}
	
}
