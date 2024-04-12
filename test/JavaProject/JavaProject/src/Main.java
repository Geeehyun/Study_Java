import net.javafullstack.Common.CommonUtil;

public class Main {
    public static void main(String[] args) {
        CommonUtil utils = new CommonUtil();

        int prevMenuNo = 1;
        int nowMenuNo = 1;
        do {
            utils.displayMenu(prevMenuNo, nowMenuNo);
            nowMenuNo = utils.getInputMenu();
        } while (true);
    }
}