package day08;

public class Card {

    /* 숫자 : 1(A)~10, J(11), Q(12), K(13)
     * 모양 : ♥, ◆, ♠, ♣
     * ex) ♥1, ♣J, *13 => ♥K, $20 => ♥A
     * 해당 범위가 벗어나는 숫자는 무조건 1
     * 해당 범위에 벗어나는 모양은 ♥
     * 
     * - 멤버변수 : 숫자(num), 모양(shape)
     * - toString
     * - 생성자 => 기본생성자만 => ♥1
     * - print()
     *   => A(1), J(11), Q(12), K(13)
     */

    private int num;
    private String shape;

    // 기본 생성자: ♥1로 초기화
    public Card() {
        this.num = 1;
        this.shape = "♥";
    }

    // 숫자 setter: 유효성 검사 포함
    public void setNum(int num) {
        if (num < 1 || num > 13) {
            this.num = 1;
        } else {
            this.num = num;
        }
    }

    // 모양 setter: 유효성 검사 포함
    public void setShape(String shape) {
        switch (shape) {
            case "♥":
            case "◆":
            case "♠":
            case "♣":
                this.shape = shape;
                break;
            default:
                this.shape = "♥";
                break;
        }
    }

    // 숫자 getter
    public int getNum() {
        return this.num;
    }

    // 모양 getter
    public String getShape() {
        return this.shape;
    }

    // 카드 정보 출력
    public void print() {
        switch (num) {
            case 1:
                System.out.println(shape + "A");
                break;
            case 11:
                System.out.println(shape + "J");
                break;
            case 12:
                System.out.println(shape + "Q");
                break;
            case 13:
                System.out.println(shape + "K");
                break;
            default:
                System.out.println(shape + num);
                break;
        }
    }

    // 카드 정보 문자열 반환
    @Override
    public String toString() {
        switch (num) {
            case 1:
                return shape + "A";
            case 11:
                return shape + "J";
            case 12:
                return shape + "Q";
            case 13:
                return shape + "K";
            default:
                return shape + num;
        }
    }
}