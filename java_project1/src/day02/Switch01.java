package day02;
import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// 조건문(switch문)
		// switch (변수 / 식) {
		// case 값 1 : 실행문; break;
		// case 값 2 : 실행문; break;
		// case 값 3 : 실행문; break;
		// default: 실행문;
		// }
		// break; 구문을 빠져나갈 때 사용
		
//		int num = 6;
//		// 짝수인지? 홀수인지 판별.
//		int mod = num % 2;
//		System.out.println(mod); // 0 or 1
//		
//		switch(mod) {
//		case 0: System.out.println("짝수"); break;
//		case 1: System.out.println("홀수"); break;
//		default: System.out.println("이상한 값");		
//		}
		
		//num1 변수에 1, 2, 3 중 하나라고 가정하고,
		//num1에 따라 1이면 1칸전진, 2면 2칸 전진, 3이면 3칸 전진이라고 출력.
		Scanner scan = new Scanner(System.in); // Scanner는 어떤 값을 반드시 입력받아야 함.
		
		System.out.println("숫자입력?");
		int inputNum = scan.nextInt();
//		switch(inputNum) {
//		case 1: case 2: case 3:
//			System.out.println(inputNum+"칸 전진"); break;
//		default: System.out.println("이상한 값");
//		}
		switch(inputNum) {
		case 3: case 4: case 5:
			System.out.println(inputNum+"월: 봄"); break;
		case 6: case 7: case 8:
			System.out.println(inputNum+"월: 여름"); break;
		case 9: case 10: case 11:
			System.out.println(inputNum+"월: 가을"); break;
		case 12: case 1: case 2:
			System.out.println(inputNum+"월: 겨울"); break;
		default: System.out.println("이상한 값");
		}

	}

}
