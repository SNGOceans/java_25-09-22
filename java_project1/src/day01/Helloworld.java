package day01;

public class Helloworld {

	public static void main(String[] args) {
		// class는 package 안에 있어야 함.
		// class는 대문자로 시작(공백안됨.)
		// class 명에 여러 단어를 쓰고 싶다면 카멜케이스로 사용
		// Helloworld
		// 대소문자 구분 HelloWorld Helloworld
		// 주석 : 프로그램으로 읽히지 않는 라인 // <- 한줄주석
		/* 여러 줄 주석
		 * Ctrl + / : 주석 단축키		 * 
		 * Ctrl + Shift + "+/-" 화면 키우기/줄이기
		 * Menu Window 옮기기/ 줄이기/닫기 /추가하기 가능.
		 * Default 버튼 : 메뉴 구성 처음으로 돌리기.
		 * println(); : 줄바꿈이 있는 출력
		 * print(); : 줄바꿈이 없는 출력
		 * printf(); : c에서 사용하는 format 형태
		 */
		System.out.println("Hello JAVA!!"); // 기본출력, println은 아무것도 넣지 않아도 에러가 나지 않음.
		System.out.print("what the hell!!");
		System.out.print("Test01\n");
		System.out.print("Test02"); //print()는 아무것도 넣지 않으면 에러가 남.
		
		// printf : %d (정수), %s (문자열), %c(문자), %f(실수), \n(enter), \t(tab)
		int num = 10;
		System.out.printf("\n%d\n", num);
		System.out.println(num);
		
		// java "문자열 (띄어쓰기 포함)" / '가' 처럼 작은 따옴표 => 한글자만 넣을 수 있음 / 숫자는 그냥 사용하면 됨.
        // python과 javascript에서는 ''와 ""를 구분하지 않음. 짝만 맞아떨어지면 됨.
		
		final String COMPANY = "KOREA IT";
		System.out.print(COMPANY);
		
		char a = 'a';
		System.out.println(a);
	}

}
