package utils;

public class Printer {
    public static void printStars() {
        String star = "* ";
        for (int i = 0; i < 5; i++) {
            System.out.println(star);
            star = star + "* ";
        }
    }

    public static void checkNumbers(int x, int y, int z) {
        int count = 0;
        if (x > 0) {
            count++;
        }
        if (y > 0) {
            count++;
        }
        if (z > 0) {
            count++;
        }
        switch (count) {
            case 0:
                System.out.println("bad");
                break;
            case 1:
                System.out.println("fine");
                break;
            case 2:
                System.out.println("good");
                break;
            case 3:
                System.out.println("excellent");
                break;
        }
    }
}
