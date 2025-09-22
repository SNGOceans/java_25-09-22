package day14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

    public static void main(String[] args) {
        // HashSet과 TreeSet을 사용하여 중복 없는 랜덤 숫자 6개 생성 및 출력

        // HashSet: 중복 제거, 순서 없음
        Set<Integer> randomNum = new HashSet<>();
        while (randomNum.size() < 6) {
            int num = (int)(Math.random() * 45) + 1;
            randomNum.add(num);
        }

        System.out.println("--- HashSet 출력 ---");
        for (int n : randomNum) {
            System.out.print(n + " ");
        }

        System.out.println("\n-------------------");

        // TreeSet: 중복 제거 + 자동 정렬
        TreeSet<Integer> treeSet = new TreeSet<>();
        while (treeSet.size() < 6) {
            int random = (int)(Math.random() * 45) + 1;
            treeSet.add(random);
        }

        System.out.println("--- TreeSet 출력 ---");
        System.out.println(treeSet); // 자동 정렬된 결과

        // TreeSet의 다양한 조회 기능
        System.out.println("최소값: " + treeSet.first());
        System.out.println("최대값: " + treeSet.last());
        System.out.println("20보다 작은 값들: " + treeSet.headSet(20));
        System.out.println("20 이상 값들: " + treeSet.tailSet(20));
        System.out.println("범위 안의 값 출력: "+treeSet.subSet(10,20));
    }
}
