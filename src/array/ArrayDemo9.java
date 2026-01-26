package array;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo9 {
    static void main() {
        /*
        需求：获取10个1-100之间的随机数并存入到数组当中，要求保证数据是唯一的
         */
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(1, 101);
            arr[i] = number;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
