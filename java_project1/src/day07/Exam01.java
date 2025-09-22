package day07;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력.
		 * (0이나 -의 숫자를 입력하면 종료)
		 * 출력 : 3+5+4+8+9 0 = 합, 평균
		 * 
		 */
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요>");
			
			String input = scan.next(); // 한 줄 입력 받기
			String[] tokens = input.trim().split(""); // 숫자 나누기
			
			ArrayList<Integer> userNum = new ArrayList<>();
			
			int sum=0;
			double average=0;
			boolean errorflag = false;
			
			try {
				for (int i=0; i< tokens.length; i++) {
					userNum.add(Integer.parseInt(tokens[i])); // 문자열 → 정수 변환
					sum += userNum.get(i); // 
	
					if (userNum.get(i)==0) {
						errorflag = true;
					}
				}
			} catch (NumberFormatException e) {
			    System.out.println("음수 또는 숫자가 아닌 값이 포함되어 있습니다. 종료합니다.");
			    errorflag = true;
			    break;
			}
			
			if (errorflag == true) {
				System.out.println("0보다 큰 숫자를 입력해야 합니다. 종료합니다.");
				break;
			}
			average = (double)sum/tokens.length;
			System.out.println("합계 :"+sum+" | "+"평균 :"+String.format("%.2f", average));
		}
	
	}

}
