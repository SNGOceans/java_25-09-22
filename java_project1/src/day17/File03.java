package day17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File03 {

	public static void main(String[] args) throws IOException {
		// 파일 읽기
		// 보조 스트림 사용 BufferedReader (FileReader)
		// 글자 단위가 아닌, 라인 단위로 읽기가 가능.
		// 더 이상 읽을 라인이 없으면(null) 그만 읽기.
		// 보조 스트림은 직접 읽고 쓰는 기능이 없기 때문에 기반 스트림을 매개변수로 포함.
		
		BufferedReader br = new BufferedReader(new FileReader("writer.txt"));
		while(true) {
			String line = br.readLine(); // 한 라인으로 읽어들이기
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
		br.close();
	}

}
