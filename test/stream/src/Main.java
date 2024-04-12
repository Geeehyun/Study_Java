import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\wkdwl\\OneDrive\\java4\\JAVA\\Temp\\infile.txt");
//        try {
//            if(!file1.exists()) {
//                file1.createNewFile();
//            }
//            InputStream fis = new FileInputStream(file1);
//            int data;
//            while (((data = fis.read()) != -1)) {
//                System.out.println("읽은 데이터 : " + (char)data + " 남은 비트수 : " + fis.available());
//                //byte 단위로 읽어오면서 한글이 다 깨짐
//            }
//            fis.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        try {
            InputStream fis1 = new FileInputStream(file1);
            int data;
            while ((data = fis1.read()) != -1) {
                System.out.println((char) data);
            }
            fis1.close();
        } catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }

        System.out.println("\n\n");

        try {
            InputStream fis2 = new FileInputStream(file1);
            byte[] byteArr = new byte[6];
            int count1;
            while ((count1 = fis2.read(byteArr))!= -1) {
                System.out.println("byteArr : " + Arrays.toString(byteArr));
                for(int i = 0; i < count1; i++) {
                    System.out.print((char) byteArr[i]);
                }
                System.out.println();
                System.out.println("count1 :" + count1);
            }
            fis2.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n\n");

        try {
            InputStream fis3 = new FileInputStream(file1);
            byte[] byteArr3 = new byte[9];
            int offset = 3; //처음 3개는 아무것도 없는 문자 나옴
            int len = 6; // 오프셋 이후 지정한 길이만큼 읽어옴
            int count2 = fis3.read(byteArr3, offset, len);
            for(int i = 0; i < offset+count2; i++) {     //"i < offset+count2" 오프셋 길이 + 우리가 읽어들인 개수를 출력해주기 위함
                System.out.println((char) byteArr3[i]);
            }
            fis3.close();           //자원을 항상 반납해야함.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}