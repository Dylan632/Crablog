package array;

public class ArrayDemo11 {
    static void main() {
        /*
        给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为目标值target的
        那两个整数，并输出它们的数组索引。
        提示：先不用考虑效率问题，两层循环即可完成
        要求2：输出所有满足要求的情况
         */
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }

    }
}
