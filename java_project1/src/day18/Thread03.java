package day18;

public class Thread03 {

    public static void main(String[] args) {
        long mainStart = System.currentTimeMillis(); // 전체 시작 시간

        System.out.println(Thread.currentThread().getName());
        System.out.println("main Thread start");

        MyThread3 th1 = new MyThread3(1, 50);
        Thread t1 = new Thread(th1);
        long startTime1 = System.currentTimeMillis();
        t1.start();

        try {
            t1.join();
            Thread.sleep(1000);
            long endTime1 = System.currentTimeMillis();
            System.out.println("1-50 = " + th1.getTotal());
            System.out.println("Thread-0 실행 시간: " + (endTime1 - startTime1) + "ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyThread3 th2 = new MyThread3(51, 100);
        Thread t2 = new Thread(th2);
        long startTime2 = System.currentTimeMillis();
        t2.start();

        try {
            t2.join();
            Thread.sleep(1000);
            long endTime2 = System.currentTimeMillis();
            System.out.println("51-100 = " + th2.getTotal());
            System.out.println("Thread-1 실행 시간: " + (endTime2 - startTime2) + "ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int finalTotal = th1.getTotal() + th2.getTotal();
        System.out.println("main Thread end~!!");
        System.out.println("1-100 = " + finalTotal);

        long mainEnd = System.currentTimeMillis(); // 전체 종료 시간
        System.out.println("> main 전체 실행 시간: " + (mainEnd - mainStart) + "ms");
    }
}


class MyThread3 implements Runnable{
	private int start;
	private int end;
	private int total;

	@Override
	public void run() {
		//start부터 end까지 반복 출력하는 구문 실행
		for(int i=this.start; i<=this.end; i++) {
			this.total += i; 
		}		
	}
	
	public MyThread3() {};
	public MyThread3(int start, int end) {
		this.start = start;
		this.end = end;
		this.total = 0;
	}
	
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}