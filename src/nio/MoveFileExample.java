package nio;
import java.nio.file.*;
import java.io.IOException;


public class MoveFileExample {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/nio/aa.txt");
        Path targetPath = Paths.get("src/nio/mov.txt");

        try {
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved/renamed successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
