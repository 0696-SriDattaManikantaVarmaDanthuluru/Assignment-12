package nio;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;


public class DeleteFileExample {
    public static void main(String[] args) {
        Path path = Paths.get("src/nio/del.txt");

        try {
            Files.delete(path);
            System.out.println("File deleted successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
