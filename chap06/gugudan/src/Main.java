import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[][] guguArr = new int[8][9];
        int dan = 2;
        int multiple;

        for(int i = 0; i < 8; i++) {
            multiple = 1;
            for (int j = 0; j < 9; j++) {
                guguArr[i][j] = dan * multiple;
                multiple ++;
            }
            dan++;
        }


//        for(int i = 2; i < 6; i++) {
//            System.out.printf("  %d 단",i);
//            System.out.print("           ");
//        }
//        System.out.println();
//        for(int i = 2; i < 6; i++) {
//            System.out.print("---------");
//            System.out.print("       ");
//        }
//        System.out.println();
//        for(int i = 0; i < guguArr.length; i++) {
//            for(int j = 0; j < guguArr[i].length; j++) {
//                System.out.printf("%d X %d = %2d         ",i+2,j+1,guguArr[i][j]);
//            }
//            System.out.println();
//        }
//        for(int i = 0; i < guguArr[0].length; i++){
//            for(int j = 0; j < 4; j++) {
//                System.out.printf("%d X %d = %2d         ",j+2,i+1,guguArr[j][i]);
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for(int i = 0; i < guguArr[0].length; i++){
//            for(int j = 4; j < 8; j++) {
//                System.out.printf("%d X %d = %2d         ",j+2,i+1,guguArr[j][i]);
//            }
//            System.out.println();
//        }

//        System.out.println("----------------------------");
//
//        int[][] guGuDan2 = new int[8][];
//        int[] length = {5, 3, 6, 4, 7, 2, 8, 9};
//        for(int i = 0; i < guGuDan2.length; i++) {
//            int[] tempArr = new int [length[i]];
//            for(int j = 0; j < length[i]; j++) {
//                tempArr[j] = (i+2) * (j+1);
//            }
//            guGuDan2[i] = tempArr;
//        }
//        for(int[] i : guGuDan2) {
//            System.out.println(Arrays.toString(i));
//        }

        System.out.println("----------------------------");

        int[][] guGuDan3 = new int[8][];
        int[] length2 = {5, 3, 6, 4, 7, 2, 8, 9};
        for(int i = 0; i < guGuDan3.length; i++) {
            guGuDan3[i] = new int[length2[i]];
            for(int j = 0; j < length2[i]; j++) {
                guGuDan3[i][j] = (i+2) * (j+1);
            }
        }
        for(int[] i : guGuDan3) {
            System.out.println(Arrays.toString(i));
        }

        System.out.println("----------------------------");

        for(int i = 0; i < guGuDan3.length; i++){
            for(int j = 0; j < guGuDan3[i].length; j++) {
                System.out.printf("%d X %d = %d \n",i+2, j+1, guGuDan3[i][j]);
            }
        }

        System.out.println("----------------------------");

        int dan2 = 2;
        int multiple2;
        for(int[] i : guGuDan3) {
            multiple2 = 1;
            for(int j : i){
                System.out.printf("%d X %d = %d \n",dan2, multiple2, j);
                multiple2++;
            }
            dan2++;
        }



//        System.out.println("----------------------------");
//        int dan2 = 2;
//        for(int[] i : guguArr) {
//            multiple = 1;
//            for(int j : i) {
//                System.out.printf("%d X %d = %d \n",dan2,multiple,j);
//                multiple++;
//            }
//            dan2++;
//        }

//        for(int i = 2; i < 6; i++) {
//            System.out.printf("  %d 단",i);
//            System.out.print("           ");
//        }
//        System.out.println();
//        for(int i = 2; i < 6; i++) {
//            System.out.print("---------");
//            System.out.print("       ");
//        }
//        System.out.println();
//        for(int i = 1; i < 10; i++) {
//            for(int j = 2; j < 6; j++) {
//                System.out.printf("%d x %d = %d",j,i,j*i);
//                if((j*i)>10 && i != 5) {
//                    System.out.print("      ");
//                } else if(i == 5) {
//                    System.out.print("      ");
//                } else {
//                    System.out.print("       ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for(int i = 6; i < 10; i++) {
//            System.out.printf("  %d 단",i);
//            System.out.print("           ");
//        }
//        System.out.println();
//        for(int i = 2; i < 6; i++) {
//            System.out.print("---------");
//            System.out.print("       ");
//        }
//        System.out.println();
//        for(int i = 1; i < 10; i++) {
//            for(int j = 6; j < 10; j++) {
//                System.out.printf("%d x %d = %d",j,i,j*i);
//                if((j*i)>10) {
//                    System.out.print("      ");
//                } else {
//                    System.out.print("       ");
//                }
//            }
//            System.out.println();
//        }
    }
}