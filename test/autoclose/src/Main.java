public class Main {
    public static void main(String[] args) {
        A a1 = null;              // 힙에 아직 아무것도 없고 참조변수가 가르키는 번지수가 아직 없는상태
        // 객체를 동적으로 할당해야할 때가 있음. 아직 객체를 생성하지 않고 있다가 추후 동적으로 할당해줘야할 때 사용될 수 있음.
        //A a2 = new A();           // 힙에 있는 A객체의 번지수를 참조변수에 할당한 상태

        //리소스 수동 해제
        try {
            a1 = new A("리소스");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(a1.resource != null) {
                try {
                    a1.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        // 리소스 자동 해제
        try(A a2 = new A("리소스")) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class A implements AutoCloseable {
    String resource;
    A() {           // 사용자 생성자를 만들 때 꼭 기본 생성자를 만드는걸 습관화 합시다.
    }
    A(String resource) {
        this.resource = resource;
    }
    @Override
    public void close() throws Exception {
        if(resource != null) {
            resource = null;
            System.out.println("리소스가 해지되었습니다.");
        }
    }
}