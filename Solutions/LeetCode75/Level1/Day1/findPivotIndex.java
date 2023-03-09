package Solutions.LeetCode75.Level1.Day1;

import java.util.Arrays;

public class findPivotIndex {

    public int pivotIndex(int[] nums) {
        int total = 0;
        int leftSum = 0;
        for (int n : nums) {
            total += n;
        }
        int rightSum = total;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                leftSum += nums[i-1];
            }
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        findPivotIndex solution = new findPivotIndex();
        int result = solution.pivotIndex(new int[]{1,2,3});
        System.out.println(result);
    }
}
