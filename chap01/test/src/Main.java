import java.util.*;
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> TMap = new TreeMap<Integer, String>();
        TMap.put(2, "바보");        // Map에서는 데이터 추가 메서드 put
        TMap.put(1, "멍청이");
        TMap.put(2, "말미잘");      // key 중복으로 기존 key의 value값이 변경 됨
        TMap.put(3, "멍청이");      // key만 다르면, value는 중복되도 상관 없음
        System.out.println(TMap); // 출력 : {1=멍청이, 2=말미잘, 3=멍청이}
    }
}