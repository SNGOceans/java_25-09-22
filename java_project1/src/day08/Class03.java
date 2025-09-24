package day08;

public class Class03 {

    public static void main(String[] args) {
        // Car 객체 생성 시 생성자를 통해 초기값 설정
        Car t = new Car("카니발", "검정", 2025); // 생성자 사용
        
        t.power();      // 시동 켜기
        t.print();      // 현재 상태 출력
        
        for(int i = 0; i < 6; i++) {
            t.speedUP(); // 속도 증가
        }
        
        for(int i = 0; i < 10; i++) {
            t.speedDown(); // 속도 감소
        }
        
        t.power();      // 시동 끄기
        t.print();      // 현재 상태 출력
                
        System.out.println(t.toString()); // 전체 정보 출력
    }
}

class Car {
    // 멤버변수 : 차량의 속성 정보 (외부에서 직접 접근하지 못하도록 private 설정)
    private String name;    
    private String color;
    private int year;
    private boolean power;
    private double speed;
    
    // 생성자(Constructor)
    /* 생성자는 객체가 생성될 때 자동으로 호출되는 특수한 메서드
     * 목적: 객체의 초기 상태를 설정
     * 특징:
     * - 클래스 이름과 동일한 이름을 가짐
     * - 반환 타입이 없음 (void도 쓰지 않음)
     * - 오버로딩 가능 (매개변수 개수나 타입이 다르면 여러 개 정의 가능)
     * 아래 생성자는 name, color, year를 초기화하고
     * power는 꺼짐(false), speed는 0.0으로 기본 설정
     */
    public Car(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.power = false; // 시동 꺼짐 상태로 초기화
        this.speed = 0.0;   // 정지 상태로 초기화
    }
         
    // 객체의 정보를 문자열로 반환하는 메서드 (디버깅이나 출력용)
    @Override
    public String toString() {
        return "Car [name=" + name + ", color=" + color + ", year=" + year + ", power=" + power + ", speed=" + speed + "]";
    }
    
    // 시동 켜기 / 끄기 메서드
    // 현재 시동 상태에 따라 반대 동작 수행
    public void power() {
        if (power) { // 시동이 켜져 있으면
            if (speed > 0) {
                warningprint(); // 속도가 있으면 시동 끌 수 없음
            } else {
                power = false; // 속도가 0일 때만 시동 끌 수 있음
            }
        } else {
            power = true; // 시동이 꺼져 있으면 켜기
        }
    }
    
    // 현재 시동 상태와 속도 출력
    public void print() {
        System.out.println((power ? "ON" : "OFF") + " / " + speed);
    }
    
    // 시동이 꺼져 있을 때 출력되는 경고 메시지
    public void powerFalsePrint() {
        System.out.println("시동이 꺼져있습니다. \n시동을 켜주세요.");
    }
    
    // 시동을 끄기 전에 속도를 줄이라는 경고 메시지
    public void warningprint() {
        System.out.println("시동을 끄기 전에 차를 멈추세요.");
    }
    
    // 속도 증가 메서드
    // 시동이 켜져 있을 때만 작동하며 최대 속도는 100
    public void speedUP() {
        if (power) {
            if (speed >= 100) {
                speed = 100;
            } else {
                speed += 20;
            }
        } else {
            powerFalsePrint(); // 시동 꺼져 있으면 경고 출력
        }
        print();
    }
    
    // 속도 감소 메서드
    // 시동이 켜져 있을 때만 작동하며 최소 속도는 0
    public void speedDown() {
        if (power) {
            if (speed <= 0) {
                speed = 0;
            } else {
                speed -= 10;
            }
        } else {
            powerFalsePrint(); // 시동 꺼져 있으면 경고 출력
        }
        print();
    }
    
    // getter 메서드 : 외부에서 멤버변수 값을 읽을 수 있도록 제공
    public String getName() {
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public int getYear() {
        return this.year;
    }
    public boolean getPower() {
        return this.power;
    }
    public double getSpeed() {
        return this.speed;
    }
    
    // setter 메서드 : 외부에서 멤버변수 값을 변경할 수 있도록 제공
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPower(boolean power) {
        this.power = power;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
