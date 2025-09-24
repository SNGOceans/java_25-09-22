package day17;

import java.io.FileWriter;
import java.io.IOException;

public class File04 {

    public static void main(String[] args) throws IOException {

        // 문자 기반 출력 스트림
        String fileName = "D:\\web_0826_PJH\\memo\\text.txt";
        FileWriter fw3 = new FileWriter(fileName);

        for (int i = 1; i <= 10; i++) {
            String data = i + ". test!!\n";
            fw3.write(data);
        }
        fw3.close();

        System.out.println("파일 출력 완료");

    }
}
