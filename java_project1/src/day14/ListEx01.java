package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListEx01 {

	public static void main(String[] args) {
		// 두 배열을 합쳐 하나의 list로 생성
		// 정렬해서 출력
		
		String[] arr1 = {"a", "t", "y", "s", "d"};
		String[] arr2 = {"b", "u", "c", "z", "g"};
		
		ArrayList<String> list = new ArrayList<>();
		
//		for(int i=0; i<arr1.length; i++) {
//			list.add(arr1[i]);
//		}
//		
//		for(int i=0; i<arr2.length; i++) {
//			list.add(arr2[i]);
//		}
		
		// Enhanced for loop
		for(String s : arr1) {
			list.add(s);
		}
		
		for(String s : arr2) {
			list.add(s);
		}
		
		Collections.sort(list);
		System.out.println(list);

	}

}