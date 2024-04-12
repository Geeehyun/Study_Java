import javax.imageio.IIOException;
import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        File kofile = new File("C:\\Users\\wkdwl\\OneDrive\\java4\\JAVA\\Temp\\kofile.txt");

        try(Reader reader = new FileReader(kofile)) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File rwfile = new File("C:\\Users\\wkdwl\\OneDrive\\java4\\JAVA\\Temp\\rwfile.txt");
        try(Writer wr = new FileWriter(rwfile)) {
            wr.write("무궁화 꽃이\n".toCharArray());
            wr.write("Hello\n");
            wr.write("\n");
            wr.write("\n");
            wr.write("Java");
            wr.flush();        //메모리상 작성되었던 내용을 파일로 내림
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(Reader rd = new FileReader(rwfile)) {
            int data;
            while ((data = rd.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}