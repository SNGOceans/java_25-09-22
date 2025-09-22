package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01_1 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 랜덤으로 3자리의 숫자를 생성
		 * (각 자리의 수는 0~9)(중복 불가능)
		 * => 배열로 저장 (랜덤)(중복 불가능)
		 * 유저가 3자리를 맞추는 게임.
		 * 자리와 숫자가 같이 일치하면 strike
		 * 자리는 불일치, 숫자만 일치하면 ball,
		 * 자리도 숫자도 안맞으면 out
		 * 
		 * ex)com: 1 2 3
		 * user : 1 5 9 => 1s.
		 * user : 2 5 8 => 1b.
		 * user : 7 8 9 => out.
		 * user : 1 9 5 => 1s.
		 * user : 1 2 8 => 2b.
		 * user : 1 2 3 => 3s. 정답!
		 */
		
		int[] comNum = new int[3];
//		boolean isDuplicate = false;
//		for(int i=0; i<comNum.length; i++) {
//			do {
//				comNum[i] = (int)(Math.random()*10);
//				for(int j=0; j<i; j++) {
//					if(comNum[i]==comNum[j]) {
//						isDuplicate = true;
//						break;
//					}
//				}				
//			}
//			while (isDuplicate);
//		}
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*10);
			for(int j=0; j<i; j++) {
				if(comNum[i]==comNum[j]) {
					i--;
					break;
				}
			}	
		}
		System.out.println(Arrays.toString(comNum));
		
		while(true) {
			int[] userNum = new int[comNum.length];
			int strike = 0;
			int ball = 0;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요>");
			
			String input = scan.next(); // 한 줄 입력 받기
			String[] tokens = input.trim().split(""); // 숫자 나누기
	
			for (int k=0; k< tokens.length; k++) {
			    userNum[k] = Integer.parseInt(tokens[k]); // 문자열 → 정수 변환
			}
			
			// 정확한 판정 로직
	        for (int i = 0; i < userNum.length; i++) {
	            for (int j = 0; j < comNum.length; j++) {
	                if (userNum[i] == comNum[j]) {
	                    if (i == j) {
	                        strike++;
	                    } else {
	                        ball++;
	                    }
	                }
	            }
	        }
	        if (strike ==0 && ball==0) {
	        	System.out.println("OUT!!");
	        }
	        else {
	        	System.out.println("Strike :"+strike+" | "+"Ball :"+ball);
	        }
	        
	        if (strike ==3) {
	        	System.out.println("정답!!");
	        	break;
	        }
		}
				
	}

}