package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// List를 생성 후 1~10까지 채우고 출력
		// For문을 사용해서 요소를 직접 출력
		List<Integer> list = new ArrayList<>();		
		//list1 1~10까지 추가하고 출력 (for문 사용)
		for(int i=0; i<10; i++) {
			list.add(i+1);
		}
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------");
		// Iterator(반복자) : Index가 없는 구조를 출력하기 위해 사용.
		// Set Map은 Index가 없음.
		// 순서와 상관없이 값을 가져올 수 있는 구문을 사용.
		System.out.println("iterator 출력");
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) { //hasNext() : 다음 요소가 있는지 확인.
			int tmp = it.next();
			System.out.println(tmp); // next() : 다음 요소 가져오기.
		}
		
		// IndexOf(값) : 해당 값의 번지를 리턴 / 없으면 -1
		System.out.println(list.indexOf(10));
		
		list.clear();
		list.add(45);
		list.add(86);
		list.add(29);
		list.add(36);
		list.add(49);
		list.add(55);
		list.add(35);
		list.add(99);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
}
