package utils;

public class Check {
    public static boolean isOdd(int a) {
        int k = a % 2;
        return k == 0;
    }

    public static boolean isDevidedByThree(int a) {
        int k = a % 3;
        return k == 0;
    }


    public static boolean isDevidedByFiveAndSeven(int a) {
        int k = a % 5;
        int m = a % 7;
        return (k == 0) & (m == 0);
    }
}
