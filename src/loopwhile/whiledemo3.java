package loopwhile;

public class whiledemo3 {
    public static void main(String[] args) {
        /*
        在银行投资100000元，复利1.7%，求多少年可以翻倍
         */
        double money = 100000;
        int year = 0;
        while (money <= 200000) {
            money *= 1.017;
            year++;
        }
        System.out.println("需要" + year + "年");
    }
}
