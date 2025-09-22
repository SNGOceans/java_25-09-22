package day07;

import java.util.Scanner;
import java.util.Arrays;

public class MultiArray03 {

	public static void main(String[] args) {
		// 성적표
		/* 테스트 참가인원 >3
		 * 이름	국어	영어	수학	합계	평균	등수 \t
		 * jh	89	93	79	88	87	00
		 * park	89	93	79	88	87	00
		 * lee	89	93	79	88	87	00
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요>");
		
		String input = scan.nextLine(); // 한 줄 입력 받기
		String[] tokens = input.trim().split(" "); // 문자 나누기
		
		String[] name = new String[tokens.length]; // 학생 이름

		for(int i=0; i<tokens.length; i++) {
		    name[i] = tokens[i]; // 문자열 → 정수 변환
		}
		
		int[][] score = new int[tokens.length][3]; // 학생 별 점수
		
		int[] sum = new int[tokens.length]; // 합계
		double[] avg = new double[tokens.length]; // 평균
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score[i][j]=(int)(50*(Math.random())+51);
				sum[i] += score[i][j];
			}
			avg[i] = (double)sum[i]/score[i].length;
			avg[i] = Math.round(avg[i] * 100) / 100.0;
		}				
		Object[][] studentData = new Object[tokens.length][5];
		int[] rank = new int[tokens.length]; // 등수
		
		double[] temp = Arrays.copyOf(avg, avg.length);
		Arrays.sort(temp);
		
		for (int i = 0; i < avg.length; i++) {
		    for (int j = 0; j < temp.length; j++) {
		        if (avg[i] == temp[j]) {
		            rank[i] = temp.length - j; // 등수는 뒤에서부터
		            break;
		        }
		    }
		}
		
		System.out.println("[이름, 국어, 영어, 수학, 합계, 평균, 등수]");
		for (int i = 0; i < name.length; i++) {
		    studentData[i][0] = name[i];      // 이름
		    studentData[i][1] = score[i];     // 점수 배열
		    studentData[i][2] = sum[i];       // 합계
		    studentData[i][3] = avg[i];       // 평균
		    studentData[i][4] = rank[i]; // 등수 추가
		    
		    System.out.println(Arrays.deepToString(studentData[i]));
		}
		
		//rank = 1으로 두고, 나보다 높은 사람이 있으면 +1 (등수가 밀려남) / 구현해보기.				
	}

}
