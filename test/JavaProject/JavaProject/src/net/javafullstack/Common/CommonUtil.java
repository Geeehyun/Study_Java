package net.javafullstack.Common;

import java.util.Scanner;

public class CommonUtil {

    public void displayMenu(int prevMenuNo, int nowMenuNo) {
//        String[][] arrMenu = {
//                {"1 : Home", "2 : About Me", "3 : Posts", "4 : Contact", "5 : LogIn"},
//                {"31 : 이전 글", "32 : 다음 글", "33 : 전체 글", "34 : 이전 메뉴"}
//        };

        String[] arrMenu1 = {"1 : Home", "2 : About Me", "3 : Posts", "4 : Contact", "5 : LogIn"};
        String[] arrMenu2 = {"31 : 이전 글", "32 : 다음 글", "33 : 전체 글", "34 : 이전 메뉴"};

        if(nowMenuNo < 10 || nowMenuNo == 99) {
            if(nowMenuNo == 3) {
                for (String no : arrMenu2) {
                    System.out.println((no.split(" : ")[0].equals(String.valueOf(nowMenuNo)))? no + " <<" : no);
                }
            } else {
                for (String no : arrMenu1) {
//                    System.out.println((no.equals(String.valueOf(nowMenuNo)))? no + " <<" : no);
                    System.out.println((no.split(" : ")[0].equals(String.valueOf(nowMenuNo)))? no + " <<" : no);
                }
            }
        } else {
            for (String no : arrMenu2) {
//                System.out.println((no.equals(String.valueOf(nowMenuNo)))? no + " <<" : no);
                System.out.println((no.split(" : ")[0].equals(String.valueOf(nowMenuNo)))? no + " <<" : no);
            }
        }

        System.out.println("메뉴를 선택하세요. : ");

    }
    public int getInputMenu() {
        Scanner scanner = new Scanner(System.in);
        String menuNo = scanner.next();
        int rtnMenuNo = (!menuNo.isEmpty() && menuNo != null) ? Integer.parseInt(menuNo) : 1 ;
        if(rtnMenuNo < 1) System.exit(0);
        return rtnMenuNo;
    }
}