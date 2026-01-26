package loopfor;

import java.util.Scanner;

public class fordemo6 {
    public static void main(String[] args) {
        /*
        需求：键盘录入两个数字，表示一个范围。
        统计这个范围中。
        既能被3整除，又能被5整除数字有多少个？
        累加思想：
        数字 --->sum
        统计思想：
        count--->满足条件++
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();

        int min = num1 < num2 ? num1 : num2;
        int max = num1 > num2 ? num1 : num2;

        int count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("在" +min + "~" + max + "之间没有满足条件的数字");
        } else {
            System.out.println("在" + min + "~" + max + "之间存在" + count + "个满足条件的数字");
        }
    }
}
