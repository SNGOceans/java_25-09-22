package day13;

import java.util.Scanner;
import java.util.Arrays;

public class Exception06 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    System.out.println("사이즈를 입력하세요.");
	    int size = scan.nextInt();

	    System.out.println("스타트 숫자를 입력하세요.");
	    int start = scan.nextInt();

	    System.out.println("카운트를 입력하세요.");
	    int count = scan.nextInt();

	    Exception06 m = new Exception06();
	    int[] arr;
	    
//	    arr = m.generate_arr(size, start, count);
//      System.out.println(Arrays.toString(arr));
	    
	    // Exception이 발생하더라도 그 후 구문이 정상 작동하도록 만들어주는 역할을 한다.
	    try {
	        arr = m.createArray(size, start, count);
	        System.out.println(Arrays.toString(arr));
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    System.out.println(1);
	    System.out.println(2);
	    System.out.println(3);
	    
	    scan.close();
	}
	
	/* size를 입력받아 size의 길이를 가지는 배열을 생성.
	 * 랜덤 값을 채워 배열을 리턴하는 메서드
	 * 랜덤 값의 범위는 start(시작), count(개수)
	 * - size가 0보다 작으면 예외발생.
	 * - count가 0보다 작으면 예외발생.
	 * 리턴타입 : 배열 => int[]
	 * 매개변수 : int size, int start, int count
	 * */
	
	public int[] createArray(int size, int start, int count) throws RuntimeException {
	    
		if (size <= 0) {
	        throw new RuntimeException("size는 0보다 커야 합니다.");
	    }
	    if (count <= 0) {
	        throw new RuntimeException("count는 0보다 커야 합니다.");
	    }

	    int[] arr = new int[size];
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = start + (int)(Math.random() * count);
	    }

	    return arr;
	}
}
