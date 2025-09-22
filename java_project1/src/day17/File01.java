package day17;

import java.io.IOException;

public class File01 {

	public static void main(String[] args) {
		// File : java.io.* => try/catch를 해줘야 함.
		/*
		 * [자바 입출력 개요]
		 * 자바는 java.io 패키지를 통해 다양한 입출력 장치와 데이터를 처리함.
		 * 모든 입출력은 스트림(Stream)을 통해 이루어지며, 스트림은 단방향으로 데이터를 전달함.
		
		 * [스트림 종류]
		 * - 입력 스트림 (InputStream / Reader 계열): 외부 → 프로그램
		 * - 출력 스트림 (OutputStream / Writer 계열): 프로그램 → 외부
		
		 * [기반 스트림 (Base Stream)]
		 * - 실제 데이터를 읽고 쓰는 기능을 담당
		 * - 파일, 메모리, 키보드 등 물리적인 장치와 직접 연결됨
		 * - 예시:
		 *   - 입력: FileInputStream, FileReader
		 *   - 출력: FileOutputStream, FileWriter
		
		 * [보조 스트림 (Filter Stream)]
		 * - 기반 스트림에 기능을 추가하거나 성능을 향상시킴
		 * - 자체적으로 입출력 기능은 없고, 기반 스트림에 연결되어 동작
		 * - 예시:
		 *   - 입력: BufferedReader, DataInputStream, ObjectInputStream
		 *   - 출력: BufferedWriter, DataOutputStream, ObjectOutputStream
		
		 * [입출력 클래스 정리]
		 * - 입력 시 사용하는 클래스:
		 *   - Scanner (콘솔 입력)
		 *   - FileInputStream (바이트 기반 파일 입력)
		 *   - FileReader (문자 기반 파일 입력)
		 *   - BufferedReader (문자 기반 + 버퍼링)
		 *   - DataInputStream (기본형 데이터 입력)
		 *   - ObjectInputStream (객체 입력)
		
		 * - 출력 시 사용하는 클래스:
		 *   - System.out (콘솔 출력)
		 *   - FileOutputStream (바이트 기반 파일 출력)
		 *   - FileWriter (문자 기반 파일 출력)
		 *   - BufferedWriter (문자 기반 + 버퍼링)
		 *   - DataOutputStream (기본형 데이터 출력)
		 *   - ObjectOutputStream (객체 출력)
		
		 * [예외 처리]
		 * - 대부분의 입출력 클래스는 IOException을 발생시킬 수 있으므로
		 *   try-catch 문을 사용하여 예외를 처리해야 함.
		 */
		
		//표준 출력(모니터 = 콘솔) 스트림
		System.out.println("print");
		//표준 에러 출력 스트림
		System.err.println("error");
		
		try {
		    // 바이트 단위 입력 스트림: 한 글자 입력받음
		    int b = System.in.read();
		    System.out.println((char) b);
		} catch (IOException e) {
		    // 예외 처리: 입력 중 오류 발생 시 메시지 출력
		    System.err.println("입력 오류 발생: " + e.getMessage());
		}		
		
	}

}
