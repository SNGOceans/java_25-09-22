package day08;

import java.util.ArrayList;

public class ClassEx01 {

    public static void main(String[] args) {
        TV myTV = new TV("삼성");
        myTV.power(); // 전원 ON

        // 채널 5번 증가 후 등록
        for (int i = 0; i < 5; i++) {
            myTV.chUP();
        }
        myTV.pick(); // 채널 6번 등록

        // 채널 3번 더 증가 후 등록
        for (int i = 0; i < 3; i++) {
            myTV.chUP();
        }
        myTV.pick(); // 채널 9번 등록

        // 볼륨 3번 감소
        for (int i = 0; i < 3; i++) {
            myTV.volDown();
        }

        myTV.print(); // 현재 상태 출력
        myTV.favorprint(); // 선호채널 출력

        // 채널 22번 증가 → 순환 구조 확인용
        for (int i = 0; i < 22; i++) {
            myTV.chUP();
        }
        myTV.pick(); // 순환된 채널 등록
        myTV.favorprint();

        // 볼륨 15번 증가 → 최대값 제한 확인용
        for (int i = 0; i < 15; i++) {
            myTV.volUp();
        }
        myTV.print();

        // 선호채널 5개 초과 등록 테스트
        for (int i = 0; i < 5; i++) {
            myTV.chUP();
            myTV.pick();
        }
        myTV.favorprint(); // 가장 오래된 채널 제거 확인

        myTV.power(); // 전원 OFF
        myTV.print();
    }
}

class TV {
    private String brand;
    private boolean power;
    private int ch;
    private int vol;

    // 동적 배열로 선호채널 관리
    private ArrayList<Integer> favor = new ArrayList<>();

    public TV(String brand) {
        this.brand = brand;
        this.power = false;
        this.ch = 1;
        this.vol = 3;
    }

    // 선호채널 등록 (최신 5개 유지)
    public void pick() {
        if (favor.size() == 5) {
            favor.remove(0); // 가장 오래된 채널 제거
        }
        favor.add(ch);
        System.out.println(ch + "번을 선호채널로 등록합니다.");
    }

    // 선호채널 출력
    public void favorprint() {
        System.out.println("선호채널 목록 (" + favor.size() + "개 등록됨)");
        for (int i = 0; i < favor.size(); i++) {
            System.out.println((i + 1) + ". " + favor.get(i) + "번");
        }
    }

    // 전원 ON/OFF 토글
    public void power() {
        power = !power;
        System.out.println("전원 " + (power ? "ON" : "OFF"));
    }

    // 채널 증가 (0~20 순환)
    public void chUP() {
        if (power) {
            ch = (ch + 1) % 21;
        } else {
            powerFalsePrint();
        }
    }

    // 채널 감소 (0~20 순환)
    public void chDown() {
        if (power) {
            ch = (ch - 1 + 21) % 21;
        } else {
            powerFalsePrint();
        }
    }

    // 볼륨 증가 (최대 10)
    public void volUp() {
        if (power) {
            if (vol < 10) vol++;
        } else {
            powerFalsePrint();
        }
    }

    // 볼륨 감소 (최소 0)
    public void volDown() {
        if (power) {
            if (vol > 0) vol--;
            else {
                System.out.println("음소거입니다.");
            }
        } else {
            powerFalsePrint();
        }
    }

    // 현재 상태 출력
    public void print() {
        System.out.println("[" + brand + "] " + (power ? "ON" : "OFF") + " / 채널: " + ch + " / 볼륨: " + vol);
    }

    // 전원 꺼짐 경고 출력
    public void powerFalsePrint() {
        System.out.println("전원이 꺼져 있습니다. 먼저 전원을 켜주세요.");
    }
    
}