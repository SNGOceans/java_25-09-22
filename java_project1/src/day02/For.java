package day02;

public class For {

	public static void main(String[] args) {
		// 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법.
		/* for, while, do~while
		 * - for, while 동작 방식이 같음.
		 * => 조건에 맞지 않으면 한 번도 실행되지 않을 수도 있음.
		 * - do~while
		 * => 조건에 맞지 않아도 무조건 1번은 실행함.
		 * for(초기화; 조건식; 증감식){
		 * 	실행문;
		 * }
		 * - 초기화 : 실행문을 반복하기 위한 변수를 초기화, 처음 한 번만 실행하고 생략가능.
		 * - 조건식 : 반복을 결정하는 식 (true가 되어야 반복, false가 되면 끝.) => 생략 가능.
		 * - 증감식 : 조건식에서 사용할 변수를 증가 / 감소시켜 반복횟수를 조절 => 생략 가능.
		 */
//		// 단 제목 출력
//        for (int i = 2; i < 10; i++) {
//            System.out.print("[" + i + "단]\t");
//        }
//        System.out.println(); // 줄 바꿈
//
//        // 각 단의 곱셈 결과 출력
//        for (int j = 1; j < 10; j++) {
//            for (int i = 2; i < 10; i++) {
//                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
//            }
//            System.out.println(); // 줄 바꿈
//        }
//		//i++ => i=i+1
		int sum = 0;
		for (int i=1; i<10; i++) {
			if(i%2==0) {
			System.out.print(i);
			sum = sum + i;
			}
		}
		System.out.print(sum);
		
		// 1부터 10까지 짝수합 / 홀수합
	}

}
