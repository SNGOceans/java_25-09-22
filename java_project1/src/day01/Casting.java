package day01;

public class Casting {

	public static void main(String[] args) {
		// 자료형변환 : casting
		/*
		 * 양쪽 변의 자료형이 맞지 않다면 오류
		 * a = b;
		 * 자료형의 변환을 주어서 자료형을 맞추는 역할.
		 * byte < short < char < int < long
		 * float < double
		 * 자동형변환 : 작은 자료형을 큰 자료형으로 변환하는 것은 알아서 된다. 굳이 선언 안해줘도.
		 * 만약에 더 큰 자료형에서 작은 자료형으로 넣었을 경우, 범위 이내의 값이라면 형변환이 된다.
		 * 하지만, 범위 이외의 값이라면 오류가 뜨게 된다. (이 때는 불가능하다.)
		 */

//		byte a=10;
//		short sh = a;
//		
//		int in = 1;
//		a = (byte)in;
		
		double num = 3.1;
		int num1 = (int)num;
		//System.out.println(num1);
		
		// 문자를 숫자로 String
		String str = "1234";
		int strNum = Integer.parseInt(str); //string type을 int로 변환할 수 있음.
		//System.out.println(strNum + 10);
		
		// 숫자를 문자로 
		int numstr = 1234;
		String numStr2 = String.valueOf(numstr); //Int type을 String으로 변환.
		System.out.println(numstr+10);
		System.out.println(numStr2+10);
		
	}
}
