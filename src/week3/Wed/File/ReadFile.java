package week3.Wed.File;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./a_file.txt"); //입력 스트림 생성
        char c1 = (char) reader.read();
        System.out.println(c1);
    }
}
