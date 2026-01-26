package array;

import java.util.Arrays;

public class ArrayDemo12 {
    static void main() {
        /*
        给你两个有序数组arr1和arr2
        将两个数组中的数据合并到一个大数组中。
        要求：合并之后的大数组也是有序的
        举例1:
        arrl:13579
        arr2:246810
        arr3:12 345 678 9 10
         */
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr3 = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arr3.length; i++) {
            // 避免越界：先检查索引是否有效
            if (index1 >= arr1.length) {
                // arr1 已遍历完，直接取 arr2 的元素
                arr3[i] = arr2[index2];
                index2++;
            } else if (index2 >= arr2.length) {
                // arr2 已遍历完，直接取 arr1 的元素
                arr3[i] = arr1[index1];
                index1++;
            } else if (arr1[index1] < arr2[index2]) {
                arr3[i] = arr1[index1];
                index1++;
            } else {
                arr3[i] = arr2[index2];
                index2++;
            }
        }
        
        // 打印结果
        System.out.print("合并后的数组: ");
        System.out.println(Arrays.toString(arr3));
    }
}
