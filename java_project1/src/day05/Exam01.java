package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 컴퓨터와 유저가 가위바위보 게임을 진행
		 * 가위 = 0, 바위 = 1, 보 = 2
		 * 컴퓨터도 랜덤으로 0, 1, 2 중 선택
		 * ex) com = 0 / me = 0
		 * com(가위) / me(가위) / => 무승부
		 * com = 0 / me = 2
		 * com(가위) / me(보) => me 패배!!
		 * 
		 */
		
		 String choice[] = {"가위", "바위", "보"};
		 //System.out.println(choice[0]);
		 
		 System.out.println("가위 바위 보 게임 시작?");
		 int comNum = (int)(Math.random()*3); // 0 1 2
		 System.out.println("컴퓨터 결정 완료!!" + comNum + " "+choice[comNum]);
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("가위(0) 바위(1) 보(2) 종료(3) 중 선택>");
		 int myNum = scan.nextInt();
		 
//		 if(myNum==3) {
//			 System.out.println("종료합니다.");
//			 break;
//		 }
		 
		 if(myNum<0 || myNum >2) {
			 System.out.println("입력오류 입니다.");
			 return;
		 }
		 
		 String result="";
		 
		 if(comNum==myNum) {
			 result = "무승부";
		 } else {
			 if(myNum ==0) {
				 result = (comNum ==2)? "승" : "패";
			 } else if(myNum ==1) {
				 result = (comNum ==0)? "승" : "패";
			 } else {
				 result = (comNum ==1)? "승" : "패";
			 }
		 }
		 
		 System.out.println(result);
		 
	}

}
