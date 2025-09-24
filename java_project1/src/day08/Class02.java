package day08;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.setX(10);
		t.setY(20);
//		System.out.println("("+t.getX()+", "+t.getY()+")");
		System.out.println(t.toString());
	}

}

class Test{
	private int x;
	private int y;
	
	//getter
	 public int getX(){
		 return this.x;
	 }
	 public int getY() {
		 return this.y;
	 }
	 //setter
	 public void setX(int x) {
		 this.x = x;
	 }
	 public void setY(int y) {
		 this.y = y;
	 }
	 
	// toString()
	 public String toString() {
		 return "("+x+", "+y+")";
	 }
}