import java.io.*;


public class Main {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\wkdwl\\OneDrive\\java4\\JAVA\\Temp\\steam.txt");

        try(
                Writer writer = new FileWriter(file1);
                BufferedWriter bw = new BufferedWriter(writer)
                ) {
            bw.write("안녕하세요\n");
            bw.write("Hello Java\n");
            bw.write("\n");
            bw.write("\n");

        } catch (IOException e) {

        }

        try(
                Reader rd = new FileReader(file1);
                BufferedReader br = new BufferedReader(rd);
        ) {
           String data;
           while ((data = br.readLine())!= null) {           //readLine 줄 단위로 읽어옴.
               System.out.println(data);
           }
        } catch (IOException e) {

        }

        File file2 = new File("C:\\Users\\wkdwl\\OneDrive\\java4\\JAVA\\Temp\\print.txt");

        try(
                PrintWriter pw = new PrintWriter(file2);
                ) {
            pw.println("PrintWriter 예제");
            pw.println(13);
            pw.println(15.8);
            pw.printf("%d", 7);
            pw.printf("%s %f","자바",3.14);

        } catch (IOException e) {

        } catch (Exception e) {

        }
    }
}