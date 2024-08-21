package nio;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;

public class WriteFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\java_prac\\Assignment-12\\src\\nio\\ab.txt");
        List<String> lines = Arrays.asList("First line", "Second line", "Third line");

        try {
            Files.write(path, lines, StandardOpenOption.CREATE);

            Files.write(path, Arrays.asList("Fourth line"), StandardOpenOption.APPEND);
            Stream<String> line = Files.lines(path);
            line.forEach(System.out::println);
            line.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
