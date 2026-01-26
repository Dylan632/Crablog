package operator;

import java.util.Scanner;

public class OperatorDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入A的身高：");
        double A_height = sc.nextDouble();
        System.out.println("请输入B的身高：");
        double B_height = sc.nextDouble();

        Boolean result = A_height > B_height;
        System.out.println(result);
    }
}
