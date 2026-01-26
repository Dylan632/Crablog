package operator;

import java.util.Scanner;

public class OperatorDemo9 {
    public static void main(String[] args) {
        //判断数字是否可以被3整除
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();

        //拆分
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100;

        //求和
        int sum = ge + shi + bai;

        //判断
        boolean result = sum % 3 == 0;
        System.out.println(result);

    }
}
