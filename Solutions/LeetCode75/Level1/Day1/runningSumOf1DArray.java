package Solutions.LeetCode75.Level1.Day1;

import java.util.Arrays;

public class runningSumOf1DArray {

    public int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];
        int temp = 0;
        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    temp = nums[i];
                    result[i] = temp;
                } else {
                    temp += nums[i];
                    result[i] = temp;
                }
            }
        } else {
            return nums;
        }
        return result;
    }

    public static void main(String[] args) {
        runningSumOf1DArray solution = new runningSumOf1DArray();
        int[] arr = {1,2,3,4};
        int[] result = solution.runningSum(arr);
        for (int r : result){
            System.out.println(r);
        }
    }

}
