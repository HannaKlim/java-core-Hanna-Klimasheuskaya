import phone.Phone;
import utils.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    //Task 1
    public static void main(String[] args) {
        int[] array = RandomData.generateArray();
        for (int i = 0; i < 100; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();

        //Task 2
        System.out.println(Check.isOdd(8));
        System.out.println(Check.isDevidedByThree(6));
        System.out.println(Check.isDevidedByFiveAndSeven(10));
        System.out.println();

        //Task 3

        int max = Calculate.getMax(array);
        int min = Calculate.getMin(array);
        int sum = Calculate.getSumOfArrayElements(array);
        int average = Calculate.getAverarage(max, min, sum);

        System.out.println("Largest value from array elements: " + max);
        System.out.println("The smallest value of the array elements: " + min);
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of numbers: " + average);
        System.out.println();

        //Task 4
        System.out.println(MyTime.getTimeInHoursMinutesSeconds(51));
        System.out.println();


        //Task 5
        System.out.println(Geometry.getRoots(1, -6, 9));
        System.out.println();

        //Task 6
        System.out.println("The hypotenuse of a triangle is " + test.math.Geometry.getHyp(3, 4));
        System.out.println();

        //Task 7
        Printer.printStars();
        System.out.println();

        //Task 8
        Printer.checkNumbers(1, -2, 4);
        System.out.println();

        //Task 9
        Phone phone1 = new Phone(1, "Xiaomi", 230);
        Phone phone2 = new Phone(2, "Samsung", 180);
        Phone phone3 = new Phone(3, "IPhone", 210);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        String name = "Mike";
        String number = "+37529 555 55 55";
        Phone.receiveCall(name);
        Phone.getNumber(number);
        Phone.receiveCall(name, number);


    }
}
