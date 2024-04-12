public class Main {
    public static void main(String[] args) {
        // type1 익명이너클래스
        A a1 = new A() {
            @Override
            public void abc() {
                System.out.println("=====================");
                System.out.println("a1 >>> abc() : ");
                B b = new B();
                b.bcd();
                System.out.println("a1 >>> bcd() : ");
                System.out.println("=====================");
            }
        };
        // type2 람다식
        A a2 = () -> {
            System.out.println("----------------------");
            System.out.println("a2 >>> abc() : ");
            B b = new B();
            b.bcd();
            System.out.println("a2 >>> bcd() : ");
            System.out.println("----------------------");
        };
        // 인스턴스 참조 type 1 표현
        B b = new B();
        A a3 = b::bcd;
        // 실행
        a1.abc();
        a2.abc();
        a3.abc();

        System.out.println("new B() : ");
        System.out.println("a1 >>> abc() : ");
        System.out.println("a2 >>> abc() : ");
        System.out.println("a3 >>> abc() : ");
    }
}
interface A {
    void abc();
}
class B {
    void bcd() {
        System.out.println("메서드 bcd");
    }
}