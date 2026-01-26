package loopfor;

import java.util.Scanner;

public class fordemo8 {
    public static void main(String[] args) {
        /*
        S(n) = 1 - 2 + 3 - 4 + ...;
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入前n项中的‘n’");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            }
            else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
