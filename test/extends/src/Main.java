import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Gugudan gugu = new Gugudan();
//        int[][] dan2 = gugu.dan(1);
//        gugu.printDan(dan2);
//
//        ChildGugudan1 gugu2to5 = new ChildGugudan1();
//        int[][] dan2to5 = gugu2to5.dan(4);
//        gugu2to5.printDan(dan2to5);
//
//        ChildGugudan2 gugu6to9 = new ChildGugudan2();
//        int[][] dan6to9 = gugu6to9.dan(4);
//        gugu2to5.printDan(dan6to9);

        Multiple multiple = new Multiple();
        int test = multiple.mul(2,4);
        int[][] test2 = new int[1][1];
        test2[0][0] = test;
        multiple.printDan(test2);

        GuguSecond guguSecond = new GuguSecond();
        int[][] newGugu = guguSecond.makeGugudan();
        guguSecond.printDan(newGugu);
    }
}

class Gugudan {
    int[] multiple = {1,2,3,4,5,6,7,8,9};
    int[][] dan(int rows) {
        int[][] dan = new int[rows][multiple.length];
        for(int i = 0; i < dan.length; i++) {
            for(int j = 0; j < multiple.length; j++) {
                dan[i][j] = (2+i) * multiple[j];
            }
        }
        return dan;
    }
    void printDan(int[][] dan){
        for(int i = 0; i < dan.length; i++) {
            System.out.printf("    %d단             \n",dan[i][0]);
            System.out.println("-----------         ");
        }
        for(int i = 0; i < multiple.length; i++) {
            for(int j = 0; j < dan.length; j++) {
                System.out.printf("%d X %d = %2d          ",dan[j][0], multiple[i], dan[j][i]);
            }
            System.out.println();
        }
    }
}

class ChildGugudan1 extends Gugudan {

    void printDan(int[][] dan){
        for(int i = 0; i < dan.length; i++) {
            System.out.printf("    %d단             ",dan[i][0]);
            if (i == (dan.length-1)) {
                System.out.println();
                System.out.println("-----------         -----------         -----------         -----------");
            }
        }
        for(int i = 0; i < multiple.length; i++) {
            for(int j = 0; j < dan.length; j++) {
                    System.out.printf("%d X %d = %2d          ",dan[j][0], multiple[i], dan[j][i]);
            }
            System.out.println();
        }
    }
}

class  ChildGugudan2 extends Gugudan {

    int[][] dan(int rows) {
        int[][] dan = new int[rows][multiple.length];
        for(int i = 0; i < dan.length; i++) {
            for(int j = 0; j < multiple.length; j++) {
                dan[i][j] = (6+i) * multiple[j];
            }
        }
        return dan;
    }

    void printDan(int[][] dan){
        for(int i = 0; i < dan.length; i++) {
            System.out.printf("    %d단             ",dan[i][0]);
            if (i == (dan.length-1)) {
                System.out.println();
                System.out.println("-----------         -----------         -----------         -----------");
            }
        }
        for(int i = 0; i < multiple.length; i++) {
            for(int j = 0; j < dan.length; j++) {
                System.out.printf("%d X %d = %2d          ",dan[j][0], multiple[i], dan[j][i]);
            }
            System.out.println();
        }
    }
}

class Multiple {
    int mul(int a, int b) {
        return a * b;
    }

    void  printDan(int[][] e) {
        System.out.println(e[0][0]);
    }
}

class  GuguSecond extends Multiple {
    int[] multiple = {1,2,3,4,5,6,7,8,9};
    int[] dan = {2,3,4,5,6,7,8,9};
    int[][] makeGugudan() {
        int[][] gugudan = new int [dan.length][multiple.length];
        for(int i = 0; i < gugudan.length; i++) {
            for(int j = 0; j < multiple.length; j++){
                gugudan[i][j] = super.mul(dan[i], multiple[j]);
            }
        }
        return gugudan;
    }

    void printDan(int[][] dan) {
        //2~5
        for(int i = 0; i < 4; i++) {
            System.out.printf("    %d단             ",dan[i][0]);
            if (i == 3) {
                System.out.println();
                System.out.println("-----------         -----------         -----------         -----------");
            }
        }
        for(int i = 0; i < multiple.length; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.printf("%d X %d = %2d          ",dan[j][0], multiple[i], dan[j][i]);
            }
            System.out.println();
        }
        //6~9
        for(int i = 4; i < 8; i++) {
            System.out.printf("    %d단             ",dan[i][0]);
            if (i == 7) {
                System.out.println();
                System.out.println("-----------         -----------         -----------         -----------");
            }
        }
        for(int i = 0; i < multiple.length; i++) {
            for(int j = 4; j < 8; j++) {
                System.out.printf("%d X %d = %2d          ",dan[j][0], multiple[i], dan[j][i]);
            }
            System.out.println();
        }
    }
}