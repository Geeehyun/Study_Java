public class Main {
    public static void main(String[] args) {
        //익명 이너 클래스
        A a1 = new A() {
            @Override
            public B abc(int k) {
                return new B(3);
            }
        };

        //람다
        A a2 = (int k) -> new B(k);

        A a3 = B::new;                 //함수형 인터페이스은 메서드가 1개이기 때문에 생성자 선택 불가

        a1.abc(3);
        a2.abc(4);
        a3.abc(5);
    }
}

interface A {
    B abc(int k);
}

class B {
    B() {
        System.out.println("B 기본 생성자");
    }
    B(int k) {
        System.out.println("B 사용자 생성자" + k);
    }

}