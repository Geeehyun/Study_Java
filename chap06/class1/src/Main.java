//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class A {
    int m = 3;
    void print() {
        System.out.println("클래스 테스트");
    }
}


public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.m = 5;
        System.out.println(a.m);
        a.print();
    }
}