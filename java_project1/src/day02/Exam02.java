package day02;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수 2개와 연산자 1개를 입력받아, 두 정수를 그 연산자로 연산한 결과를 출력
		 * +, -, *, /, % 연산자와 다른 종류의 특수문자가 들어오면 잘못된 연산자로 출력.
		 * ex) 내가, 2, 3, + => 2+3 = 5가 출력되도록.
		 * ex) 3, 2, - => 3-2 =1
		 * ex) 3 2 ! => 잘못된 연산자.
		 * ex) 피연산자가 0일 수 없음. -> 문구 출력.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개와 연산자를 순서대로 입력> (2 3 +)");

        System.out.print("첫 번째 정수 입력: ");
        int num1 = scan.nextInt();
        
        System.out.print("연산자 입력 (+, -, *, /, %): ");
        String operator = scan.next();
        
        System.out.print("두 번째 정수 입력: ");
        int num2 = scan.nextInt();        

//        switch (operator) {
//            case "+":
//                System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
//                break;
//            case "-":
//                System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
//                break;
//            case "*":
//                System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
//                break;
//            case "/":
//            	if (num2!=0) {
//                System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
//            	} else {
//            		System.out.println("0으로 나눌 수 없습니다.");
//            	}
//                break;
//            case "%":
//                System.out.println(num1 + "%" + num2 + " = " + (num1 % num2));
//                break; 
//            default:
//                System.out.println("잘못된 연산자입니다.");
//        }
       
//        if (operator.equals("+")) {
//            System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
//        } else if (operator.equals("-")) {
//            System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
//        } else if (operator.equals("*")) {
//            System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
//        } else if (operator.equals("/")) {
//            if (num2 != 0) {
//                System.out.println(num1 + "/" + num2 + " = " + ((double)(num1) / num2));
//            } else {
//                System.out.println("0으로 나눌 수 없습니다.");
//            }
//        } else if (operator.equals("%")) {
//            System.out.println(num1 + "%" + num2 + " = " + (num1 % num2));
//        } else { 
//            System.out.println("잘못된 연산자입니다.");
//        }
	}

}
