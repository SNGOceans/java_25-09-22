package day08;

import java.util.Arrays;

public class CardPack {
	/* Card 클래스를 52장 묶은 Pack
	 * ♥A~♥K, ◆A~◆K, ♠A~♠K, ♣A~♣K
	 * - 총 카드 수 52장의 한 묶음 (배열)
	 * 
	 * 메서드()
	 * - 카드 출력 (Card => print())
	 * - 카드 섞는 기능
	 * - 카드를 한 장 빼내는 기능
	 * 
	 * 생성자
	 */
	private Card[] pack = new Card[52];
	private int idx;
	
	public CardPack(){
		String[] shapes = { "♥", "◆", "♠", "♣" };

	    for (String shape : shapes) {
	        for (int num = 1; num <= 13; num++) {
	            Card card = new Card();
	            card.setShape(shape);
	            card.setNum(num);
	            
	            pack[idx] = card;
	            idx++;
	            
	        }
	    }	    
	    
	}

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	
	public void shuffle() {
		for(int j=0; j<pack.length; j++) {
			// 교환에 필요한 랜덤 번지 추출
			int index = (int)(Math.random()*pack.length);
			
			Card tmp = pack[j];
			pack[j]=pack[index];
			pack[index] = tmp;
		}
		//System.out.println(Arrays.toString(pack));
	}
	
	public Card pick() {
	    if (idx == 0) {
	    	System.out.println("더 이상 뽑을 카드가 없습니다.");
	        return null; // 더 이상 뽑을 카드가 없음
	    }

	    int randomIndex = (int)(Math.random() * idx);
	    Card selectedCard = pack[randomIndex];

	    // 마지막 카드와 교환 후 제거
	    pack[randomIndex] = pack[idx - 1];
	    pack[idx - 1] = null;
	    idx--;

	    return selectedCard;
	}
	    
}
