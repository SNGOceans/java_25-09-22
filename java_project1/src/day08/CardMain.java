package day08;

// import java.util.Scanner;
import java.util.Arrays;

public class CardMain {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 사용자 입력 받기
//        System.out.print("카드 모양을 입력하세요 (♥, ◆, ♠, ♣ 또는 *, $): ");
//        String shape = sc.nextLine();
//
//        System.out.print("카드 숫자를 입력하세요 (1~13): ");
//        int num = sc.nextInt();
//        sc.nextLine(); // 숫자 입력 후 개행 처리
//
//        // 카드 객체 생성 (기본 생성자 사용)
//        Card card = new Card();
//
//        // setter로 값 설정 (유효성 검사 포함)
//        card.setShape(shape);
//        card.setNum(num);
//
//        // 카드 출력
//        card.print();
//
//        sc.close();
    	
    	 /* ♥A~♥K, ◆A~◆K, ♠A~♠K, ♣A~♣K
	   	 * - 총 카드 수 52장의 한 묶음 (배열)
	   	 * 
	   	 * 메서드()
	   	 * - 카드 출력 (Card => print())
	   	 * - 카드 섞는 기능
	   	 * - 카드를 한 장 빼내는 기능
	   	 * 
	   	 * 생성자
	   	 */
        
        String[] shapes = { "♥", "◆", "♠", "♣" };

        for (String shape : shapes) {
            for (int num = 1; num <= 13; num++) {
                Card card = new Card();
                card.setShape(shape);
                card.setNum(num);

                // 카드 문자열을 한 줄로 출력
                System.out.print(card.toString() + " ");
            }
            System.out.println(); // 줄 바꿈
        }
        
        CardPack p = new CardPack();
        Object[] cardpack = p.getPack();
        
        System.out.println(Arrays.toString(cardpack));
        
        //1~52까지 섞음 => 랜덤수를 생성해서 1~52까지 (겹치지 않게) 
        p.shuffle();
        System.out.println(Arrays.toString(cardpack));
        
        Object[] players = new Object[8];
        
        for(int i=0; i<players.length; i++) {
        	players[i]=p.pick();
        	System.out.println("player"+(i+1)+"의 "+"첫 카드는 : "+players[i]+"입니다.");
        }
        
    }
    
}
