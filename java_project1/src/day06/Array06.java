package day06;

public class Array06 {

	public static void main(String[] args) {
		// String 배열
		
		String[] arr = new String[5];
		arr[0] = "홍길동";
		arr[1] = "박영이";
		arr[2] = "최순자";
		arr[3] = "이길동";
		arr[4] = "황길범";
		
		for(String s:arr) {
			System.out.println(s);
		}
		
		int num = 11;
		int num2 = num;
		
		//배열 덮어쓰기
		String[] arr2 = arr;
		for(String s:arr2) {
			System.out.println(s);
		}
		
		//배열 복사
		String[] arr3 = new String[10];
		for(int i=0; i<arr.length; i++) {
			arr3[i] = arr[i]; 
		}
		
		//배열 복사
		for(String s : arr3) {
			System.out.println(s);
		}	
		
		//배열 바꾸기
		arr3[5] = "박재현";
		arr = arr3;
		arr[6] = "바둑이";
		
		System.out.println("--arr--");
		for(String s : arr) {
			System.out.println(s);
		}
		
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		
		System.out.println("--arraycopy--");
		for(String s : arr) {
			System.out.println(s);
		}
		
	}

}
