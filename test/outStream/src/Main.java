import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. 파일 객체 생성
        File file1 = new File("C:\\Users\\wkdwl\\OneDrive\\java4\\JAVA\\Temp\\stream.txt");

        //2. 파일 객체를 OutputStream을 이용하여 파일 내용을 출력하는 스트림 객체 생성
        //3. 스트림 객체에 Writer 객체를 이용하여 저장
        try(
                OutputStream os = new FileOutputStream(file1, false);
                //두번째 인자가 false이거나 미입력 시 모든 내용 덮어쓰기 , true일 경우 기존 내용에 추가하는 개념
                OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
        ) {

            osw.write("OutputStreamWriter 예제\n");
            osw.write("한글 ENG 모두 포함");
            osw.write("엔터를 포함하지 않았어요");
            osw.write("\n");
            osw.write("Hello Java\n\n");
            osw.flush();
        } catch(IOException e ) {

        } catch(Exception e) {

        }
    }
}