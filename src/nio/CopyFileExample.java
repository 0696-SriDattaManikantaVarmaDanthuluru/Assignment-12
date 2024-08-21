package nio;
import java.nio.file.*;
import java.io.IOException;


public class CopyFileExample {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("src/nio/aa.txt");
        Path targetPath = Paths.get("src/nio/ab.txt");

        try {

            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


