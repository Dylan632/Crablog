package loopwhile;

import java.util.Scanner;

public class whiledemo5 {
    public static void main(String[] args) {
        /*
        给定一个整数n，请求其数位之和
        若n为负数，请先求绝对值
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        if (n < 0) {
            n = -n;
        }
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
