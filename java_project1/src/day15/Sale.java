package day15;

public class Sale<K, V> {
    private K menu;
    private V price;

    public Sale() {}

    public Sale(K menu, V price) {
        this.menu = menu;
        this.price = price;
    }

    public K getMenu() {
        return menu;
    }

    public V getPrice() {
        return price;
    }

    public void setMenu(K menu) {
		this.menu = menu;
	}

	public void setPrice(V price) {
		this.price = price;
	}

	@Override
    public String toString() {
        return "메뉴: " + menu + ", 가격: " + price;
    }
}
