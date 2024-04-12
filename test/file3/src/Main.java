import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String tempDir = "C:\\Users\\wkdwl\\OneDrive\\java4\\JAVA\\Temp";
        String tempFile = tempDir + "\\temp.txt";
        File dir1 = new File(tempDir);
        File file1 = new File(tempFile);
        try {
            if(!dir1.exists()) {
                dir1.mkdir();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if(! file1.exists()) {
                file1.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("tempDir : " + tempDir);
            System.out.println("Absolute Path : " + file1.getAbsolutePath());
            System.out.println("is Directory : " + file1.isDirectory());
            System.out.println("is File : " + file1.isFile());
            System.out.println("Name : " + file1.getName());
            System.out.println("Parent : " + file1.getParent());
        } catch (Exception e) {

        }
    }
}