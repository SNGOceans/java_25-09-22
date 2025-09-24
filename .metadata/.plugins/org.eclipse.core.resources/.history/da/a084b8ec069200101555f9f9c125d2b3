package day15;

public class Generics {

	public static void main(String[] args) {
		// 제니릭(Generics) : 데이터 타입을 나중에 확정하는 기법
		/* 클래스나 메서드를 생성할 때 어떤 데이터가 들어올지에 대한 확신이 없다면...
		 * 제네릭 타입으로 구현 => 나중에 객체를 생성할 때 타입을 확정하여 구현
		 * 
		 * 객체의 타입을 compile할 때 체크가 가능하여 타입의 안정성을 해치지 않는 선에서 적당히 형변환 가능함.
		 * 안정성 - 의도하지 않은 타입의 객체가 저장되는 것을 막는 의미.
		 * 
		 * T: Type, E: Element, K: Key, V: Value
		 */
		
		GenericPrinter<Powder> powderPrint = new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());
		
		System.out.println(powderPrint);
		
		GenericPrinter<Plastic> plasticPrint = new GenericPrinter<Plastic>();
		plasticPrint.setMaterial(new Plastic());
		
		System.out.println(plasticPrint);
		//	List<E> list = new ArrayList<E>();
		//	Map<K,V> map = new HashMap<>();
		
		String s = "abc";
		System.out.println(s.getClass());
		
	}
}

class GenericPrinter<T>{
	private T material; // T 자료형으로 선언한 멤버변수

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}	
}

class Powder{
	public String toString() {
		return "재료는 Powder 입니다.";
	}
}

class Plastic{
	public String toString() {
		return "재료는 Plastic 입니다.";
	}
}
