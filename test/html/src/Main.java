import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File myHtml = new File("C:\\Users\\wkdwl\\OneDrive\\java4\\html_prj\\home.html");
        try(
                Reader rd = new FileReader(myHtml);
                BufferedReader br = new BufferedReader(rd)
                ) {
            String data;
            StringBuilder bs = new StringBuilder();
            while ((data = br.readLine()) != null) {
                bs.append(data);
//                System.out.println(data);
            }
            System.out.println(bs);

            StringBuilder tempStr = new StringBuilder();
            tempStr.append(bs.substring(bs.indexOf("<body>"), bs.lastIndexOf("</body>")));

            System.out.println(tempStr);

        } catch (IOException e) {

        }
    }
}