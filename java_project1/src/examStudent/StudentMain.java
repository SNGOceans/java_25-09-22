package examStudent;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
    	/* 메뉴 기능 설명
         * 1. 학생 등록
         * 2. 학생 전체 리스트 출력
         * 3. 학생 검색 (학생 정보 및 수강 정보)
         * 4. 수강 신청
         * 5. 수강 철회
         * 6. 학생 정보수정
         * 7. 학생 삭제
         * 8. 과목 별 신청자 리스트(학생정보)
         * 9. 프로그램 종료
         */
    	
        Scanner scan = new Scanner(System.in);
        StudentController sc = new StudentController();

        int menu = 0;
        do {
            menu = sc.menuPrint(scan);
            switch (menu) {
            case 1: sc.insertStudent(scan); break;
            case 2: sc.printStudent(); break;
            case 3: sc.searchStudent(scan); break;
            case 4: sc.insertSubject(scan); break;
            case 5: sc.deleteSubject(scan); break;
            case 6: sc.reviseStudentInfo(scan); break;
            case 7: sc.deleteStudent(scan); break;
            case 8: sc.printSubjectperStudent(scan); break;
            case 9: System.out.println("종료합니다."); break;
            default: System.out.println("잘못된 메뉴입니다.");}
        } while (menu != 9);

        scan.close();
    }
}