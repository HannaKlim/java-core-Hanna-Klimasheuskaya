package utils;

import java.util.Random;

public class RandomData {
    public static int[] generateArray() {
        int[] nums = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            nums[i] = r.nextInt();
        }
        return nums;
    }
}