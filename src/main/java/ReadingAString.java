import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingAString {
    public void readingString() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\admin\\IdeaProjects\\Lesson6\\src\\main\\java\\fileForRead.txt"));
            String value = in.readLine();
            while (value != null) {
                int numberCharacters = value.length();
                System.out.println(value + " " + numberCharacters);
                value=in.readLine();
            }
        } catch (IOException e) {
        }
    }
}
