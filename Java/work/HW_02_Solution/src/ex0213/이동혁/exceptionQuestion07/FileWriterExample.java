package ex0213.이동혁.exceptionQuestion07;

import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("file.txt");
            fw.write("Java");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
