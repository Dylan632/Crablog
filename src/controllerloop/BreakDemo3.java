package controllerloop;

import java.util.Scanner;

public class BreakDemo3 {
    public static void main(String[] args) {
        /*
        键盘录入一个大于等于2的整数，判断其是否为质数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数：");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("输入的整数小于2，请重新输入");
        } else {
            boolean flag = true;
            int sqrtN = (int) Math.sqrt(n);
            if (n == 2) {
                // 2是质数
            } else if (n % 2 == 0){
                flag = false; // 大于2的偶数不是质数
            } else {
                for (int i = 3; i <= sqrtN; i += 2){
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                System.out.println(n + "是质数");
            } else {
                System.out.println(n + "不是质数");
            }
        }
    }
}
