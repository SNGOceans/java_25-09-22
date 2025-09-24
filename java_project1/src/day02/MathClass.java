package day02;

public class MathClass {

	public static void main(String[] args) {
		// 수학 관련 기능이 있는 클래스.
		// Math.random() : 0~1 사이의 난수를 리턴.
		// Math.round(값) : 반올림. 소수 자릿수는 0.
		// Math.ceil(값) : 올림. 소수 자릿수는 0.
		// Math.floor(값) : 버림. 소수 자릿수는 0.
		
//		double num = 3.14159;
//		int roundNum = (int)Math.round(num); // return long
//		System.out.println(roundNum);
//		
//		double ceilNum = Math.ceil(roundNum);
//		int ceilNum = (int)Math.ceil(roundNum);
//		System.out.println(ceilNum);
//		
//		int floorNum = (int)Math.floor(roundNum);
//		System.out.println(floorNum);
		
//		//Math.max(값1, 값2) / Math.min(값1, 값2)
//		System.out.println(Math.max(10, 20));
//		System.out.println(Math.min(10, 20));
		
		System.out.println((int)(6*Math.random()+1));

	}
 
}
