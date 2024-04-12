import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] arg) {
        File file1 = new File("C:Users\\wkdwl\\OneDrive\\java4\\JAVA\\test\\test.txt");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
                System.out.println("file1 created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.println("Absolute Path : " + file1.getAbsolutePath());
            System.out.println("Parent Path : " + file1.getParent());
            System.out.println("Name : " + file1.getName());
            System.out.println("Path : " + file1.getPath());
            System.out.println("Cannonical Path : " + file1.getCanonicalPath());
            System.out.println("total space : " + file1.getTotalSpace());
            System.out.println("Free space : " + file1.getFreeSpace());
            System.out.println("Usable space : " + file1.getUsableSpace());
            System.out.println("listFiles  : " + file1.listFiles());
            System.out.println("list : " + file1.list());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}