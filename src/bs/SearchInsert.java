package org.oooooomy.bs;

/**
 * 35. 搜索插入位置
 */
public class SearchInsert {

    public static void main(String[] args) {
        System.out.println(SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            //整数可能溢出，(right + left) / 2 和 left + (right - left) / 2 数学上是等价的
            mid = (right + left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

//    public static int searchInsert(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        int mid;
//        while (left <= right) {
//            mid = (right + left) / 2;
//            if (nums[mid] < target) {
//                left = mid + 1;
//            } else if (nums[mid] > target) {
//                right = mid - 1;
//            } else {
//                return mid;
//            }
//        }
//        return 0;
//    }

}
