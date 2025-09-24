package day01;

public class Exam01 {

	public static void main(String[] args) {
	    // 국어, 영어, 수학 점수를 변수로 선언하고 값을 할당
	    int lang_score = 89;
	    int eng_score = 79;
	    int math_score = 69;

	    int[] scores = {lang_score, eng_score, math_score};
	    int sum = 0;

	    // 합계 계산
	    for (int i = 0; i < scores.length; i++) {
	        sum += scores[i];
	    }

	    // 평균 계산 (float으로 형변환)
	    float average = (float) sum / scores.length;

	    // 평균이 80점 이상이면 메시지 출력
	    if (average > 80) {
	        System.out.println("총점: "+ sum + " | " + "평균: " + average + "\n" + "평균이 80점을 넘었습니다. 잘했어요!");
	    } else {
	        System.out.println("총점: "+ sum + " | " + "평균: " + average + "\n" + "평균이 80점 이하입니다. 조금 더 노력해봐요!");
	    }
	}
}
