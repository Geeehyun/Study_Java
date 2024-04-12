//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();
        E e = new E();
        int sumTotal = 0;
        for(int i = 1; i <= 10; i+=2) {
            sumTotal += c.sum(i,i+1);
        }
        System.out.println(sumTotal);

        int minTotal = 0;
        for(int i = 1; i <= 10; i+=2) {
            if(i == 1) {
                minTotal += d.mul(i,i+1);
            } else {minTotal += d.mul(-i,i+1);}
        }
        System.out.println(minTotal);

        long mulTotal = 1;
        for(int i = 1; i <= 10; i+=2) {
            mulTotal *= e.sum(i,i+1);
        }
        System.out.println(mulTotal);

        int divTotal = 1;
        for(int i = 2; i <= 10; i++) {
            divTotal /= e.mul(i,1);
        }
        System.out.println(divTotal);
    }
}

interface A {
    public static final int a = 0;
    public static final int b = 0;
    public abstract int sum(int a, int b);
}

interface B {
    int a = 1;
    int b = 1;
    int mul(int a, int b);
}

class C implements A {
    @java.lang.Override
    public int sum(int a, int b) {
        return a + b;
    }
}

class D implements B {
    @java.lang.Override
    public int mul(int a, int b) {
        return (a - b);
    }
}

class E implements A,B {
    @java.lang.Override
    public int sum(int a, int b) {
        return a * b;
    }

    @java.lang.Override
    public int mul(int a, int b) {
        return a / b;
    }
}