package day09;

import java.util.Scanner;
import java.util.Arrays;

public class ReportMain {

    public static void main(String[] args) {
    	// 레포트 배열
    	// 데이터 스캐너로 받기
    	// 순위계산
    	
        Scanner scan = new Scanner(System.in);

        // 1. 이름 입력
        System.out.println("이름을 입력하세요 (공백으로 구분)>");
        String input = scan.nextLine();
        String[] names = input.trim().split(" ");

        // 2. Report 객체 배열 생성
        Report[] students = new Report[names.length];

        // 3. 점수 입력 및 계산
        for (int i = 0; i < names.length; i++) {
            students[i] = new Report(); // 기본 생성자 사용
            students[i].setName(names[i]);

            System.out.println(names[i] + "의 국어, 영어, 수학 점수를 입력하세요>");
            int lang = scan.nextInt();
            int eng = scan.nextInt();
            int math = scan.nextInt();

            students[i].setLang_score(lang);
            students[i].setEng_score(eng);
            students[i].setMath_score(math);

            int[] scores = { lang, eng, math };
            students[i].setSum(students[i].sum(scores));
            students[i].setAverage(students[i].average(scores));
        }

        // 4. 평균 배열 생성
        double[] averages = new double[students.length];
        for (int i = 0; i < students.length; i++) {
            averages[i] = students[i].getAverage();
        }
        
        ReportMain m = new ReportMain();
        
        // 5. 등수 계산
        int[] ranks = m.rank(averages);
        for (int i = 0; i < students.length; i++) {
            students[i].setRank(ranks[i]);
        }

        // 6. 출력
        System.out.println("\n[이름, 국어, 영어, 수학, 합계, 평균, 등수]");
        for (Report r : students) {
            r.print(); // Report 클래스의 출력 메서드 호출
        }

        scan.close();
    }

    // 등수 계산 메서드
    public int[] rank(double[] average) {
        int[] rank = new int[average.length];
        double[] temp = Arrays.copyOf(average, average.length);
        Arrays.sort(temp);

        for (int i = 0; i < average.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (average[i] == temp[j]) {
                    rank[i] = temp.length - j;
                    break;
                }
            }
        }
        return rank;
    }
}