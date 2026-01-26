package controllerloop;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(101);


        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数字：");
            int gnumber = sc.nextInt();
            if (gnumber == n) {
                System.out.println("恭喜你猜对了");
                break;
            } else if (gnumber > n) {
                System.out.println("你猜的数字太大了");
            } else {
                System.out.println("你猜的数字太小了");
            }
        }

    }
}
