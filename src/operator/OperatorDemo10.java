package operator;


import java.util.Scanner;

public class OperatorDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int number = sc.nextInt();

        //判断数字是否在1~10之间
        boolean result = number >= 1 && number <= 10;
        System.out.println(result);
    }
}
