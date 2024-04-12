public class CommonUtil {
    public String displayMenu() {
        String[] arrMenu = {"1 : Home", "2 : About me", "3 : Posts", "4 : Contact", "5 : Login"};
        for(String i : arrMenu) {
            System.out.println(i);
        }
        System.out.println("메뉴를 선택하세요. : ");
        int rtnMenuNo = 0;
        System.out.println(arrMenu[(int)rtnMenuNo -1]);
        return arrMenu[rtnMenuNo];
    }
}
