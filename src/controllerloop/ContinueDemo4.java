package controllerloop;

import java.util.Scanner;

public class ContinueDemo4 {
    public static void main(String[] args) {
        /*
        循环打印1~n之间的数字，但如果数字包含4或者是4的倍数时，跳过
        n满足1 <= n <= 100000
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n：");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // 检查是否是4的倍数
            if (i % 4 == 0) {
                continue;
            }
            // 检查数字是否包含4
            if (containsDigit(i, 4)) {
                continue;
            }
            System.out.println(i);
        }
    }

    /**
     * 检查数字num是否包含指定的数字digit
     */
    public static boolean containsDigit(int num, int digit) {
        while (num > 0) {
            if (num % 10 == digit) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
