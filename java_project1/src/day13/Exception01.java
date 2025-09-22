package day13;

public class Exception01 {

	public static void main(String[] args) {
		// Exception : 예외, 예외처리
		/* 자바는 크게 3가지로 예외를 처리
		 * Error : 복구할 수 없는 심각한 오류
		 * Checked Exception : 컴파일 시점에서 예외처리가 일어나는 예외
		 * 	  => I/O Exception / SQLException
		 * UnChecked Exception : 컴파일 시점에서 예외처리가 강제되지 않아
		 * 런타임에 발생하는 예외입니다.
		 * 주로 개발자의 프로그래밍 실수로 인해 발생하는 케이스
		 * 
		 * 오류의 종류
		 * - 논리적 오류 : 실행은 되지만 의도와는 다르게 동작하는 오류
		 * - 컴파일 오류 : 컴파일 시 발생하는 에러 (문법, 구문 오류)
		 * - 런타임 오류 : 실행 시 잘못된 결과를 얻거나,
		 * 				외부적인 요인에 의해 비정상 종료되는 경우
		 * 
		 * 실행 시(RunTime) 발생할 수 있는 오류들
		 * - 문제가 발생할 때를 대비하여 이에 대한 대응코드를 미리 작성함 => 예외처리
		 * - 예외처리를 통해 비정상 종료를 막을 수 있음.
		 * - 예외가 발생되면 예외발생 시점부터 코드는 중지 => 예외문구 출력.
		 * - 예외처리 => 예외가 발생되는 코드 이후 시점부터 중지
		 * 				/처리구문 이후부터는 정상 처리로 유지시키는 기능.
		 * try ~ catch
		 * try ~ catch ~ finally
		 * 
		 * - try : 예외가 발생할 가능성이 있는 구문을 작성.
		 * - catch : try 구문에서 발생한 예외를 처리
		 * = finally : try 구문 외 반드시 실행되어야 하는 문구를 작성 (생략 가능)
		 */
				
		try {
			System.out.println(1+0);
			System.out.println(1/0); //exception 발생라인
			System.out.println(1*0);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// System.out.println("0으로 나눌 수 없습니다. 오류가 발생했습니다.");
		}
		
		// Exception이 발생해도 처리되는 구역
		System.out.println(1+1);
		System.out.println(1+2); //exception 발생라인
		System.out.println(1+3);			

	}

}
