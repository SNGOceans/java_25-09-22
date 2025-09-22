package day02;
import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학점수를 입력받아
		 * 합계, 평균, pass여부를 출력
		 * pass 기준은 평균이 80이상 - if
		 * return; : 메서드 종료 후 줄 값이 있을 때, void -> 줄 값이 없음.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요:");
		int lang_score = scan.nextInt();
		System.out.println("영어 점수를 입력해주세요:");
		int eng_score = scan.nextInt();
		System.out.println("수학 점수를 입력해주세요:");
		int math_score = scan.nextInt();

	    int[] scores = {lang_score, eng_score, math_score};
	    int sum = 0;

	    // 합계 계산
	    for (int i = 0; i < scores.length; i++) {
	        sum += scores[i];
	    }

	    // 평균 계산 (float으로 형변환)
	    float average = (float) sum / scores.length;

//	    // 평균이 80점 이상이면 메시지 출력
//	    if ((lang_score > 0 && lang_score < 100) &&
//	    	    (eng_score > 0 && eng_score < 100) &&
//	    	    (math_score > 0 && math_score < 100)) {
//
//	    	    if (average > 80) {
//	    	        System.out.println("합계: " + sum + " | 평균: " + average + "\n평균이 80점을 넘었습니다. PASS : 잘했어요!");
//	    	    } else {
//	    	        System.out.println("합계: " + sum + " | 평균: " + average + "\n평균이 80점 이하입니다. FAIL : 조금 더 노력해봐요!");
//	    	    }
//
//	    } else {
//	        System.out.println("각 점수는 0보다 크고 100보다 작아야 합니다. 입력값을 확인해주세요.");
//	    }
	    
	    if ((lang_score < 0 || lang_score > 100) ||
	    	    (eng_score < 0 || eng_score > 100) ||
	    	    (math_score < 0 || math_score > 100)) {
	    	    System.out.println("점수는 0 이상 100 이하로 입력해주세요.");
    	} else if (average > 80) {
    	    System.out.println("합계: " + sum + " | 평균: " + average);
    	    System.out.println("평균이 80점을 넘었습니다. PASS : 잘했어요!");
    	} else {
    	    System.out.println("합계: " + sum + " | 평균: " + average);
    	    System.out.println("평균이 80점 이하입니다. FAIL : 조금 더 노력해봐요!");
    	}
	}

}
