package array;

public class ArrayDemo7 {
    static void main() {
        /*
        需求：已知数组元素为{33,5,22,44,55]
        请找出数组中最大值并打印在控制台
         */
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        System.out.println(max);
    }
}
