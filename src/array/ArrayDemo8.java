package array;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo8 {
    static void main() {
        /*
        需求：已知数组元素为{1,2,3,4,5,6,7,8,9,10}
        要求：打乱数组中的数据
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
