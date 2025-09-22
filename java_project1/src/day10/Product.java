package day10;

public class Product {
	private String name = "미에로화이바";
	private int price;
	                      
	{
		this.name = "콜라";
		this.price = 1000;
	}
	
	// 매개변수 생성자
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 상품 추가용 insertProduct 함수
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	
	
	@Override
	public String toString() {
	    return "상품명: " + name + ", 가격: " + price;
	}
}

class Order extends Product {
    private int count; // 주문 수량

    //public Order() {};
    
    public Order(String name, int price, int count) {
        super(name, price);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public int getTotal() {
        return getPrice() * count;
    }

    public void setCount(int count) {
		this.count = count;
	}

	@Override
    public String toString() {
        return "상품명: " + super.getName() + ", 가격: " + super.getPrice() +
               ", 수량: " + this.count + ", 총액: " + getTotal();
    }
}