package utils;

public class Geometry {
    public static String getRoots(int a, int b, int c) {
        double d = 0;
        String result = null;

        d = (b * b) - (4 * a * c);
        if (d < 0) {
            result = "The quadratic equation " + a + " * x^2 + " + b + " * x " + c + " = 0 has no roots";
        } else {
            if (d == 0) {
                int x = -b / (2 * a);
                result = "The roots of the quadratic equation " + a + " * x^2 + " + b + " * x " + c + " = 0 are x1 = x2 = " + x;

            } else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                result = "The roots of the quadratic equation " + a + " * x^2 + " + b + " * x " + c + " = 0 are x1 = " + x1 + ", x2 = " + x2;

            }

        }
        return result;
    }
}