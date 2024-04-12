//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int[] arr1 = new int[]{1, 2, 3, 4, 5};
////        for(int i = 0; i < arr1.length; i++) {
////            System.out.println(arr1[i]);
////        }
//        arr1[1] = 4;
//        arr1[2] = 5;
//        for (int i : arr1) {
//            System.out.println(i);
//        }
//
//        int[][] arr2 = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
//        for(int i = 0; i < arr2.length; i++) {
//            for(int j = 0; j < arr2.length; j++) {
//                System.out.print(arr2[i][j]);
//            }
//        }

//        int[][] arr3 = new int[3][];
//        arr3[0] = new int[] {1,2,3};
//        arr3[1] = new int[] {4,5,6,7};
//        arr3[2] = new int[] {9,10};
//
//        for(int i = 0; i < arr3.length; i++) {
//            for (int j = 0; j < arr3[i].length; j++) {
//                System.out.print(arr3[i][j]);
//            }
//            System.out.println();
//        }

        String text = "https://cafe.naver.com/ca-fe/town-talks//dfwefefefd";
        String target = "town-talks";
        String temp;
        temp = text.substring(text.indexOf("//")+2);
        System.out.println(temp);
        temp = temp.substring(temp.indexOf('/')+1);
        System.out.println(temp);
        temp = temp.substring(temp.indexOf('/')+1);
        System.out.println(temp);
        temp = temp.substring(0,temp.indexOf('/')-1);
        System.out.println(temp);
//        temp = text.substring(0, text.lastIndexOf('/')-1);
//        System.out.println(temp);
//        temp = temp.substring(temp.lastIndexOf('/')+1);
//        System.out.println(temp);

    }
}