package day11;

public class Extra {

	public static void main(String[] args) {
		// 추상클래스 : 미완성 클래스, 
		/* 추상클래스 / 추상메서드
		 * 추상메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 추상클래스 : 추상 메서드를 포함하는 메서드
		 * 추상크래스 : 추상 메서드 + 일반 메서드 + 멤버변수 + 상수
		 * 미완성 클래스이기 때문에 객체를 생성할 수 없음.
		 * 
		 * 추상 메서드의 키워드 : abstract
		 * abstract 클래스명 / abstract 메서드명
		 * 
		 * abstract 리턴타입 메서드명(매개변수); => 추상 메서드
		 * - 추상클래스를 상속받는다면 추상메서드는 반드시 구현해줘야 함.
		 * - 상속을 하기 위한 부모클래스를 만들기 위해서 사용한다.
		 * 
		 * 인터페이스(interface) : 추상 메서드만 있음. abstract 키워드를 안써도 됨.
		 * 
		 * */
		
		//Dog 객체 생성 후 출력
		//Cat 객체 생성 후 출력
		// 강아지 객체 생성
        Dog dog = new Dog("바둑이", "강아지");
        dog.printInfo();      // 이름과 종 출력
        dog.howl();           // 울음소리 출력
        dog.eating("고기");           // 울음소리 출력
        
        // 고양이 객체 생성
        Cat cat = new Cat("야옹이", "고양이");
        cat.printInfo();      // 이름과 종 출력
        cat.howl();           // 울음소리 출력
        cat.eating("츄르");           // 울음소리 출력

	}

}

class Dog extends Animal{
	private String eat;
	
	//생성자
	public Dog(String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	@Override
	public void howl() {
		System.out.println(name+"의 울음소리 멍멍!!");	
	}
	
	// 자식 메서드 구현
	public void eating(String eat) {
		this.eat = eat;
		System.out.println(name+"은"+eat+"를 좋아합니다.");
	}
}

class Cat extends Animal{
	private String eat;
	
	//생성자
	public Cat(String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	@Override
	public void howl() {
		System.out.println(name+"의 울음소리 야옹!!");	
	}
	
	// 자식 메서드 구현
	public void eating(String eat) {
		this.eat = eat;
		System.out.println(name+"은"+eat+"를 좋아합니다.");
	}
}

// abstract 추상클래스
abstract class Animal {
	protected String name;
	protected String category;
	
	public void printInfo() {
		System.out.println("이름:"+name+" / "+"종:"+category);
	}
	
	//추상메서드
	public abstract void howl();
		
}