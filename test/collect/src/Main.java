import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List list1 = new ArrayList();     //<E> 제네릭 타입을 생략해 줌으로써 Object로 받게되서 모든 값을 다 받을 수 있게 됨.
//        List<Object> list1 = new ArrayList<Object>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add("바보");
        list1.add(6,6);
//        System.out.println(list1.toString());

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
//        System.out.println(list2.toString());

        //문제
        int[] a = new int[] {1,2,3,4,5,6,7,8};
        int temp = 0;
        int temp2 = 0;
        for(int i = 5; i < a.length; i++ ) {
            if(i == 5) {
                temp = a[i];
                a[5] = 10;
            } else { temp = temp2;}
            if (i < a.length-1) {
                temp2 = a[i+1];
                a[i+1] = temp;
            }
        }
//        System.out.println(Arrays.toString(a));

        //리스트로 풀어보기
        List<Integer> list3 = new ArrayList<Integer>();
        for (int i = 1; i <= 3; i++) {
            list3.add(i);
        }

        list3.set(1,5);
        list3.add(6);
        list3.add(1,2);
        list3.remove(0);
        list3.remove(new Integer(6));            //값으로 삭제 new 랩퍼클래스(값) 형태로 작성 필요 => 객체 형태여야해서?
        System.out.println("클리어 전");
        System.out.println(list3);
        System.out.println("list3 : "+ list3 + " | isEmpty : " + list3.isEmpty() + " | null : " + (list3 == null) + " | list size : " + list3.size());


        list3.clear();
        System.out.println("클리어 후");
        System.out.println(list3);
        System.out.println("list3 : "+ list3 + " | isEmpty : " + list3.isEmpty() + " | null : " + (list3 == null) + " | list size : " + list3.size());

        for (int i = 1; i <= 3; i++) {
            list3.add(i);
        }

        for (int i = 0; i < list3.size(); i++) {
            System.out.println(i + "번째 요소 : " + list3.get(i));
        }

        for (int i : list3) {
            System.out.println(i);
        }


        Object[] oList = list3.toArray();
        System.out.println(Arrays.toString(oList));

        Integer[] int1 = list3.toArray(new Integer[0]);       //원래 크기보다 작은 사이즈로 설정하는건 상관이 없나봐용
        System.out.println("int1 " + Arrays.toString(int1));

        Integer[] int2 = list3.toArray(new Integer[5]);
        System.out.println("int2 " + Arrays.toString(int2));
    }
}

