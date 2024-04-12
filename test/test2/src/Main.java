public class Main {
    public static void main(String[] args) {
//        Ex ex = new Ex();
//        int c = ex.sum(10,20);
//        System.out.println(c);
//
//        int d = ex.min(200, 300);
//        System.out.println(d);
//
//        long e = ex.mul(8,9);
//        System.out.println(e);
//
//        double f = ex.div(10,3);
//        System.out.println(f);

        Gugudan gugudan = new Gugudan();
//        gugudan.play();
        int[][] test = gugudan.play2();
        gugudan.play3(test);
        gugudan.play4(test);
    }
}

class Ex {
    int sum(int a, int b) {
        return a + b;
    }
    int min(int a, int b) {
        return a - b;
    }
    long mul(int a, int b) {
        return (a * b);
    }
    double div(float a, float b) {
        return a / b;
    }
}

class Gugudan {
//    void play(int maxDan) {
//        for(int i = 0; i < maxDan; i++) {
//
//        }
//    }

    void play() {
        System.out.println();
        for(int i = 1; i < 10; i++) {
            if(i == 1) {
                for(int k = 2; k < 6; k++) {
                    System.out.printf("%d단              ",k);
                }
                System.out.println();
                for(int k = 6; k < 10; k++) {
                    System.out.print("--------        ");
                }
                System.out.println();
            }
            for(int j = 2; j < 6; j++) {
                System.out.printf("%d X %d = %2d      ", j, i, i*j);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1; i < 10; i++) {
            if(i == 1) {
                for(int k = 6; k < 10; k++) {
                    System.out.printf("%d단              ",k);
                }
                System.out.println();
                for(int k = 6; k < 10; k++) {
                    System.out.print("--------        ");

                }
                System.out.println();
            }
            for(int j = 6; j < 10; j++) {
                System.out.printf("%d X %d = %2d      ", j, i, i*j);
            }
            System.out.println();
        }
    }
    int[][] play2() {
        int[] arrLength = {5, 3, 6, 4, 7, 2, 8, 9};
        int rows = arrLength.length;
        int[][] gugudan = new int [rows][];

        for(int i = 0; i < rows;i++) {
            gugudan[i] = new int [arrLength[i]];
            for (int j = 0; j < arrLength[i]; j++){
                gugudan[i][j] = (i+2) * (j+1);
            }
        }

//        for(int i = 0; i < gugudan.length; i++){
//            for(int j = 0; j < gugudan[i].length; j++) {
//                System.out.printf("%d X %d = %d \n",i+2, j+1, gugudan[i][j]);
//            }
//        }
        return gugudan;
    }

    void play3(int[][] arr) {
        int[] arrLength = {5, 3, 6, 4, 7, 2, 8, 9};
        int max = 0;
        for (int i : arrLength) {
            if(i>max) {max = i;}
        }

        for(int i = 0; i < max; i++){
            for(int j = 0; j < 4; j++) {
                if(i == 0 && j == 0) {
                    for(int k = 2; k < 6; k++) {
                        System.out.printf("  %d 단",k);
                        System.out.print("              ");
                    }
                    System.out.println();
                    for(int k = 2; k < 6; k++) {
                        System.out.print("---------");
                        System.out.print("          ");
                    }
                    System.out.println();
                }
                try {
                    System.out.printf("%d X %d = %2d         ",j+2,i+1,arr[j][i]);
                } catch(Exception e){
                    System.out.print("                   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < max; i++){
            for(int j = 4; j < 8; j++) {
                if(i == 0 && j == 4) {
                    for(int k = 6; k < 10; k++) {
                        System.out.printf("  %d 단",k);
                        System.out.print("              ");
                    }
                    System.out.println();
                    for(int k = 6; k < 10; k++) {
                        System.out.print("---------");
                        System.out.print("          ");
                    }
                    System.out.println();
                }
                try {
                    System.out.printf("%d X %d = %2d         ",j+2,i+1,arr[j][i]);
                } catch (Exception e) {
                    System.out.print("                   ");
                }

            }
            System.out.println();
        }
        System.out.println("-------------------------↑try-catch문-------------------------------------");
        System.out.println();
    }


    void play4(int[][] arr) {

        System.out.println("-----------------------------↓if문----------------------------------------");
        int[] arrLength2 = {5, 3, 6, 4, 7, 2, 8, 9};
        int max2 = 0;
        for (int i : arrLength2) {
            if(i>max2) {max2 = i;}
        }
        int column = (int) (arr.length / 2);

        for(int i = 0; i < max2; i++){
            for(int j = 0; j < column; j++) {
                if(i+1 > arr[j].length) {
                    System.out.print("                   ");
                } else if(j == 0 && i== 0) {
                    System.out.printf("  %d단                %d단                %d단                %d단              \n",j+2,j+3,j+4,j+5);
                    System.out.println("---------          ---------          ---------          ---------          ");
                    System.out.printf("%d X %d = %2d         ",j+2,i+1,arr[j][i]);
                } else {
                    System.out.printf("%d X %d = %2d         ",j+2,i+1,arr[j][i]);
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < max2; i++){
            for(int j = column; j < column*2; j++) {
                if(i+1 > arr[j].length) {
                    System.out.print("                   ");
                } else if (j == column && i ==0) {
                    System.out.printf("  %d단                %d단                %d단                %d단              \n",j+2,j+3,j+4,j+5);
                    System.out.println("---------          ---------          ---------          ---------          ");
                    System.out.printf("%d X %d = %2d         ",j+2,i+1,arr[j][i]);
                } else {
                    System.out.printf("%d X %d = %2d         ",j+2,i+1,arr[j][i]);
                }
            }
            System.out.println();
        }
    }
}