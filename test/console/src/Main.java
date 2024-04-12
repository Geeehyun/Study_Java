import java.io.IOException;
import java.io.OutputStreamWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(System.out,"UTF-8");
            osw.write("System.out 테스트");
            osw.write("출력 대상이 콘솔 입니다.");
            osw.write("\n\n");
            osw.write("출력을 완료합니다.");
            osw.flush();
            System.out.println(osw.getEncoding());   //현재 인코딩 값 출력
        } catch (IOException e) {

        }
    }
}