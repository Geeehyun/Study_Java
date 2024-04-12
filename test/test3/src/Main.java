//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        A a1 = new A();
//        System.out.println();
//        A a2 = new A(1);
//        System.out.println();
//
//        a1.printHello(2);
//        System.out.println();
//        a2.printHello(3);
//
//        final int b;
//        int a = 5;
//
//
//        b = 4;

        A aa = new A();
        A ab = new B();
        System.out.println(aa instanceof A);   // true
        System.out.println(aa instanceof B);   // false
        System.out.println(ab instanceof B);   // true
        System.out.println(ab instanceof A);   // true
    }
}


class A {
    String a = "안녕하세요!";
    void printHello(int a) {
        System.out.println(this.a);
        System.out.println(a + "번째 방문입니다.");
    }

    A() {
        System.out.println("첫번째 생성자!");
    }
    A(int a) {
        this();
        System.out.println("두번째 생성자!");
    }
}

class B extends A {
    @Override
    void printHello(int a) {

    }
}