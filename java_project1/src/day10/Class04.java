package day10;

public class Class04 {

	public static void main(String[] args) {
		/* 객체 생성 시 값을 초기화하는 방법
		 * - 기본값, 명시적 초깃값, 초기화 블럭, 생성자
		 * 1. 기본값 : 멤버변수 선언 시 기본적으로 주는 값 int =0; String = null
		 * 2. 명시적 초깃값 : 기본값을 직접 명시하여 주는 값
		 *   brand = "LG"
		 * 3. 초기화 블럭 : {초깃값 지정} => 멤버변수의 초기화
		 * 4. 생성자 : 객체를 생성할 때 호출하여 초깃값을 지정
		 * 5. 초깃값 우선순위
		 * 기본값 > 명시적 초깃값 > 초기화블럭 > 생성자(가장 우선순위가 높음.)
		 */
	}

}

class Student{
	private String gigum="강남"; // 명시적 초깃값
	private String name;
	private int age;
	
	{
		this.gigum = "수원";
		this.name = "미정";
		this.age = 20;
	}
	
	public Student(String gigum, String name, int age) {
		this.gigum = gigum;
		this.name = name;
		this.age = age;
	}
}
