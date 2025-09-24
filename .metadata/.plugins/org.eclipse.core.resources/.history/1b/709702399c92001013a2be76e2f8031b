package day16;

public class InnerClass01 {

	public static void main(String[] args) {
		// InnerClass : 내부 클래스
		/* 클래스 내부에 선언한 클래스
		 * 외부 클래스가 쓰려고 직접 선언하는 경우가 많고, 다른 클래스에서
		 * 해당 내부 클래스를 사용할 일이 없고, 외부 클래스만이 사용하려고 할 때.
		 * - 중첩 클래스라고도 함.
		 * 
		 * 내부적으로 활용할 경우, 클래스를 private로 선언하고 사용하는 것을 권장.
		 * 내부 클래스는 외부 클래스가 생성된 후 생성 됨.
		 * 
		 * private이 아닌 내부 클래스는 외부에서 접근 가능함.
		 * */
		System.out.println("--OutClass 내 usingClass 사용, InTest 간접 접근--");
		OuterClass outclass = new OuterClass();
		outclass.usingClass();
		
		System.out.println("\n--직접 InTest에 접근--");		
		OuterClass.InnerClass inclass = outclass.new InnerClass();
		inclass.inTest();
		
		//getter/setter 생성 후
		System.out.println("\n--getter로 InTest 접근--");
        OuterClass.InnerClass innerViaGetter = outclass.getInClass();
        innerViaGetter.inTest();
	}

}

class OuterClass {
	private int num = 10;
	private static int sNum = 20;
	private InnerClass inClass;
	
	public OuterClass() {
		inClass = new InnerClass();
	}
	
	class InnerClass {
		int inNum = 100;
//		static int sinNum = 200; // 에러가 남. InClass 안에서 static은 불가능하다.
		
		void inTest() {
			System.out.println("OutClass의 num = "+num);
			System.out.println("OutClass의 num = "+sNum);
			System.out.println("OutClass의 num = "+inNum);
		}
		
	}
	
	// InClass를 사용하기 위한 내부 메서드
	public void usingClass() {
		inClass.inTest();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static int getsNum() {
		return sNum;
	}

	public static void setsNum(int sNum) {
		OuterClass.sNum = sNum;
	}

	public InnerClass getInClass() {
		return inClass;
	}

	public void setInClass(InnerClass inClass) {
		this.inClass = inClass;
	}
}