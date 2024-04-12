import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        File kofile = new File("C:\\Users\\wkdwl\\OneDrive\\java4\\JAVA\\Temp\\kofile.txt");
        try {
            InputStream fsi1 = new FileInputStream(kofile);
            byte[] byteArr = new byte[8];
            int count1;
            while ((count1 = fsi1.read(byteArr)) != -1) {
                String str = new String(byteArr, 0, count1, Charset.forName("UTF-8"));
                //UTF-8로 변환했지만 그래도 깨짐 따라서 "reader"로 한글을 읽어들이는게 좋음.
                System.out.println("한글 출력 : " + str);
                System.out.println(" : count1 =" + count1);
            }
            fsi1.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}