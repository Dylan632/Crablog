package array;

public class ArrayDemo13 {
    public static void main(String[] args) {
        /*
        给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引。
        如果目标值不存在于数组中，打印应插入的位置
        举例1:
        数据:nums=[1,3,5,6];
        target =5
        输出：2
        举例2:
        数据：nums =[1,3,5,6], target = 2
        输出：1
        举例3:
        数据：nums =[1,3,5,6], target = 7
        输出：4
         */
        int[] nums = {1, 3, 5, 6};
        
        // 测试用例
        System.out.println("target=5 的位置: " + searchInsert(nums, 5));  // 输出: 2
        System.out.println("target=2 的位置: " + searchInsert(nums, 2));  // 输出: 1
        System.out.println("target=7 的位置: " + searchInsert(nums, 7));  // 输出: 4
    }
    
    /**
     * 二分查找：查找目标值的索引或应插入的位置
     * @param nums 有序数组
     * @param target 目标值
     * @return 目标值的索引或应插入的位置
     * 核心原则：main 方法是程序入口，返回类型必须是 void。需要返回值的逻辑应该封装到单独的方法中。
     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
