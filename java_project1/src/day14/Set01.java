package day14;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class Set01 {

    public static void main(String[] args) {
        // Set 생성 및 과일 추가
        Set<String> fruits = new HashSet<>();

        fruits.add("사과");
        fruits.add("배");
        fruits.add("귤");
        fruits.add("복숭아");
        fruits.add("포도");

        // 출력
        System.out.println("--- 과일 목록 ---");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        System.out.println("--- 과일 목록(itr) ---");
        Iterator<String> it = fruits.iterator();
        while(it.hasNext()) {
        	String t = it.next();
        	System.out.println(t);
        }
        
        List<String> list = new ArrayList<String>(fruits);
        System.out.println(list);
        System.out.println(list.get(0));

        Collections.sort(list);
        System.out.println(list);
       
    }
}
