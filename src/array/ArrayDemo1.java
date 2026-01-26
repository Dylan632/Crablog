package array;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // age
        int[] ageArr1 = new int[] {18, 19, 20};
        int[] ageArr2 = {18, 19, 20};
        System.out.println(Arrays.toString(ageArr1));

        //height
        double[] heightArr1 = new double[] {199.0, 158.8, 176.5};
        double[] heightArr2 = {199.0, 158.8, 176.5};
        System.out.println(Arrays.toString(heightArr1));


        //name
        String[] nameArr1 = new String[] {"张三", "李四", "王五"};
        String[] nameArr2 = {"张三", "李四", "王五"};
        System.out.println(Arrays.toString(nameArr1));

    }
}
