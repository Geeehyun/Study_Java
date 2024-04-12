import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
//        try {
//            System.out.println("try catch 기본 구문");
//            System.out.println(3/0);
//        } catch(ArithmeticException e) {         // 작은 에러부터 확인해야 함.
//            System.out.println(e.getMessage());   //시스템이 보내는 메시지 확인
//        } catch(Exception e) {
//            System.out.println("숫자는 0으로 나눌 수 없습니다.");
//            System.out.println(e.getMessage());   //시스템이 보내는 메시지 확인
//        } finally {
//            System.out.println("프로그램 종료");
//        }

        // try with resource
//        try(InputStreamReader isr = new InputStreamReader(System.in)) {  //이 포맷 잊지말기
//            char input = (char) isr.read();
//            System.out.println("입력 문자 : " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//
//        }

        // 기본구조
        InputStreamReader isr2 = null;
        try {
            isr2 = new InputStreamReader(System.in);
            char input = (char) isr2.read();
        } catch (IOException e) {
            //throw new RuntimeException(e);       //예외전가 - 이 부분을 호출한 바로 상위 메서드 = main() 근데 여기도 예외처리 없음 위로 쭉쭉 이동
            e.printStackTrace();
        } catch (Exception e) {                   // Exceptiㅐn e의 경우 습관적으로 마지막에 꼭 적어주도록 하자

        } finally {
            if(isr2 != null) {
                try {
                    isr2.close();               // 닫아야함. 아니면 계속 메모리가 누수되서 프로그램을 껐다켜는 수 밖에 없음.
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}