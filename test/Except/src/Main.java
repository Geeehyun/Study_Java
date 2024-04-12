public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.bcd_1();
        a.bcd_2();
    }
}

class MyException extends Exception {
    public MyException() {
        super();
    }
    public MyException(String msg) {
        super(msg);
    }
}

class MyRunTimeException extends RuntimeException {
    public MyRunTimeException() {
        super();
    }
    public MyRunTimeException(String msg) {
        super(msg);
    }
}

class A {
    MyException myException1 = new MyException();
    MyException myException2 = new MyException("메시지 : MyException");

    MyRunTimeException myRunTimeException1 = new MyRunTimeException();
    MyRunTimeException myRunTimeException2 = new MyRunTimeException("메시지 : MyRunTimeException");

    void abc_1(int num) {
        try {
            if(num > 70) {
                System.out.println("정상작동 abc_1 : ");
            } else {  //예외 던지는 시점에 바로 예외 발생
                throw myException1;
            }
        }  catch (MyException e) {
            System.out.println("예외처리 1 : ");
            e.printStackTrace();
        }
    }

    void bcd_1() {
        abc_1(60);
    }

    void abc_2(int num) throws MyException {
        if(num > 70) {
            System.out.println("정상동작 abc_2 : ");
        } else {
            throw myException1;
        }
    }

    void bcd_2() {
        try {
            abc_2(80);
        } catch (MyException e) {
            System.out.println("예외처리 2 : ");
            e.printStackTrace();
        }
    }
}