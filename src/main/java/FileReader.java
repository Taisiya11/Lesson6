import java.io.*;

public class FileReader {
    public void readingFile(){
        try {BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\admin\\IdeaProjects\\Lesson6\\src\\main\\java\\fileForRead.txt"),"UTF-8"));
            String value = reader.readLine();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\admin\\IdeaProjects\\Lesson6\\src\\main\\java\\fileForWrite.txt"),"windows-1251"));
            writer.write(value);
            reader.close();
            writer.close();
        }
        catch (Exception e){
        }
        finally {

        }
    }
}
