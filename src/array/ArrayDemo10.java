package array;

import java.util.Arrays;

public class ArrayDemo10 {
    static void main() {
        /*
        给定义一个递增有序数组，去除其中重复元素
        慢指针：存入的位置
        快指针：找不重复的数据
        相等,舍弃快指针位置的数据
        不等,快指针的数据存入慢指针位置
         */
        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3};
        int slowindex = 0;
        for (int fastindex = 1; fastindex < arr.length; fastindex++) {
            if (arr[slowindex] != arr[fastindex]) {
                slowindex++;
                arr[slowindex] = arr[fastindex];
            }
        }
        for (int i = slowindex + 1; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
