package array;

import java.util.Scanner;

public class ArrayDemo6 {
    public static void main(String[] args) {
        /*
        需求：已知数组元素为{33,5,22,44,55,33}
        键盘录入任意一个数据，查找这个数据在数组中是否存在
        如果数组中要查找的数据出现多次，只要显示第一次的索引即可
        输出要求：
        如果存在,打印索引;如果不存在，提示：“该数据不存在”
         */
        int[] arr = {33, 5, 22, 44, 55, 33};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数字：");
        int number = sc.nextInt();
        boolean exist = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println(i);
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println("该数据不存在");
        }


    }
}
