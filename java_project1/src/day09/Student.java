package day09;

import java.util.Arrays;

public class Student {
	// 학생정보를 관리하기 위한 클래스 생성
	// 학생 기본정보: 이름, 전화번호, 생년월일, 나이
	// 학원 정보 : 학원명="KOREAIT"
	// 수강과목  : 수강과목, 기간 => 0번지에 있는 수강과목은 0번지에 있는 기간하고 매칭된다고 가정.
	//        => 수강과목은 여러 과목을 들을 수 있음.[5] / 기간[5]
	
	/* ex) 홍길동 010-1111-1111, 010101, 25
	 * 	   KOREAIT, 강남지점
	 * 	   java,    	2025-08-01~2025-08-30
	 *     웹개발국비,		2025-08-26~2026-02-14
	 *	   DB, 			2025-09-15~2025-10-15     
	 *     */
	
	// 학생 기본정보 : 이름, 전화번호, 생년월일, 나이
	private String name, contact_number, birth_date;
	private int age, cnt;
	
	// 기본 생성자
	public Student() {}	
	
	// 매개변수 받는 생성자 (Overload)
	public Student(String name, String contact_number) {
		this.name = name;
		this.contact_number = contact_number;
	}	
		
	// 학원명, 수강과목, 기간
	private String academy_name = "KOREAIT";
	private String[] subject = new String[5];
	private String[] period = new String[5];
		 	
	// 수강과목 추가 : 메서드가 한 번 호출될 때마다 1개의 수강과목/기간이 추가
	public void addSubject(String subjectName, String periodName) {
		
		if(cnt == subject.length) {
			// 1씩 배열 확장 가능하도록 arraycopy 전용 변수선언
			String[] subject2 = new String[subject.length+1];
			String[] period2 = new String[period.length+1];
			
			System.arraycopy(subject,  0, subject2, 0, subject.length);
			System.arraycopy(period,  0, period2, 0, period.length);
			
			subject = subject2;
			period = period2; 
			
		}
			// 1개의 수강과목 추가
			subject[cnt] = subjectName;		
			// 1개의 기간 추가
			period[cnt] = periodName;
			
			cnt++;
			
	}
	
	public void print() {    	
		System.out.println("["+name+", "+contact_number+", "+birth_date+", "+age+"]");
		System.out.println("[신청과목 : "+Arrays.toString(subject)+"]");
		System.out.println("[신청과목 : "+Arrays.toString(period)+"]");
    }
	
	// 수강과목 취소 : 메서드가 1번 호출될 때마다 선택한 수강과목이 삭제
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAcademy_name() {
		return academy_name;
	}
	public void setAcademy_name(String academy_name) {
		this.academy_name = academy_name;
	}
	public String[] getSubjects() {
		return subject;
	}
	public void setSubjects(String[] subject) {
		this.subject = subject;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	
}
