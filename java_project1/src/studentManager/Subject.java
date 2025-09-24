package studentManager;

public class Subject {
    /* 
     * 수강 과목 클래스 (Subject)
     * - 멤버 변수:
     *   과목코드, 과목명, 수강기간, 시수, 강사명, 강의장
     * - 기능:
     *   과목 정보를 출력하는 메서드 포함
     */

    private String subjectCode;       // 과목 코드
    private String subjectName;       // 과목명
    private String subjectPeriod;     // 수강 기간
    private String subjectHours;      // 시수
    private String subjectLecturer;   // 강사명
    private String subjectLocation;   // 강의장
    
    // 참고 : 초깃값을 설정하고, 아무런 메서드나 조건도 없이 값을 재설정하면 오류가 뜬다.

    // 기본 생성자
    public Subject() {}

    // 매개변수 생성자
    public Subject(String subjectCode, String subjectName,
            String subjectPeriod, String subjectHours, 
            String subjectLecturer, String subjectLocation) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.subjectPeriod = subjectPeriod;
        this.subjectHours = subjectHours;
        this.subjectLecturer = subjectLecturer;
        this.subjectLocation = subjectLocation;
    }

    // 과목 정보 출력 메서드
    public void printclassInfo() {
        System.out.println("---수강 과목 정보---");
        System.out.println("과목코드: " + subjectCode);
        System.out.println("과목명: " + subjectName);
        System.out.println("수강기간: " + subjectPeriod);
        System.out.println("시수: " + subjectHours);
        System.out.println("강사명: " + subjectLecturer);
        System.out.println("강의장: " + subjectLocation);
    }

    // Getter & Setter 메서드
    public String getSubjectCode() { return subjectCode; }
    public void setSubjectCode(String subjectCode) { this.subjectCode = subjectCode; }

    public String getSubjectName() { return subjectName; }
    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }

    public String getSubjectPeriod() { return subjectPeriod; }
    public void setSubjectPeriod(String subjectPeriod) { this.subjectPeriod = subjectPeriod; }

    public String getSubjectHours() { return subjectHours; }
    public void setSubjectHours(String subjectHours) { this.subjectHours = subjectHours; }

    public String getSubjectLecturer() { return subjectLecturer; }
    public void setSubjectLecturer(String subjectLecturer) { this.subjectLecturer = subjectLecturer; }

    public String getSubjectLocation() { return subjectLocation; }
    public void setSubjectLocation(String subjectLocation) { this.subjectLocation = subjectLocation; }
}