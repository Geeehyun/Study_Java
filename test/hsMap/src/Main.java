import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hMap1 = new HashMap<>();

        hMap1.put(2, "가나다");
        hMap1.put(1, "마바사");
        hMap1.put(3, "아자차");
        System.out.println("hMap1 : " + hMap1);

        hMap1.replace(1, "ABC");
        hMap1.replace(2, "def", "DEF");
        hMap1.replace(3, "아자차", "GHI");
        System.out.println("hMap1 : " + hMap1);

        Map<String, String> hMap2 = new HashMap<>();
//        hMap2.put("user_id","abcdefg");
//        hMap2.put("user_name","홍길동");
//        hMap2.put("user_age","20");
//        hMap2.put("user_addr","사는 곳 주소");
//        System.out.println("hMap2 : " + hMap2);

        Member member = new Member();
//        member.setUserId("abc");
//        member.getUserId();
        List<Member> members = member.getMemberList();
        for (Member m : members) {
            hMap2.put("user_id", m.userId);
        }

    }
}

class Member {
    String userId;
    String name;
    int age;
    String addr;
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }

    public List getMemberList() {
        List<Member> memberList = new ArrayList<>();
        return memberList;
    }
}