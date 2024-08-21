package nio;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class ReadFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\java_prac\\Assignment-12\\src\\nio\\aa.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
