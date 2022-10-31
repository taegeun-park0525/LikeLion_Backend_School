package week3.Wed.File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExercise {
    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files) {
            System.out.println(file);
        }

    }

    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    public String read2Chars(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }
    public static void main(String[] args) throws IOException {
        //FileNotFoundException -> 파일이 없을때 발생하는 Exception
        //FileReader reader = new FileReader("./a_file.txt"); // [./] 현재 디렉토리
        FileReaderExercise fileReaderExercise = new FileReaderExercise();
        char c = fileReaderExercise.readAChar("a_file.txt");
        String str = fileReaderExercise.read2Chars("a_file.txt");

        System.out.println(c);
        System.out.println(str);
    }
    /*
        출력결과 아래출력결과를 루트 디렉토리라고함.
        .\.git
        .\.gitignore
        .\.idea
        .\a_file.txt
        .\JavaExercise.iml
        .\out
        .\Readme.md
        .\src
        */
}
