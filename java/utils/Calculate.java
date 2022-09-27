package utils;

public class Calculate {
    public static int getMax(int[] nums) {
        int max;
        int result1;
        max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        result1 = max;
        return result1;
    }

    public static int getMin(int[] nums) {
        int min;
        int result2;
        min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        result2 = min;
        return result2;
    }

    public static int getSumOfArrayElements(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static int getAverarage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }


}
