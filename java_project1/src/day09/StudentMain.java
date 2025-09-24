package day09;

import java.util.Scanner;
import java.util.Arrays;

public class StudentMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student[] std = new Student[5];
        String[] studentBranches = new String[5];
        int studentCount = 0;

        String academy_name = "KOREAIT";
        String[] gigum = {"강남", "신촌", "인천", "대전", "수원"};
        String[] subjectName = {"java", "DB", "javaScript", "python", "C", "태극기"};
        String[] subjectDate = {
            "2025-08-01~2025-08-30", "2025-09-15~2025-10-15", "2025-10-15~2025-11-15",
            "2025-09-01~2025-09-31", "2025-08-26~2025-09-26", "2025-08-15~2025-09-15"
        };

        while (true) {
            System.out.print("이름을 입력하세요> ");
            String name = scan.next();

            System.out.print("핸드폰 번호를 입력하세요> ");
            String phone_number = scan.next();

            System.out.print("생년월일을 입력하세요> ");
            String birth_date = scan.next();

            System.out.print("나이를 입력하세요> ");
            int age = scan.nextInt();

            Student m = new Student(name, phone_number);
            m.setBirth_date(birth_date);
            m.setAge(age);

            System.out.println("--------------지점선택----------------");
            for (int i = 0; i < gigum.length; i++) {
                System.out.print((i + 1) + "." + gigum[i] + "  ");
            }

            System.out.print("\n지점을 입력하세요> ");
            int gigumIdx = scan.nextInt();
            String selectedBranch = gigum[gigumIdx - 1];

            System.out.println("\n--------------과목선택----------------");
            for (int i = 0; i < subjectName.length; i++) {
                System.out.println((i + 1) + "." + subjectName[i] + " / " + subjectDate[i]);
            }
            System.out.println("7. 다음 학생 입력");
            System.out.println("8. 학생 입력 종료 후 검색 메뉴로 이동");

            int subjectIdx = -1;
            while (true) {
                System.out.print("\n과목을 입력하세요> ");
                subjectIdx = scan.nextInt();

                if (subjectIdx >= 1 && subjectIdx <= subjectName.length) {
                    m.addSubject(subjectName[subjectIdx - 1], subjectDate[subjectIdx - 1]);
                    System.out.println("과목 추가 완료!");
                } else if (subjectIdx == 7 || subjectIdx == 8) {
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                }
            }

            // 학생 정보 저장
            if (studentCount >= std.length) {
                std = Arrays.copyOf(std, std.length + 5);
                studentBranches = Arrays.copyOf(studentBranches, studentBranches.length + 5);
            }
            std[studentCount] = m;
            studentBranches[studentCount] = selectedBranch;
            studentCount++;

            if (subjectIdx == 8) break;
        }

        // 검색 메뉴
        while (true) {
            System.out.println("\n검색 메뉴");
            System.out.println("1. 학생 이름으로 검색");
            System.out.println("0. 종료");
            System.out.print("선택> ");
            int searchOption = scan.nextInt();

            if (searchOption == 1) {
                System.out.print("검색할 학생 이름을 입력하세요> ");
                String searchName = scan.next();
                boolean found = false;

                for (int i = 0; i < studentCount; i++) {
                    if (std[i].getName().equalsIgnoreCase(searchName)) {
                        System.out.println("학원명: " + academy_name);
                        System.out.println("지점명: " + studentBranches[i]);
                        std[i].print();
                        found = true;
                    }
                }
                if (!found) System.out.println("해당 이름의 학생이 없습니다.");
            } else if (searchOption == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        scan.close();
    }
}